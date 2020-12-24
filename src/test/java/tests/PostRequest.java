package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_package.Base;
import helper_Classes.APIUtility;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import pagesObjects.Challenges_UI_Page;

import static io.restassured.RestAssured.given;


import java.io.File;

import java.io.FileNotFoundException;

@Listeners(helper_Classes.Listeners.class)




public class PostRequest  extends Base implements APIUtility {
	
	
	
	
	static ResponseSpecification responseSpec = new ResponseSpecBuilder().expectStatusCode(201).build();
	
	
	
	
	public static String getXchallenger() 
	
	{
		
		
       String xchallenger =
		       given().
		       when().
		           post(CHALLENGER).
	           then().
	               extract().header("X-challenger");
   	System.out.println(xchallenger);

		
	return xchallenger;
	
		
		
		
	}
	
	@Test
	
	public static void postRequest() throws FileNotFoundException
	
	{
		
		
		File path = new File(directory_path+"\\src\\test\\resources\\PostRequest\\Req.json");
		
		given().
		   //header("X-CHALLENGER",getXchallenger()).
		when().
		   body(path).
		   post(TO_DO).
	    then().
	       assertThat().spec(responseSpec);
		
		
		
	}
	
	@Test
	
     public static void validateDoneStatus() 
	
	{
		
		
		
		
		
		
		
	}
	


}
