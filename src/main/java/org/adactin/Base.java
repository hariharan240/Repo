package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver getDriver() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
return driver;
}
public void Url(WebDriver d , String url) {
d.get(url);
}
public void type(WebElement e , String data) {
e.sendKeys(data);
}
public void click(WebElement c) {
c.click();
}
}
