package StepsExecution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    
   WebDriver driver;
   @Given("^Open the Chrome and launch the application$")				
   public void open_the_Chrome_and_launch_the_application() throws Throwable							
   {		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Desktop/chromedriver");
	driver = (WebDriver) new ChromeDriver();
   driver.get("https://hris.qainfotech.com");
       System.out.println("This Step open the chrome and launch the application.");					
   }		

   @When("^Enter the Username and Password$")					
   public void enter_the_Username_and_Password() throws Throwable 							
   {		driver.findElement(By.id("txtUserName")).sendKeys("Adityapratap");
   driver.findElement(By.id("txtPassword")).sendKeys("Adi@9911");
      System.out.println("This step enter the Username and Password on the login page.");					
   }		

   @Then("^Redirectsto next Page$")					
   public void Redirects_to_next_Page() throws Throwable 							
   {    		driver.findElement(By.xpath("//div/input[@value='Sign In']")).submit();
       System.out.println("This step Redirectsto next Page.");					
   }		



}