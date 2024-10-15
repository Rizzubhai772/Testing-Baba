package page;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import baselibrary.Base_library;

public class Loginpage  extends Base_library
{
    public Loginpage()
     {
	PageFactory.initElements(driver, this);
      }
       public void verifyURL()
       {    String url= driver.getCurrentUrl();
    	   System.out.println("The url of this page is :"+url);
       } 
      public void  getverify_title()
      {
    	String title=  driver.getTitle();
    	  System.out.println("the title of page is :"+title);
      }
   
}
