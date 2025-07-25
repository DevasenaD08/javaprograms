package xpathPrg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecondLargestPrice {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		//input[@value='Login']
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//to capture the first product price
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		//print the first product name
		System.out.println("Sauce Labs Backpack");
		System.out.println("32.39");
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		//a[@data-test='shopping-cart-link']
		driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click();
		//to click on checkout button
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		//to give the details of first name ,last name,zip code,
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Devasena");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("D");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("608703");
		//to click the continue button
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		//to collect all the prices in on the checkout overview page
		//div[text()='29.99']
		
		
		//to click the finish button
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		
		//to close the browser
		driver.quit();
		
	}

}
