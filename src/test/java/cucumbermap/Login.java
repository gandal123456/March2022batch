package cucumbermap;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.SeleniumOperations;

public class Login 
{

	@When ("^user opens \"(.*)\" browser with exe as \"(.*)\"$")
	public void openBrowser(String bname,String exe)
		{
		 Object [] input=new Object[2];
         input[0]=bname;
         input[1]=exe;		           
         SeleniumOperations.browserLaunch(input);
		}
	

@When("^user opens URL as \"([^\"]*)\"$")
public void user_opens_URL_as(String url) throws Throwable
{
    Object [] input1=new Object[1];
    input1[0]=url;		           
    SeleniumOperations.openApplication(input1);
}

@When("^user cancle initial login page$")
public void user_cancle_initial_login_page() throws Throwable 
{
    Object [] input2=new Object[1];
    input2[0]="//*[@class='_2KpZ6l _2doB4z']";		           
    SeleniumOperations.clickOnElement(input2);	   
}

@When("^user move on Login$")
public void user_move_on_Login() throws Throwable 
{
	 Object [] input3=new Object[1];
	    input3[0]="//*[@class='_1_3w1N']";		           
	    SeleniumOperations.mouseOver(input3);  
}

@When("^user click on My Profile$")
public void user_click_on_My_Profile() throws Throwable
{
	 Object [] input4=new Object[1];
	    input4[0]="(//*[@class='_2NOVgj'])[1]";		           
	    SeleniumOperations.clickOnElement(input4); 
}

@When("^user enter \"([^\"]*)\" as username$")
public void user_enter_as_username(String uname) throws Throwable 
{
	Thread.sleep(2000);
	Object [] input5=new Object[2];
    input5[0]="//*[@class='_2IX_2- VJZDxU']";
    input5[1]=uname;		           
    SeleniumOperations.sendText(input5);
}

@When("^user enter \"([^\"]*)\" as password$")
public void user_enter_as_password(String password) throws Throwable 
{
	 Object [] input6=new Object[2];
     input6[0]="//*[@type='password']";
     input6[1]=password;		           
     SeleniumOperations.sendText(input6);
}

@When("^user click on Login$")
public void user_click_on_Login() throws Throwable
{
	 Object [] input7=new Object[1];
	    input7[0]="(//*[text()='Login'])[3]";		           
	    SeleniumOperations.clickOnElement(input7); 	 
}

@Then("^application shows user logged successfully$")
public void application_shows_user_logged_successfully() throws Throwable 
{
	Thread.sleep(3000);
	Object [] input8=new Object[2];
    input8[0]="GanesH Gandal";                        
    input8[1]="//*[text()='GanesH Gandal']";		           
    SeleniumOperations.validationForLogin(input8);
}

	
	
	
	
	
}
