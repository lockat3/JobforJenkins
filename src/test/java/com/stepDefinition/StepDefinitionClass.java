package com.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
	@When("User should enter Booking details using table {string} and {string} and {string}")
	public void user_should_enter_Booking_details_using_table_and_and(String firstName, String lastName, String address, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		BookHotelPage  bookhotelpage= new BookHotelPage();
		bookhotelpage.verifyPageTile("Book A Hotel");
		bookhotelpage.BookHotel(firstName,lastName,address,asMaps.get(1).get("ccnum"),asMaps.get(1).get("cctype"),asMaps.get(1).get("ccyear"),asMaps.get(1).get("ccexpmonth"),asMaps.get(1).get("cccvv"));
	}

	@When("User should click Book hotel")
	public void user_should_click_Book_hotel() {
	    // Write code here that turns the phrase above into concrete actions
		BookHotelPage  bookhotelpage= new BookHotelPage();
		bookhotelpage.clickBookNow();
	}

	@Then("User should verify the {int} error messages")
	public void user_should_verify_the_error_messages(Integer int1, io.cucumber.datatable.DataTable dataTable) {
	    List<String> asList = dataTable.asList();
	    System.out.println();
	}



}
