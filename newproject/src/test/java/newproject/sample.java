package newproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sample {
	/*@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String sname) throws IOException {
	  
	FileInputStream exc= new FileInputStream(".//src/test/resources/"+sname+".xlsx");
	XSSFWorkbook work= new XSSFWorkbook(exc);
	XSSFSheet sheet =work.getSheetAt(0);
	int row= sheet.getLastRowNum();
	
	for(int r=1;r<=row;r++) 
	{

	XSSFRow rr=sheet.getRow(r);
	XSSFCell username=rr.getCell(0);
		switch(username.getCellType()) {
		case STRING : 

			System.out.print(username.getStringCellValue());
			break;
		case NUMERIC :
			System.out.print(username.getNumericCellValue());
			break;
		case BOOLEAN:
			System.out.print(username.getBooleanCellValue());
			break;
		case BLANK:
			break;
		default:
			break;
		}
		System.out.print(" | ");
		
		XSSFCell password=rr.getCell(1);
		switch(password.getCellType()) {
		case STRING : 

			System.out.print(password.getStringCellValue());
			break;
		case NUMERIC :
			System.out.print(password.getNumericCellValue());
			break;
		case BOOLEAN:
			System.out.print(password.getBooleanCellValue());
			break;
		
		default:
			break;
		}
		System.out.print(" | ");
		XSSFCell message=rr.getCell(2);
		switch(password.getCellType()) {
		case STRING : 

			System.out.print(message.getStringCellValue());
			break;
		case NUMERIC :
			System.out.print(message.getNumericCellValue());
			break;
		case BOOLEAN:
			System.out.print(message.getBooleanCellValue());
			break;
		
		default:
			break;
		}
			System.out.print(" | ");
			}System.out.println();
			work.close();
	}*/

		@Given("I want to write a step with {string}")
		public void i_want_to_write_a_step_with(String sname) throws IOException {
   
		FileInputStream exc= new FileInputStream(".//src/test/resources/"+sname+".xlsx");
		XSSFWorkbook work= new XSSFWorkbook(exc);
		XSSFSheet sheet =work.getSheetAt(0);
		int row= sheet.getLastRowNum();
		int cell=sheet.getRow(1).getLastCellNum();
		for(int r=0;r<row;r++) 
		{
	
		XSSFRow rr=sheet.getRow(r);
		
			for(int c=0;c<cell;c++) {
			XSSFCell cc=rr.getCell(c);
			

				System.out.print(cc.getStringCellValue());
				
			}
			System.out.print(" | ");
			}System.out.println();
			work.close();
		}
		
		 WebDriver driver;
			public @FindBy(xpath="//*[text()='Get Started']")WebElement start;
			 @FindBy(xpath="//*[text()='Get Started']")WebElement getstart;
			 @FindBy(className="alert-primary")WebElement starterror;
			 @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]//a")WebElement datastructure;
			 @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div")WebElement datastructurelist;
			 @FindBy(xpath="//*[text()='Sign in']")WebElement  signin;
			 @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")WebElement register;
			 @FindBy(className="navbar-brand")WebElement numpyninja;
			 @FindBy(xpath="//div[2]//div[2]/form/input[5]")WebElement submit;
			 @FindBy(xpath="//*[@id=\"id_username\"]")WebElement username;
			 @FindBy(xpath="//*[@id=\"id_password1\"]")WebElement password;
			 @FindBy(xpath="//*[@id=\"id_password2\"]")WebElement cpassword;
			 @FindBy(className="alert-primary")WebElement registererror;
			 @FindBy(className="alert-primary")WebElement successregister;
			 @FindBy(xpath="//*[text()='Sign out']")WebElement signout;
			 @FindBy(className="alert-primary")WebElement successsignout;
			 @FindBy(xpath="//*[@id=\"id_username\"]")WebElement usernamesign;
			 @FindBy(xpath="//*[@id=\"id_password\"]")WebElement passwordsign;
			 @FindBy(xpath="//div[2]/div/div[2]//input[4]")WebElement login;
			 @FindBy(className="alert-primary")WebElement loginmsg;
			 @FindBy(xpath="//div[3]/div[1]/div/div/a")WebElement  dsStart;
			 @FindBy(xpath="//*[text()='Time Complexity']")WebElement dstime ;
			 @FindBy(className="btn-info")WebElement  dtsext;
			 @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]")WebElement dstryhere;
			 @FindBy(xpath="//*[text()='Run']")WebElement dsrun;
}

		


