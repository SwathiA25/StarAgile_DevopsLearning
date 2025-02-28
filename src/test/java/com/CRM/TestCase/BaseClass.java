package com.CRM.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");
		driver.manage().window().maximize();

		hp = new HomePage(driver);
		lp = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
