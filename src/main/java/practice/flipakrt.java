package practice;


import java.time.Duration;

import org.ar.genericUtility.JavaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipakrt {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavaScriptExecutor je = (JavaScriptExecutor) driver;
		je.clickUsingJSE(driver.findElement(By.name("login")));
		//je.clickUsingJSE(driver.findElement(By.name("login")));
	}

}
