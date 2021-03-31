package io.cucumber.stephanie.services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {

  public static WebDriver browser;

  public static void open(String url) {
    if(browser == null) {
      System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		  browser = new ChromeDriver();
    }
    browser.get(url);
  }

  public static void close() {
    browser.close();
    browser = null;
  }
}