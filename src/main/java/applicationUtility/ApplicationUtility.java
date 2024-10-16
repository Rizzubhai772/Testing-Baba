package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility 
{
	public void switchToTab(int tabindex);
	public void doubleclick(WebElement ele);
	public void rightclick(WebElement ele);
    public void commonjsscript(WebElement ele); 
	public void fileuploading(String path);
	public  String getDate();
	public String getDateTime();
	public void mousehoverClick(WebElement ele);
		
}
		
	
		
	
		

	


