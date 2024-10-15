package applicationutility;

import org.openqa.selenium.WebElement;

public interface Application_utility 
{
   public void dubbleclick(WebElement ele);
   public void rightclick(WebElement ele);
   public void clickme(WebElement ele);
   public void switchtonewwindows(int index);// for windows switching
   public void waitforclick(WebElement ele);// for webelement click
   public void javascriptcommonclick(WebElement ele);// another way of click perform by javascript
   public void waitforvisibility(WebElement ele);// wait for value or message visibility
   public void waitforalert();// wait for alerts . in alerts there is no parameters for alerts
   public void selectbyvisible_text(WebElement ele, String  text);
   // this is only work when select option is avialbe in the done ;
   public void selectby_index(WebElement ele, int index);
   public void selectby_vlaue(WebElement ele, String value);
   public void selectalloption(WebElement ele);
   public void uploadfile(String path);
   
   
}
