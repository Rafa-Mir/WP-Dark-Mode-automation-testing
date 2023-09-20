package Wppool;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTestExam {
	@Test
	public void myFirstTest() throws InterruptedException{
		WebDriverManager.firefoxdriver().setup();
		// create a WebDriver object named driver.
		WebDriver driver = new FirefoxDriver();
		// login to page
		driver.get("http://localhost/wordpress/wp-login.php?loggedout=true&wp_lang=en_US");
		// enter the user name
		driver.findElement(By.id("user_login")).sendKeys("admin");
		Thread.sleep(2000);
		//  enter the password
		driver.findElement(By.name("pwd")).sendKeys("admin");
		Thread.sleep(2000);
		// Click on login button
		driver.findElement(By.name("wp-submit")).click();
		Thread.sleep(2000);
		// click on plugin
		driver.findElement(By.xpath("//*[@id=\"menu-plugins\"]/a/div[3]")).click();
		Thread.sleep(2000);
		// click on active bar to check wp dark mode is active or not
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		// as it is active navigate to wp dark mode
		driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr/td[1]/div/span[2]/a")).click();
		Thread.sleep(2000);
		// enable backend dark mode
		driver.findElement(By.xpath("//*[@id=\"wp_dark_mode_general\"]/form/table/tbody/tr[2]/td/fieldset/label/div/div")).click();
		Thread.sleep(2000);
		// save dark mode
		driver.findElement(By.id("save_settings")).click();
		Thread.sleep(2000);
		// go to dashboard
		driver.findElement(By.xpath("//*[@id=\"menu-dashboard\"]/a/div[3]")).click();
		Thread.sleep(2000);
		// Light-dark toggle button is on the bar and then click it to active the dark mode
		driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-wp-dark-mode\"]/a/div/label/div[2]/p[1]")).click();
		Thread.sleep(2000);
		// go to wp dark mode
		driver.findElement(By.xpath("//*[@id=\"toplevel_page_wp-dark-mode-settings\"]/a/div[3]")).click();
		Thread.sleep(2000);
		// click on switch settings
		driver.findElement(By.xpath("//*[@id=\"wp_dark_mode_switch-tab\"]/span")).click();
		Thread.sleep(2000);
		// change the floating mode
		driver.findElement(By.xpath("//*[@id=\"wp_dark_mode_switch\"]/form/table/tbody/tr[2]/td/fieldset/label[8]")).click();
		Thread.sleep(2000);
		// click cross button to exit from the new module	
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[2]/div/div[2]/div[15]/div/span")).click();
		Thread.sleep(2000);
		// click on switch size custom
		driver.findElement(By.xpath("//*[@id=\"wp_dark_mode_switch\"]/form/table/tbody/tr[3]/td/div/span[6]")).click();
		Thread.sleep(2000);
		//click on Show Floating Switch
		driver.findElement(By.xpath("//*[@id=\"wp_dark_mode_switch\"]/form/table/tbody/tr[1]/td/fieldset/label/div/div")).click();
		Thread.sleep(2000);
		// click on accessibility settings
		driver.findElement(By.xpath("//*[@id=\"wp_dark_mode_accessibility-tab\"]/span")).click();
		Thread.sleep(2000);
		// click on Keyboard Shortcut button
		driver.findElement(By.xpath("//*[@id=\"wp_dark_mode_accessibility\"]/form/table/tbody/tr[5]/td/fieldset/label/div/div")).click();
		Thread.sleep(2000);
		// click on animation
		driver.findElement(By.xpath("//*[@id=\"wp_dark_mode_animation-tab\"]/span")).click();
		Thread.sleep(2000);
		// click on enable to Darkmode Toggle Animation
		driver.findElement(By.xpath("//*[@id=\"wp_dark_mode_animation\"]/form/table/tbody/tr[1]/td/fieldset/label/div/div/label")).click();
		Thread.sleep(2000);
		// Click on animation effect dropdown
		WebElement selectItemElement = driver.findElement(By.name("wp_dark_mode_animation[animation]"));
		selectItemElement.click();
		Thread.sleep(2000);
		// select an option
		driver.findElement(By.xpath("//option [@value= 'slide-up']")).click();
		Thread.sleep(3000);
		//click on wordpresstech button
		driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-site-name\"]/a")).click();
	}}



