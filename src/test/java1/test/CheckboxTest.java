package test;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baselibrary.Base_library;
import page.Button_page;
import page.CheckBOXpage;
import page.Textpage_element;
public class CheckboxTest extends Base_library
{
	CheckBOXpage ob2;
	@BeforeTest(groups =  {"smoke", "regression"," sanity"})
	@Parameters("browser")
	   public void launchurl(String browser) 
	{
		getlaunch(browser);
		ob2= new CheckBOXpage();
	}
	 @Test (priority = 1, groups = {"smoke", "regression"," sanity"})
	 public void clickelement()
	 { 
		 ob2.clickonelement();
	 }    
	 @Test(priority = 2,groups = {"smoke"," sanity"}) 
	 public void clickcheckbox()
	 { 	 ob2.clickoncheckboxpage();
	 }
	 @Test (priority = 3,groups = {"regression"," sanity"})
	 public void mobilechecboxfill() throws IOException
	 { ob2.clickonmobliecheckbox();
	 }
	 @Test (priority = 4,groups = {" sanity"})
	 public void laptopchecboxfill() throws IOException
	 { ob2.clickonlaptopcheckbox();
	 }
	 @Test (priority = 5,groups = { "regression",})
	 public void destopchecboxfill() throws IOException
	 { ob2.clickondestopbox();
	 }
}
