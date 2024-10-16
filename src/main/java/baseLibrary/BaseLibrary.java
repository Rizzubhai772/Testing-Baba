package baseLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

import applicationUtility.ApplicationUtility;
import excelUtility.Excelutility;
import propertyUtility.PropertyUtility;
import screenshotUtility.ScreenshotUtility;
import waitUtility.WaitUtility;

public  class BaseLibrary implements Excelutility , PropertyUtility,WaitUtility,ApplicationUtility,ScreenshotUtility
{
	String path="C:\\Users\\Swara\\eclipse-workspace\\selenium_testing_baba\\Exceldata\\confic.properties";

	//private static final String String = null;
	public static WebDriver driver;
	
	public void getlaunchurl(String url)
	{
	String  value="C:\\Users\\Swara\\eclipse-workspace\\selenium_testing_baba\\driver\\chromedriver1.exe";
	 System.setProperty("webdriver.chrome.driver", value);
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
	}
	@AfterTest
	public void getflush()
	{
	driver.quit();
	}
	@Override
	public String getReaddata(String path, int sheetno, int rowno, int colno) 
	{
		String value="";
		try
		{
				FileInputStream fis=new FileInputStream(path);
				XSSFWorkbook wb= new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);
			value=	sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		return value;
	}
	@Override
	public String getReaddata(String key) 
	{
		String value="";
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		} 
		catch (Exception e) {
			System.out.println("issue in get read data from property file");		}
		return value;
	}
	@Override
	public void waitTime(WebElement ele) 
	{
	try 
	{
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
		
	}
	@Override
	public void switchToTab(int tabindex) 
	{
		Set <String> set =driver.getWindowHandles();
		ArrayList <String> li  = new ArrayList<String>(set);
		driver.switchTo().window(li.get(tabindex));
		
	}
	@Override
	public void waittimeSec(int time) 
	{
		try
		{
			WebDriverWait wait  = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.alertIsPresent());
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	} 
	@Override
	public void getscreenshot(String foldername, String filename) 
	{
		String location=System.getProperty("user.dir");  			  //find project location in system directory
		try 
		{
			String path=location+"//screenshot//"+foldername+"//"+filename+".png"; //set screenshot image path in our project screenshot folder
			EventFiringWebDriver efw=new EventFiringWebDriver(driver); //efd object creation  to execute getscreenshot method 
			File src=efw.getScreenshotAs(OutputType.FILE);			   //capture screenshot & store
			File destination =new File(path);						   // file object creation
			FileUtils.copyFile(src, destination);					   //copy file put in destination
		} catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}
	@AfterMethod
	public void getanalysis(ITestResult result)  //ITesrReslt is a listener interface
	{
		String methodname=result.getMethod().getMethodName();
		try {
			if(result.isSuccess())
			{
				getscreenshot(methodname, "pass");
			}
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				getscreenshot(methodname, "fail");
			}
			else if(result.getStatus()==ITestResult.SKIP)
			{
				getscreenshot(methodname, "skip");
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	}
	@Override
	public void doubleclick(WebElement ele) 
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	@Override
	public void rightclick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();

	}
	@Override
	public void commonjsscript(WebElement ele) 
	{
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("argument[0].click()", ele);
		
	}
	@Override
	public void fileuploading(String path) 
	{
		try 
		{
		StringSelection sl=new StringSelection(path);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(sl, null);
		
		
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} 
	catch (AWTException e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public String getDate() 
	{
		String value="";
		try 
		{
			Date sd=new Date();
			DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
			value=df.format(sd);
		} catch (Exception e) {
			System.out.println("Issue in Date Pick");
		}
		return value;
	}
	@Override
	public String getDateTime() 
	{
		String value="";
		try {
			Date sd=new Date();
			DateFormat df=new SimpleDateFormat("dd-MM-yyyy-hh:mm");
			value=df.format(sd);

		} catch (Exception e)
		{
			System.out.println("Issue in Date Pick");
		}
		return value;
	}
	@Override
	public void mousehoverClick(WebElement ele)
	{	
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	
}
