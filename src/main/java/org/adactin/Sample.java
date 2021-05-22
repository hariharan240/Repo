package org.adactin;

import org.openqa.selenium.WebDriver;

public class Sample {
public static void main(String[] args) {
	Base base = new Base();
	WebDriver driver = base.getDriver();
	base.Url(null, "https://adactinhotelapp.com/");
	LoginPage lp = new LoginPage();
	base.type(lp.getU(), "Heyadactic");
}
}
