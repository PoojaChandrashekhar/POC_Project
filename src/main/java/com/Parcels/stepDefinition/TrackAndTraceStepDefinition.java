package com.Parcels.stepDefinition;



import com.Parcels.pages.TrackAndTracePages;
import com.Parcels.testbase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TrackAndTraceStepDefinition extends TestBase {

	TrackAndTracePages TrackAndTracePages = new TrackAndTracePages(driver);

	@Given("^I launch the url \"([^\"]*)\"$")
	public void i_launch_the_url(String arg1) throws Throwable {
		driver.get(arg1);
		Thread.sleep(1000);
	}
	@Then("^I verify text message Track and Trace$")
	public void i_verify_text_message_Track_and_Trace() throws Throwable {
TrackAndTracePages.verifyTextTrackAndTrace();
	}
	@And("^I click on Business Services$")
	public void i_click_on_Business_Services() throws Throwable {
		TrackAndTracePages.clickOnBusinessService();
	}

	@Then("^I click on Royal Mail for small and medium sized businesses$")
	public void i_click_on_Royal_Mail_for_small_and_medium_sized_businesses() throws Throwable {
		TrackAndTracePages.clickOnRoyalMailBussiness();
	}

	@Then("^I click on Track your Item$")
	public void i_click_on_Track_your_Item() throws Throwable {
		TrackAndTracePages.clickOnTrackYourItem();
	}

	@And("^I enter the Barcode \"([^\"]*)\"$")
	public void i_enter_the_Barcode(String barcode) throws Throwable {
		TrackAndTracePages.enterBarcode(barcode);
	}
	@Then("^I click on Track your Delivery$")
	public void i_click_on_Track_your_Delivery() throws Throwable {
		TrackAndTracePages.clickOnTrackYourDelivery();
	}
	@Then("^I verify the error message displayed$")
	public void i_verify_the_error_message_displayed() throws Throwable {
		TrackAndTracePages.verifyErrorMessage();
	}

}