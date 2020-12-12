package com.ups.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpsDrivers {

	public WebDriver getChromeDriver() {
		System.out.println("Getting Chrome Driver....");
		WebDriverManager.chromedriver().browserVersion("87.0.4280.88").setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public WebDriver getFirefoxDriver() {

		WebDriverManager.firefoxdriver().browserVersion("83").setup();
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
