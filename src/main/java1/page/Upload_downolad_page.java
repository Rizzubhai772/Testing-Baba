package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_library;

public class Upload_downolad_page extends Base_library
{	    String path ="C:\\Users\\Swara\\eclipse\\AutomationFrame_testingbaba\\testdata\\Rizawan Ali _Automation CV.docx";
	public Upload_downolad_page()
	{
		PageFactory.initElements(driver,this);
	}

	 @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]")
     private WebElement element;// initialized the variable for element
	
	 @FindBy(xpath="//*[text()='upload and download']")
     private WebElement uplaodanddownoad;// click upload and downolad
	 
	 @FindBy(xpath="//*[text()='Select a file']")
     private WebElement selectfilechoosefile;
	 // click choose file but it not work due to apllication bug isuue that reason use select file 
     public void clickonelement()
     {
    	 waitforclick(element);
     }
	  public void clickonuploadandownolad()
	  {      uplaodanddownoad.click();
		 // waitforclick(uplaodanddownoad);
	  }
	 
	 public void clickonchoosefile() throws InterruptedException
	 {     selectfilechoosefile.click();
		// waitforclick(selectfilechoosefile);
	     Thread.sleep(2000);
		 uploadfile(path);
		 
	 }
	 
	 
} 
