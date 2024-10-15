package baselibrary;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import applicationutility.Application_utility;
import excelutility.excel_utility;
import propertyutility.property_utility;
import screenshootUtility.Screenshotutility;
public class Base_library implements excel_utility,property_utility,Application_utility,Screenshotutility

{   String path= "C:\\Users\\Swara\\eclipse\\AutomationFrame_testingbaba\\testdata\\exceldata.xlsx";
	public static WebDriver driver;
	public void getlaunch(String browser)
 {       if (browser.equals("chrome"))// cross browsing 
	        {
	          String value="C:\\Users\\Swara\\eclipse\\AutomationFrame_testingbaba\\chromedriver.exe";
		      System.setProperty("webdriver.chrome.driver", value);
		      driver= new ChromeDriver();
		      
	       }  
       else if (browser.equals("edge"))
       {
           String value="C:\\Users\\Swara\\eclipse\\AutomationFrame_testingbaba\\driver\\msedgedriver.exe";
            System.setProperty("webdriver.edge.driver", value);
          driver= new EdgeDriver();
        }
       else if (browser.equals("firefox"))
       {
           String value="";
            System.setProperty("webdriver.firefox.driver", value);
          driver= new FirefoxDriver();
        }
       else if (browser.equals("opera"))
       {
           String value="";
            System.setProperty("webdriver.opera.driver", value);
          driver= new OperaDriver();
        }
		//String value="C:\\Users\\Swara\\eclipse\\AutomationFrame_testingbaba\\chromedriver.exe";
	//	System.setProperty("webdriver.chrome.driver", value);
		//driver= new ChromeDriver();
		driver.get("https://www.testingbaba.com/old"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button" )).click(); // close pop button
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();//open practice
	} 
	public String getreadData( int sheet_no, int row, int colnm) 
	{  
		     String value= "";
		// use code of excel data read
	try
	{
		     FileInputStream fis= new FileInputStream(path);
		     XSSFWorkbook wb= new XSSFWorkbook(fis);	
		     XSSFSheet sheet = wb.getSheetAt(sheet_no);
		     value= sheet.getRow(row).getCell(colnm).getStringCellValue();
	} 
	catch (Exception e) 
	{
	         	 System.out.println("Issue  in  get data read");
	}  
		 
		         return value;
	} 
	@Override
	public String getreddat(String key) throws IOException 
	     {  
		      String value= " ";
		try 
		{
			  FileInputStream fis= new FileInputStream("C:\\Users\\Swara\\eclipse\\AutomationFrame_testingbaba\\testdata\\rizawan.properties");
			  Properties pro= new Properties();
			  pro.load(fis);
			  value=pro.getProperty(key);   
		} 
		catch (Exception e) 
		{
			 System.out.println("issu in file properties file"+e);
		}
		     return value;
	}
	@Override
	public void dubbleclick(WebElement ele)
	{    
	        Actions act = new Actions(driver);
	        act.doubleClick(ele).perform();
	}
	@Override
	public void rightclick(WebElement ele)
	{       Actions act = new Actions(driver);
	        act.contextClick(ele).perform();
		 
	}
	@Override
	public void clickme(WebElement ele)
	{       Actions act = new Actions(driver);
		    act.click(ele).perform();
	}
	@Override
	public void javascriptcommonclick(WebElement ele)
	{  
		    JavascriptExecutor jsexecutor= (JavascriptExecutor) driver;
		    jsexecutor.executeScript(" arguments[0].click()", ele);
	}
	@Override
	public void switchtonewwindows(int index)
	{
		    Set<String> handle= driver.getWindowHandles();
		    ArrayList<String> handles= new ArrayList<String>(handle);
		    driver.switchTo().window(handles.get(index)); 
	}
	@Override
	public void waitforclick(WebElement ele) 
	{
		 WebDriverWait wait= new WebDriverWait(driver, 10);// in explicit time is alwyas in seccond
		 wait.until(ExpectedConditions.elementToBeClickable(ele));
		 ele.click();
	}
	@Override
	public void waitforvisibility(WebElement ele)
	{     WebDriverWait wait = new WebDriverWait(driver, 10);
	      wait.until(ExpectedConditions.visibilityOfAllElements(ele));	 
	}
	@Override
	public void waitforalert() 
	{    WebDriverWait wait = new  WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.alertIsPresent()) ;
	}
	@Override
	public void selectbyvisible_text(WebElement ele, String text)
	{
		 Select sel= new Select(ele);
		 sel.selectByVisibleText(text);
	}
	@Override
	public void selectby_index(WebElement ele, int index) 
	{
		 Select sel= new Select(ele);
		sel.deselectByIndex(index);
	}
	@Override
	public void selectby_vlaue(WebElement ele, String value)
	{
		 Select sel= new Select(ele);
		sel.selectByValue(value);
		 
	}
	@Override
	public void selectalloption(WebElement ele) 
	{    Select sel= new Select(ele);
	     List<WebElement> list =sel.getAllSelectedOptions();
	     System.out.println(list);
		
		
		 
	}
	@Override
	public void uploadfile(String path)
	{
		try {  
			StringSelection sel= new StringSelection(path);
		      Clipboard clip  = Toolkit.getDefaultToolkit().getSystemClipboard(); 
			   clip.setContents(sel, null);
			    
			   Robot rob= new Robot();
			   rob.keyPress(KeyEvent.VK_ENTER);// press the key enter
			   rob.keyRelease(KeyEvent.VK_ENTER);//  relese the enter
			   rob.delay(250);
			   rob.keyPress(KeyEvent.VK_CONTROL);
			   rob.keyPress(KeyEvent.VK_V);
			   rob.keyRelease(KeyEvent.VK_V);
			   rob.keyRelease(KeyEvent.VK_CONTROL);   
			   rob.delay(250);
			   rob.keyPress(KeyEvent.VK_ENTER);// press the key enter
			   rob.keyRelease(KeyEvent.VK_ENTER);//  relese the enter
			
		    } 
		catch (Exception e) 
		{
			 System.out.println(e.getMessage());
		}
		 
	}
	@Override
	public void getscreenshot_utility(String foldername, String filename)
	{  	String location= System.getProperty("user.dir");//set file location in system
	        String path= location+"//screenshoot//" +foldername+"//"+filename+".png";
	        // file save location or file destination type format
			try
			{
			EventFiringWebDriver efw= new EventFiringWebDriver(driver);// class for screenshoot
		    File src= efw.getScreenshotAs(OutputType.FILE) ;
			File dest= new File(path); 
			FileUtils.copyDirectory(src, dest);
			 
	   	}
		 catch (Exception e) 
		 {
			 System.out.println("issue in screenshort utility"+e);
		}

	}
	 @AfterMethod
	 public void getresultstatus_screenshoot(ITestResult result)
	 {/* Itestreulst is called the listner , its is use for check the status os results during
		 the run time . it is interface it is help to customize the report */
		      String filename=   result.getMethod().getMethodName(); 
		 if (result.getStatus()==ITestResult.SUCCESS) 
		 {
			getscreenshot_utility("pass", filename);
		}
		 else if(result.getStatus()==ITestResult.FAILURE)
		 {
			 getscreenshot_utility("fail", filename);
		 }
		 
		 
	 }
	 
	}

 