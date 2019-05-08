package com.qa.SeleniumDemo.SeleniumDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop/chromedriver.exe");
		driver = new ChromeDriver();


	}

	@Ignore
	@Test
	public void test1() {
		String url = "http://www.google.com";

		driver.manage().window().maximize();
		driver.get(url);

		WebElement we = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		we.sendKeys("kittens");
		we.sendKeys(Keys.ENTER);

		WebElement we2 = driver.findElement(By.xpath(
				"//*[@id=\"rhs_block\"]/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/span"));
		
		assertEquals("Kitten", we2.getText());
	}
	
	@Test
	public void demoSiteTest() {
		
		String url = "http://thedemosite.co.uk/index.php";
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement link1 = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
    	link1.click();
    	
		WebElement usernameInput1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		usernameInput1.sendKeys("AUser");
		WebElement passwordInput1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		passwordInput1.sendKeys("password");
		WebElement submitButton1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
    	submitButton1.click();
    	
		WebElement link2 = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
    	link2.click();
    	
		WebElement usernameInput2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		usernameInput2.sendKeys("AUser");
		WebElement passwordInput2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		passwordInput2.sendKeys("password");
		WebElement submitButton2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
    	submitButton2.click();

		WebElement loginResult = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		
		assertEquals("**Successful Login**", loginResult.getText());
		
	}
	
	@Test
	public void shoppingSiteTest() {
		
		String url = "http://automationpractice.com/index.php";
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement inputBar = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		inputBar.click();
		inputBar.sendKeys("dress");
		inputBar.sendKeys(Keys.ENTER);
		
		WebElement searchResultCount = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span"));
		
		assertNotSame("0 results have been found.", searchResultCount);
	}

	@After
	public void teardown() {
		driver.quit();
	}
}
