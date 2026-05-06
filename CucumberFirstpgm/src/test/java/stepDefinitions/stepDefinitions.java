package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions {
	@Before
	public void test()
	{
	 System.out.println("connected to db");
	}
	
	@Before("@testspecial")
	public void testspecialcondition()
	{
	 System.out.println("special condition check at start of thois scenario");
	}
	
	@After("@testspecial")
	public void testspecialconditionend()
	{
	 System.out.println("special condition check at end ofscenarion");
	}
	
	@After
	public void test1()
	{
		System.out.println("db disconnected");
	}
	
	
	@Given("User opens the web application")
	public void user_opens_the_web_application() {
	   
		System.out.println("user open the application");
	}

	@Given("User will enter the username")
	public void user_will_enter_the_username() {
		System.out.println("user will enter the username");
	}

	@Given("User will enter the password")
	public void user_will_enter_the_password() {
		System.out.println("user enter the password");
	}
	@Given("User will enter the {string}")
	public void user_will_enter_the(String string) {
		System.out.println("user will enter particular string");
	}

	@When("User will click on login button")
	public void user_will_click_on_login_button() {
		System.out.println("user click login button");
	}

	@Then("user will be navigated to home page of application")
	public void user_will_be_navigated_to_home_page_of_application() {
		System.out.println("user navigate to homepage of app");
	}
	
	@Then("user will be getting the appropriate error message")
	public void user_will_be_getting_the_appropriate_error_message() {
		System.out.println("error message");
	}
	@Then("the user will then go to add to cart section")
	public void the_user_will_then_go_to_add_to_cart_section() {
		System.out.println("user navigate to add to cart section");
	}

	@Then("the user will then go to  my favourite section")
	public void the_user_will_then_go_to_my_favourite_section() {
		System.out.println("user navigate to my_favourite_section section");
	}

	@Then("the user will then go to user settings section")
	public void the_user_will_then_go_to_user_settings_section() {
		System.out.println("user navigate to user settings section section");
	}

	@Given("User opens the HRM web application")
	public void user_opens_the_hrm_web_application() {
	    
				
	}

	@When("User will enter the credentials")
	public void user_will_enter_the_credentials(io.cucumber.datatable.DataTable dataTable) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rajeev/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		List<List<String>> jsamform=dataTable.asLists(String.class);
		String username=jsamform.get(0).get(0);
		String password=jsamform.get(0).get(1);
		String firstname=jsamform.get(0).get(2);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("fname")).sendKeys(firstname);
		
		
	    
	}

	@Then("User will be submitting the form.")
	public void user_will_be_submitting_the_form() {
	    
	}





}
