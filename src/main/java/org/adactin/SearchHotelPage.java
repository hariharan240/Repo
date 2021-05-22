package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends Base {
	public SearchHotelPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "location")
	private WebElement l;
	@FindBy(id = "hotels")
	private WebElement h;
	@FindBy(id = "submit")
	private WebElement su;

	public WebElement getL() {
		return l;
	}

	public WebElement getH() {
		return h;
	}

	public WebElement getS() {
		return su;
	}

}
