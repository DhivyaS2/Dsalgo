package newproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	 public static WebDriver driver;
	 By start = By.xpath("//*[text()='Get Started']");
	 By getstart =By.xpath("//*[text()='Get Started']");
	 By starterror=By.className("alert-primary");
	 By datastructure=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]//a");
	 By datastructurelist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div");
	 By signin = By.xpath("//*[text()='Sign in']");
	 By register=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]");
	 By numpyninja =By.className("navbar-brand");
	 By submit =By.xpath("//div[2]//div[2]/form/input[5]");
	 By username=By.xpath("//*[@id=\"id_username\"]");
	 By password=By.xpath("//*[@id=\"id_password1\"]");
	 By cpassword=By.xpath("//*[@id=\"id_password2\"]");
	 By registererror =By.className("alert-primary");
	 By successregister =By.className("alert-primary");
	 By signout=By.xpath("//*[text()='Sign out']");
	 By successsignout =By.className("alert-primary");
	 By usernamesign= By.xpath("//*[@id=\"id_username\"]");
	 By passwordsign= By.xpath("//*[@id=\"id_password\"]");
	 By login=By.xpath("//div[2]/div/div[2]//input[4]");
	 By loginmsg=By.className("alert-primary");
	 By dsStart =By.xpath("//div[3]/div[1]/div/div/a");
	 By dstime =By.xpath("//*[text()='Time Complexity']");
	 By dstryhere= By.className("btn-info");
	 By dstext= By.xpath("//*[@id=\"answer_form\"]/div/div");
	 By dsrun =By.xpath("//*[text()='Run']");
	 
	 
	@Given("The user opens site link")
	public void the_user_opens_site_link() {
	  driver=new ChromeDriver();
	  
	  
	}

	@Then("Site will load")
	public void site_will_load() {
		driver.get("https://dsportalapp.herokuapp.com/");  
	}

	@When("Click get started to enter into the site")
	public void click_get_started_to_enter_into_the_site() {
	    driver.findElement(start).click();
	}

	@Then("Home page will get load")
	public void home_page_will_get_load() {
	    
	}


@Given("Trys to get start by clicking Get started")
public void trys_to_get_start_by_clicking_get_started() {

	 driver.findElement(getstart).click();
}

@Then("Alerts You are not logged in")
public void alerts_you_are_not_logged_in() {
		System.out.println("*****"+driver.findElement(starterror).getText());
}

@When("Clicks Data Structure drop down")
public void clicks_data_structure_drop_down() {
    
	 driver.findElement(datastructure).click();
}

@Then("Shows six lists of data structure")
public void shows_six_lists_of_data_structure() {

}

@When("Clicks List in Data structure")
public void clicks_list_in_data_structure() {
	driver.findElement(datastructurelist).click();
	
}

@When("Clicks Sign in To login")
public void clicks_sign_in_to_login() {
	driver.findElement(signin).click();
	
}

@Then("Navigates to login page")
public void navigates_to_login_page() {
    
    
}

@Given("Clicks register to create username and password")
public void clicks_register_to_create_username_and_password() {
	driver.findElement(register).click(); 
    
}


@Then("Register page will load")
public void register_page_will_load() {
    
    
}

@When("Clicks NumpyNinja")
public void clicks_numpy_ninja() {
	driver.findElement(numpyninja).click(); 
    
}

@Then("Returns back to First page to Get started And click back to register your account")
public void returns_back_to_first_page_to_get_started_and_click_back_to_register_your_account() {
    driver.navigate().back();
    
}

@When("clicks register button with null values")
public void clicks_register_button_with_null_values() {
	driver.findElement(submit).click();
	WebElement au= driver.switchTo().activeElement();
    String d=au.getAttribute("validationMessage");
	System.out.println("*****************Message in screen is***"+d);
}

@Then("Shows Error message Please fill out this field in username")
public void shows_error_message_please_fill_out_this_field_in_username() {
	System.out.println("Please fill out this field in empty text box");
	
	System.out.println("*****************");
}

@When("Enters only user name without other fields")
public void enters_only_user_name_without_other_fields() {
	driver.findElement(username).sendKeys("Monday");
	driver.findElement(submit).click();
	
    
}

@Then("Shows Error message Please fill out this field in password")
public void shows_error_message_please_fill_out_this_field_in_password() {
    
	System.out.println("Please fill out this field in password text box");
	System.out.println("*****************");
}

@When("clicks register without confirm password")
public void clicks_register_without_confirm_password() {
	driver.findElement(username).sendKeys("Monday");
	 driver.findElement(password).sendKeys("12345678/");
	driver.findElement(submit).click();
	System.out.println("*****************");
    
    
}

@Then("Shows Error message Please fill out this field in confirm password")
public void shows_error_message_please_fill_out_this_field_in_confirm_password() {
	System.out.println(" Please fill out this field in confirm password text box"); 
    
}

@When("Enters mismatch password")
public void enters_mismatch_password() {
	driver.navigate().refresh();
    driver.findElement(username).sendKeys("Monday");
    driver.findElement(password).sendKeys("12345678/");
    driver.findElement(cpassword).sendKeys("353456");

    
}

@Then("Shows Error message password_mismatch:The two password fields didn’t match")
public void shows_error_message_password_mismatch_the_two_password_fields_didn_t_match() {
    System.out.println(driver.findElement(registererror).getText());
    
}

@When("Enters Username with symbols except numbers and letters")
public void enters_username_with_symbols_except_numbers_and_letters() {
	driver.navigate().refresh();
	driver.findElement(username).sendKeys("Monday//");
    driver.findElement(password).sendKeys("12345678/");
    driver.findElement(cpassword).sendKeys("12345678/");

}

@When("Enters password below eight characters")
public void enters_password_below_eight_characters() {
	driver.navigate().refresh();
	driver.findElement(username).sendKeys("Monday");
    driver.findElement(password).sendKeys("123456");
    driver.findElement(cpassword).sendKeys("123456");
 
    
}

@When("Enters Password only with numbers")
public void enters_password_only_with_numbers() {
	driver.navigate().refresh();
	driver.findElement(username).sendKeys("Londondd");
    driver.findElement(password).sendKeys("123456789");
    driver.findElement(cpassword).sendKeys("123456789");
 
}

@When("Enters valid username and passwords")
public void enters_valid_username_and_passwords() {
	driver.navigate().refresh();
	
	driver.findElement(username).sendKeys("fridaydd");
    driver.findElement(password).sendKeys("friday900/");
    driver.findElement(cpassword).sendKeys("friday900/");
}
    

@When("Clicks Register")
public void clicks_register() {
   
	 driver.findElement(submit).click(); 
	 System.out.println("*****************");
}

@Then("Accepts user name and password and navigate to home page with username And Shows New Account credited with username")
public void accepts_user_name_and_password_and_navigate_to_home_page_with_username_and_shows_new_account_credited_with_username() {
	  System.out.println(driver.findElement(successregister).getText());
    
}

@When("clicks Sign out")
public void clicks_sign_out() {
    driver.findElement(signout).click();
    
}

@Then("Displays Logged out successfully")
public void displays_logged_out_successfully() {
	 System.out.println(driver.findElement(successsignout).getText());
    
}

@When("User registered already clicks Login")
public void user_registered_already_clicks_login() {
	driver.findElement(signin).click();

    
}

@When("Enters Different combination of username and password from Excel {string} file")
public void enters_different_combination_of_username_and_password_from_excel_file(String sheetname) throws IOException {
	FileInputStream exc= new FileInputStream(".//src/test/resources/"+sheetname+".xlsx");
	XSSFWorkbook work= new XSSFWorkbook(exc);
	XSSFSheet sheet =work.getSheetAt(0);
	int row= sheet.getLastRowNum();
	String pwd;
	for(int r=1;r<=row;r++) 
	{
		System.out.println("*****************");
	XSSFRow rr=sheet.getRow(r);
	

	XSSFCell usr=rr.getCell(0);
	try {
 if(usr.getCellType() != null) {

	driver.findElement(usernamesign).sendKeys(usr.getStringCellValue());
	System.out.println("Given Username is::::::"+usr);
 }
	}
	catch(Exception e)
	{
		e.getMessage();
	}
 XSSFCell password=rr.getCell(1);
 try {
 if(password.getCellType() !=null ) {
 

		 pwd=password.getStringCellValue();
		driver.findElement(passwordsign).sendKeys(pwd);
		System.out.println("Given Password is::::::"+pwd);
		
 }
 }
catch(Exception e) {
	e.getMessage();
}
		
		    XSSFCell message=rr.getCell(2);
	        
			System.out.println("Warning Message is::::::"+message);
			driver.findElement(login).click();
			
			}
			work.close();
   
  
   
}

@Then("Shows respective messages And Navigates to home page when enters correct username and password")
public void shows_respective_messages_and_navigates_to_home_page_when_enters_correct_username_and_password() {
	System.out.println("*******Logged in Successfully*******"); 
}


@Given("User in Home page with logged username")
public void user_in_home_page_with_logged_username() {
	System.out.println("******* "+driver.findElement(loginmsg).getText()+" *******");
    
}

@When("Clicks Get Started to read about DS Introduction")
public void clicks_get_started_to_read_about_ds_introduction() {
    
    driver.findElement(dsStart).click();
}

@Then("Goes to DS Introduction page")
public void goes_to_ds_introduction_page() {
    
    
}

@When("Clicks Time complexity to explore")
public void clicks_time_complexity_to_explore() {
    driver.findElement(dstime).click();
    
}

@Then("Navigates to Time complexity page")
public void navigates_to_time_complexity_page() {
    
    
}

@When("clicks Try here And Enters  phython program And clicks Run")
public void clicks_try_here_and_enters_phython_program_and_clicks_run() {
    
    driver.findElement(dstryhere).click();
    driver.findElement(dstext).click();
    String text="print'Hello'";
    driver.findElement(dstext).sendKeys(text);
}

@Then("It runs progam And shows Output")
public void it_runs_progam_and_shows_output() {
    //driver.findElement(dsrun).click();
    
}



}