package pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_package.Base;

public class Challenges_UI_Page extends Base{
	
	
	
	
	
	
	@FindBy(xpath ="//table[5]/tbody/tr")
	WebElement post_body;
	
	
	
	//verify that done status is true
	
public Challenges_UI_Page(WebDriver driver) 
   {
	 
	     this.driver = driver;	
	     PageFactory.initElements(driver, this);
	}


public static void checkDoneStatus(WebElement text)
	{
	
	 String value = text.getAttribute("class");
	 
	     if(value.equals("statustrue") )
	      {
		
		    System.out.println("Completed Sucessfully");
	          }
	       else if (value.equals("statusfalse"))
	   {
		 System.out.println("Not completed"); 

        }
	 
}
public static void checkbackgroundcolor(WebElement text)
{

	
 String value = text.getCssValue("background-color");
 
 System.out.println(value);
 
    /*if(value.equals("statustrue") )
      {
	
	    System.out.println("Completed Sucessfully");
          }
       else if (value.equals("statusfalse"))
   {
	 System.out.println("Not completed"); 

    }
 */
}
	
}