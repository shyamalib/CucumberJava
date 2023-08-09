package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;


public class ExecuteStep {

	WebDriver driver;


	@Given("I open the HTML page")
	public void i_open_the_html_page() {
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();


		System.out.println("finding file path");
		//driver.get("file:src/test/resources/File/Page.html");

		driver.get(" file:/Users/shyamalibanerjee/Downloads/Page.html");


		System.out.println("found file path");

	}

	@When("I click the {string} button")
	public void i_click_the_button(String buttonText) throws InterruptedException {

		Thread.sleep(6000);
		driver.findElement(By.tagName("button")).click();

	}

	@Then("the result should be {string}")
	public void the_result_should_be(String expectedResults) {

		String actualResult = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(expectedResults,actualResult);

	}



}
