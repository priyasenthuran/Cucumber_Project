package com.adactin.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReadManager;
import com.adactin.pom.AdactinBookedItinerary;
import com.adactin.pom.AdactinBookingConfirmation;
import com.adactin.pom.AdactinHomePage;
import com.adactin.pom.AdactinRoomBooking;
import com.adactin.pom.AdactinSearchHotel;
import com.adactin.pom.AdactinSelectHotel;
import com.adactin.runner.RunnerClass;

import io.cucumber.core.backend.Status;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tlh.vaj;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	
 public static WebDriver driver  = RunnerClass.driver ;
 @Before
 public void beforeHooks(Scenario scenario)
 {
	 String name = scenario.getName();
	 System.out.println("ScenarioNmae :"+name);
 }
 @After
 public void afterHooks(Scenario scenario) throws InterruptedException 
 {
	 io.cucumber.java.Status status = scenario.getStatus();
	 System.out.println(" Scenario Status : "+status);
	 if (scenario.isFailed())
	 {
		 
		 screenshot(scenario.getName());
	 }
 }
	
	@Given("User lanches the Application")
	public void user_lanches_the_application() throws IOException 
	{
		//driver =browserChoice("chrome");
		String url = FileReadManager.getinstance().getconfigureclass().geturl();
		urlLoad(url);
	}
/*
@When("User enters the login Detail")
public void user_enters_the_login_detail(DataTable dataTable) 
{
     List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
		
     String username = asMaps.get(0).get("username");
      String password = asMaps.get(0).get("password");
      AdactinHomePage ahp = new AdactinHomePage(driver);
 	 inputvalue(ahp.getUserName(),username);
	 inputvalue(ahp.getPassWord(),password);
      
      
}*/

	
	

@When("User enters the {string} in the username")
public void user_enters_the_in_the_username(String string) 
{
	 AdactinHomePage ahp = new AdactinHomePage(driver);
	 inputvalue(ahp.getUserName(),string);

}

@When("User enters the {string} in the password")
public void user_enters_the_in_the_password(String string) 
{
	AdactinHomePage ahp = new AdactinHomePage(driver);
	 inputvalue(ahp.getPassWord(),string);
}

/*	@When("User enters the valid username")
	public void user_enters_the_valid_username() 
	{
	 AdactinHomePage ahp = new AdactinHomePage(driver);
	 inputvalue(ahp.getUserName(),"senthuran");
	}
	
	
	
	@When("User enters the valid password")
	public void user_enters_the_valid_password()
	{
		AdactinHomePage ahp = new AdactinHomePage(driver);
		 inputvalue(ahp.getPassWord(),"Senthuran@12");

	}
	*/
	
	@And("User clicks the login button")
	public void user_clicks_the_login_button() 
	{
		AdactinHomePage ahp = new AdactinHomePage(driver);
		 click(ahp.getLoginButton());

	}
	
	
	@Then("User validates the navigation from logoin page to search hotel page")
	public void user_validates_the_navigation_from_logoin_page_to_search_hotel_page() 
	{
		AdactinHomePage ahp = new AdactinHomePage(driver);

		String src="Adactin.com - Search Hotel";
		String desc=driver.getTitle();
		//System.out.println(desc);
        org.junit.Assert.assertEquals(src, desc);
     
	}

	@When("user selects the location in the location field")
	public void user_selects_the_location_in_the_location_field()
	{
		AdactinSearchHotel ash = new AdactinSearchHotel(driver);
		dropDownByIndex(ash.getLocation(), 1);
	}
	
	
	@When("user selects the hotels in the hotel field")
	public void user_selects_the_hotels_in_the_hotel_field() 
	{
		AdactinSearchHotel ash = new AdactinSearchHotel(driver);
		dropDownByValue(ash.getHotels(), "Hotel Creek");

	}
	
	
	@When("user selects the roomtype in the roomtype field")
	public void user_selects_the_roomtype_in_the_roomtype_field()
	{
		AdactinSearchHotel ash = new AdactinSearchHotel(driver);
		dropDownByIndex(ash.getRoomType(), 1);


	}
	
	@When("user selects the numberofroom in the nof field")
	public void user_selects_the_numberofroom_in_the_nof_field()
	{
		AdactinSearchHotel ash = new AdactinSearchHotel(driver);
		dropDownByVisibleText(ash.getRoomNos(), "1 - One");
	}
	
	@When("user selects the checkindate in the checkin field")
	public void user_selects_the_checkindate_in_the_checkin_field() {

		AdactinSearchHotel ash = new AdactinSearchHotel(driver);
        ash.getFromDate().clear();
        inputvalue(ash.getFromDate(), "03/06/2022");
	}
	
	@When("user selects the checkoutdate in the checkout field")
	public void user_selects_the_checkoutdate_in_the_checkout_field() {
		AdactinSearchHotel ash = new AdactinSearchHotel(driver);
        ash.getToDate().clear();
        inputvalue(ash.getToDate(), "05/06/2022");


	}
	
	@When("user selects the numberofadult in the adultperroom field")
	public void user_selects_the_numberofadult_in_the_adultperroom_field() {

		AdactinSearchHotel ash = new AdactinSearchHotel(driver);
		dropDownByVisibleText(ash.getAdultRoom(), "2 - Two");

	}
	
	@When("user select the  numberofchild in the childperroom field")
	public void user_select_the_numberofchild_in_the_childperroom_field() {

	}
	
	@When("user click search button to search the hotel details")
	public void user_click_search_button_to_search_the_hotel_details() {

		AdactinSearchHotel ash = new AdactinSearchHotel(driver);
		click(ash.getSearch());

	}
	
	@Then("user validates the navigation from searchpage to select page")
	public void user_validates_the_navigation_from_searchpage_to_select_page() {
     
		String src="Adactin.com - Select Hotel";
        String desc= driver.getTitle();
        org.junit.Assert.assertEquals(src, desc);
	}
	@When("user select the radiobutton if the detail enter is correct")
	public void user_select_the_radiobutton_if_the_detail_enter_is_correct() {
		AdactinSelectHotel assh= new AdactinSelectHotel(driver);
		click(assh.getSelectHotel());
     
	}
	@When("user click the continue button for continue the booking")
	public void user_click_the_continue_button_for_continue_the_booking() {
		AdactinSelectHotel assh= new AdactinSelectHotel(driver);
		click(assh.getContinueButton());

	}
	@Then("user validate the navigation from select page to roombookingpage")
	public void user_validate_the_navigation_from_select_page_to_roombookingpage() {

	}


@When("user enters the firstname in the first name field")
public void user_enters_the_firstname_in_the_first_name_field() {
AdactinRoomBooking arb= new AdactinRoomBooking(driver);
inputvalue(arb.getFirstName(), "senthuran");

}
@When("user enters the lastname in the last name field")
public void user_enters_the_lastname_in_the_last_name_field() {

	AdactinRoomBooking arb= new AdactinRoomBooking(driver);
	inputvalue(arb.getLastName(), "sridhar");

}
@When("user enters the address in the address field")
public void user_enters_the_address_in_the_address_field() {
	AdactinRoomBooking arb= new AdactinRoomBooking(driver);
	inputvalue(arb.getAddress(), "chennai");


}
@When("user enters the credit card details in the card details field")
public void user_enters_the_credit_card_details_in_the_card_details_field() {

	AdactinRoomBooking arb= new AdactinRoomBooking(driver);
inputvalue(arb.getCardNumber(), "1234567891234567");
}
@When("users selects the cardtpe in the card type")
public void users_selects_the_cardtpe_in_the_card_type() {
	AdactinRoomBooking arb= new AdactinRoomBooking(driver);
   dropDownByIndex(arb.getCardType(), 2);

}
@When("users Selects the card expiry month in the select month field")
public void users_selects_the_card_expiry_month_in_the_select_month_field() {
	AdactinRoomBooking arb= new AdactinRoomBooking(driver);
dropDownByIndex(arb.getCardMonExpiry(), 7);

}
@When("users selects the card expiry year in the select year field")
public void users_selects_the_card_expiry_year_in_the_select_year_field() {
	AdactinRoomBooking arb= new AdactinRoomBooking(driver);
dropDownByValue(arb.getCardYeaExpiry(), "2022");

}
@When("users enters the cvv number in the cvvnumber field")
public void users_enters_the_cvv_number_in_the_cvvnumber_field() {
	AdactinRoomBooking arb= new AdactinRoomBooking(driver);
inputvalue(arb.getSecretCode(), "0123");

}
@When("users click the booknow button to confirm the booking")
public void users_click_the_booknow_button_to_confirm_the_booking() {
	AdactinRoomBooking arb= new AdactinRoomBooking(driver);
  click(arb.getBookNow());

}
@When("user click myliternary to view the booking detail")
public void user_click_myliternary_to_view_the_booking_detail() {
	AdactinBookingConfirmation abc = new AdactinBookingConfirmation(driver);
	click(abc.getMyItinerary());
	
}
@Then("User navigate into the book intenary page")
public void user_navigate_into_the_book_intenary_page() {
}
@When("user click logut to come out of application")
public void user_click_logut_to_come_out_of_application() 
{
	AdactinBookedItinerary abi =new AdactinBookedItinerary(driver);
	click(abi.getLogOut());
}
@Then("user close the application")
public void user_close_the_application() 
{
	
}






}
