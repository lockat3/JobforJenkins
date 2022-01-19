package com.stepDefinition;

import java.io.IOException;

import com.Library.ReusableLibrary;
import com.pages.BookConfirmationPage;
import com.pages.BookHotelPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass extends ReusableLibrary{

	@Given("User should enter the login Page")
	public void user_should_enter_the_login_Page() {
		setDriver();
		launchUrl("https://adactinhotelapp.com/index.php");
		maximizeWindow();
	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String username, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.login( username,  password);
	}

	@When("User should select {string} and {string} and {string} and {string} and  {string} and {string} and {string} and {string}")
	public void user_should_select_and_and_and_and_and_and_and(String location, String hotel, String roomType, String roomnum, String datein, String dateout, String adultRoom, String childRoom) {
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		searchHotelPage.searchHotel(location,hotel,roomType,roomnum,datein,dateout,adultRoom,childRoom);
	}

	@When("User should select hotel")
	public void user_should_select_hotel() {
		SelectHotelPage selectHotelPage = new SelectHotelPage();
		selectHotelPage.selectHotel();
	}

	@When("User should enter Booking details {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_should_enter_Booking_details_and_and_and_and_and_and_and(String firstName, String lastName, String address, String ccnum, String ccType, String year, String month, String ccv) {
		BookHotelPage  bookhotelpage= new BookHotelPage();
		bookhotelpage.verifyPageTile("Book A Hotel");
		bookhotelpage.BookHotel(firstName,lastName,address,ccnum,ccType,year,month,ccv);
	}

	@Then("User should get BookingId")
	public void user_should_get_BookingId() throws InterruptedException, IOException {

		BookConfirmationPage bookConfirmationPage = new BookConfirmationPage();
		bookConfirmationPage.verifyPageTile("Booking Confirmation");
		bookConfirmationPage.bookConfirmation();
		closeBrowser();
	}



}
