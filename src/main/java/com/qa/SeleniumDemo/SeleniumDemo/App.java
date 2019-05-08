package com.qa.SeleniumDemo.SeleniumDemo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) {
       
    	System.setProperty("webdriver.chrome.driver",
    		"C:\\Users\\Admin\\Desktop/chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();
    	
    	String url = "https://www.google.co.uk/";
    	
    	driver.manage().window().maximize();
    	driver.get(url);
    	
    	WebElement we = driver.findElementByXPath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input");
    	we.sendKeys("kittens");
    	we.sendKeys(Keys.ENTER);
    	//WebElement we2 = driver.findElementByXPath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]");
    	//we2.click();
    	
    	WebElement we3 = driver.findElementByXPath("//*[@id=\"rhs_block\"]/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/span");
    	
    	if (we3.getText().equals("Kitten")) {
    		System.out.println("worked");
    	} else {
    		System.out.println("didn't work.");
    	}
    }
}
