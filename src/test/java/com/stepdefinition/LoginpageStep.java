package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginpageStep {
	WebDriver driver;
	@Given("User is on the adactin page")
	public void a() {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
	

	@When("User should enter {string} and {string}")
	public void b(String name, String password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(name);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
	@When("User should enter search hotels by {string},{string},{string},{string},{string},{string},{string},{string}")
	public void c(String location, String hotels, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		WebElement loc = driver.findElement(By.name("location"));
       	Select s = new Select(loc);
		s.selectByVisibleText(location);
		WebElement hotel = driver.findElement(By.name("hotels"));
       	Select s1 = new Select(hotel);
		s1.selectByVisibleText(hotels);
		WebElement roomType1 = driver.findElement(By.name("room_type"));
       	Select s2 = new Select(roomType1);
		s2.selectByVisibleText(roomType);
		WebElement rooms = driver.findElement(By.name("room_nos"));
       	Select s3 = new Select(rooms);
		s3.selectByVisibleText(noOfRooms);
       	WebElement inDate= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		inDate.click();
		Actions actions=new Actions(driver);
		actions.doubleClick(inDate).click().perform();
		inDate.sendKeys(checkInDate);
		
		WebElement outDate= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		outDate.click();
		Actions actions1=new Actions(driver);
		actions1.doubleClick(outDate).click().perform();
		outDate.sendKeys(checkOutDate);
		
		WebElement adultsRoom= driver.findElement(By.id("adult_room"));
		adultsRoom.click();
		Select select4=new Select(adultsRoom);
		select4.selectByVisibleText(adultsPerRoom);
		adultsRoom.click();
		
		WebElement childrenRoom= driver.findElement(By.id("child_room"));
		childrenRoom.click();
		Select select5=new Select(childrenRoom);
		select5.selectByVisibleText(childrenPerRoom);
		adultsRoom.click();
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.id("continue")).click();

		}
		@When("User should enter payment details by {string},{string},{string},{string},{string},{string},{string},{string}")
		public void d(String firstname, String lastname, String billingAddress, String ccNum, String ccType, String expMonth, String expYear,String cvvNum) {
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys(firstname);
		

		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(lastname);
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(billingAddress);
		
		WebElement ccnum = driver.findElement(By.id("cc_num"));
		ccnum.sendKeys(ccNum);
		
		WebElement ccType1 = driver.findElement(By.id("cc_type"));
		ccType1.click();
		Select s5=new Select(ccType1);
		s5.selectByVisibleText(ccType);
		ccType1.click();
		
		WebElement ccExpMon = driver.findElement(By.id("cc_exp_month"));
		ccExpMon.click();
		Select s6=new Select(ccExpMon);
		s6.selectByVisibleText(expMonth);
		ccExpMon.click();
		
		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		ccExpYear.click();
		Select s7=new Select(ccExpYear);
		s7.selectByVisibleText(expYear);
		ccExpYear.click();
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys(cvvNum);
		
		WebElement bookbtn = driver.findElement(By.id("book_now"));
		bookbtn.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement orderNo1 = driver.findElement(By.id("order_no"));
		String text = orderNo1.getAttribute("value");
		System.out.println("Booking Order No. is:" + text);
	}
		
	}