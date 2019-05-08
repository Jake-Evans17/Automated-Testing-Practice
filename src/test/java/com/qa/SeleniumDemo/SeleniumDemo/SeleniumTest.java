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
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Ignore
	@Test
	public void test1() {
		
		String url = "http://www.google.com";
		driver.get(url);

		WebElement we = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		we.sendKeys("kittens");
		we.sendKeys(Keys.ENTER);

		WebElement we2 = driver.findElement(By.xpath(
				"//*[@id=\"rhs_block\"]/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/span"));
		
		assertEquals("Kitten", we2.getText());
	}
	
	@Ignore
	@Test
	public void demoSiteTest() {
		
		String url = "http://thedemosite.co.uk/index.php";
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
	
	@Ignore
	@Test
	public void shoppingSiteTest() {
		
		String url = "http://automationpractice.com/index.php";
		driver.get(url);
		
		WebElement inputBar = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		inputBar.click();
		inputBar.sendKeys("dress");
		inputBar.sendKeys(Keys.ENTER);
		
		WebElement searchResultCount = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span"));
		
		assertNotEquals("0 results have been found.", searchResultCount.getText());
	}
	
	@Ignore
	@Test
	public void ftseRiserTest() {
		String url = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100/risers";
		driver.get(url);
		
		WebElement riserTable = driver.findElement(By.tagName("tbody"));
		WebElement firstRiserRecord = riserTable.findElement(By.tagName("tr"));
		WebElement td = firstRiserRecord.findElement(By.tagName("td"));
		
		assertEquals("INF", td.getText());
	}
	
	@Ignore
	@Test
	public void ftseFallerTest() {
		String url = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100/fallers";
		driver.get(url);
		
		WebElement fallerTable = driver.findElement(By.tagName("tbody"));
		WebElement firstFallerRecord = fallerTable.findElement(By.tagName("tr"));
		WebElement td = firstFallerRecord.findElement(By.tagName("td"));
		
		assertEquals("IMB", td.getText());
	}
	
	@Test
	public void mercuryToursTest() {
		String url = "http://www.newtours.demoaut.com/";
		driver.get(url);
		
		WebElement registerLink = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		registerLink.click();
		
		WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		usernameInput.click();
		usernameInput.sendKeys("user123");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys("user123").perform();
		action.sendKeys(Keys.TAB).sendKeys("user123").sendKeys(Keys.ENTER).perform();

		WebElement loginLink = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]"));
		loginLink.click();
		
		WebElement usernameInput2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
		usernameInput2.sendKeys("user123");
		
		action.sendKeys(Keys.TAB).sendKeys("user123").perform();
		
		WebElement submit1 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
		submit1.click();

		WebElement passengers = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select"));
		passengers.sendKeys("2");

		WebElement depart = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select"));
		depart.sendKeys("l");
		WebElement arrive = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select"));
		arrive.sendKeys("p");
		WebElement firstClass = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
		firstClass.click();
		WebElement airline = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select"));
		airline.sendKeys("u");
		
		WebElement submit = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"));
		submit.click();
		
		WebElement continueToCheckout = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input"));
		continueToCheckout.click();
		
		WebElement reviewText = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font"));
		
		assertEquals("Please review your travel itinerary and make your purchase.", reviewText.getText());
	}

	@After
	public void teardown() {
		driver.quit();
	}
}
