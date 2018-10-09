package com.Parcels.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Parcels.helper.LoggerHelper;

public class TrackAndTracePages {
	private WebDriver driver;

	private static Logger log = LoggerHelper.getLogger(TrackAndTracePages.class);

	@FindBy(xpath="//a//span[contains(text(),'Business services')]")
	WebElement BusinessServices;

	@FindBy(xpath="//*[contains(text(),'Royal Mail for small')]")
	WebElement RoyalMailBusiness;

	@FindBy(xpath="//li//a[@id='useful-tools-track-an-item']")
	WebElement TrackYourItem;

	@FindBy(xpath="//*[@id='track-item']")
	WebElement Barcode;


	@FindBy(xpath="//h1[contains(text(),'Track your Item')]")
	public WebElement TextTrackYourDelivery;//created as public so that we can access this webelement in Step definition

	@FindBy(xpath="//*[contains(text(),'Track your delivery')]")
	WebElement TrackYourDelivery;


	@FindBy(xpath="icon-information-red")
	WebElement BarcodeErrorMessage;

	public TrackAndTracePages(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void verifyTextTrackAndTrace(){
	Assert.assertTrue(TextTrackYourDelivery.isDisplayed());
}
	public void clickOnBusinessService() throws InterruptedException{
		BusinessServices.click();
		Thread.sleep(5000);
	}

	public void clickOnRoyalMailBussiness(){
		RoyalMailBusiness.click();
	}

	public void clickOnTrackYourItem(){
		TrackYourItem.click();
	}

	public void enterBarcode(String barcode){
		Barcode.sendKeys(barcode);
	}

	public void verifyErrorMessage(){

		//Assert.assertEquals(BarcodeErrorMessage.isDisplayed());
		Assert.assertTrue(BarcodeErrorMessage.isDisplayed());
	}
	public void clickOnTrackYourDelivery(){
		TrackYourDelivery.click();
	}
}
