package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class gmail {
	 public static WebDriver driver;
	By start = By.xpath("//*[text()='Get Started']");
	 By signin = By.xpath("//*[text()='Sign in']");
	By usernamesign= By.xpath("//*[@id=\"id_username\"]");
	 By passwordsign= By.xpath("//*[@id=\"id_password\"]");
	 By login=By.xpath("//div[2]/div/div[2]//input[4]");
	 By loginmsg=By.className("alert-primary");
	 By dsStart =By.xpath("//div[3]/div[1]/div/div/a");
	 By dstime =By.xpath("//*[text()='Time Complexity']");
	 By dstryhere= By.className("btn-info");
	 By dstext= By.xpath("//*[@id=\"answer_form\"]/div/div/div/textarea");
	 By dsrun =By.xpath("//*[text()='Run']");

@Given("User is navigating to G-mail Login Page")
public void user_is_navigating_to_g_mail_login_page() {
		
		 driver=new ChromeDriver();
		 driver.get("https://dsportalapp.herokuapp.com/");  
		 driver.findElement(start).click();
		 driver.findElement(signin).click();
		driver.findElement(usernamesign).sendKeys("fridaydd");
		driver.findElement(passwordsign).sendKeys("friday900/");
		driver.findElement(login).click();
		 driver.findElement(dsStart).click();
		 driver.findElement(dstime).click();
	    driver.findElement(dstryhere).click();
	    String text="print'hello'";
	  driver.findElement(dstext).sendKeys(text);
	   
	  driver.findElement(dsrun).click();
	    
	}
 
    
}




