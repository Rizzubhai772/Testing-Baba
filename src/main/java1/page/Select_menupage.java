package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_library;

public class Select_menupage extends Base_library
{
  public Select_menupage()
  {
	  PageFactory.initElements(driver, this);
	  
  }
  @FindBy(xpath="//*[@data-target=\"#widget\"]")//  clickon_widgets
  public WebElement clickon_widgets;
  
  @FindBy(xpath="//*[text()='select menu']")//  clickon_selectmenu
  public WebElement clickon_selectmenu;
  
  @FindBy(xpath="/html/body/div[2]/div/div[2]/div/div/div[25]/form/div/div[1]/select")
  public WebElement clickon_selectvalue;
  
  @FindBy(xpath="/html/body/div[2]/div/div[2]/div/div/div[25]/form/div/div[2]/select")//  clickon_select on one
  public WebElement clickon_selectone;
  
  @FindBy(xpath="")//  clickon_select on oldstyle
  public WebElement clickon_selectoldstyle;
	
  @FindBy(xpath="")//  clickon_select on multiple
  public WebElement clickon_seletmultiple;
  
  public void clickonwidget()
  {
	  waitforclick(clickon_widgets);
  }
  public void clickonselectmenu()
  {
	  waitforclick(clickon_selectmenu);
  }
  public void clickonselectvalue()
  {
	  selectby_index(clickon_selectvalue, 0);
  }
  
  public void clickonselectone()
  {
	  selectby_index(clickon_selectone,3);
  }
  public void clickonselectoldstyle()
  {
	  selectby_index(clickon_selectoldstyle, 4);
  }
  public void clickonselectmultiple()
  {
	  selectby_vlaue(clickon_seletmultiple, "CSS,HTML,PHP");
  }
}
