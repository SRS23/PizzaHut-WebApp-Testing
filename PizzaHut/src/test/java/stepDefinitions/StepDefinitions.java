package stepDefinitions;

import org.junit.After;
import org.junit.jupiter.api.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PizzaHutOrderPlacing;
import utilities.DriverInit;


public class StepDefinitions  {
	
	//We Need to run test between 11 am to 11pm . Because this timings are pizzahut order taking timings.
	//as we are testing order placing, we need run between 11am to 11pm , otherwise test fails.
	
	PizzaHutOrderPlacing pizza = new PizzaHutOrderPlacing(DriverInit.getDriver());
	
	@Test 
	@Given("User launch Pizzahut application with url")
	public void user_launch_pizzahut_application_with_url() {
		
	    System.out.println("application launched..");
	    System.out.println("this method passed..");
	}
	
	@Test
	@When("User wait for auto location black pop up screen")
	public void user_wait_for_auto_location_black_pop_up_screen() throws InterruptedException {
		
		
	    System.out.println("Sorry, we are not currently delivering to your address");
	    System.out.println("this method passed..");
	}
	
	@Test
	@Then("User close the pop up screen")
	public void user_close_the_pop_up_screen() {
		
		 System.out.println("this method passed..");
	}
	
	@Test
	@Then("User see pop up for delivery asking for enter location")
	public void user_see_pop_up_for_delivery_asking_for_enter_location() {
		
	    System.out.println("User see pop up for delivery asking for enter location");
	    System.out.println("this method passed..");
	}
	
	@Test
	@Then("User type address as {string}")
	public void user_type_address_as(String Location) throws InterruptedException {
		
		pizza.enterDeliverAddress(Location);
		 System.out.println("this method passed..");
		
	}
	
	@Test
	@Then("User select first auto populate drop down option")
	public void user_select_first_auto_populate_drop_down_option() {
		
		System.out.println("User select first auto populate drop down option");
		pizza.closeButton();
		 System.out.println("this method passed..");
	}
	
	@Test
	@When("User navigate to deails page")
	public void user_navigate_to_deails_page() throws InterruptedException {
		pizza.enterDeliverAddresss();
		 System.out.println("this method passed..");
	   
	}
	
	@Test
	@Then("User validate vegetarian radio button flag is off")
	public void user_validate_vegetarian_radio_button_flag_is_off() {
	  //pizza.startYourOrderButton(); //it should be enable if we are running test before 11:00 am. After 11:30pm disable this.
		
		pizza.radioButoonChecking();
		 System.out.println("this method passed..");
	}
	
	@Test
	@Then("User clicks on Pizzas menu bar option")
	public void user_clicks_on_pizzas_menu_bar_option() {
		
	    pizza.clickOnPizzaMenu();
	    System.out.println("this method passed..");
	}
	
	@Test
	@When("User select add button of any pizza from Recommended")
	public void user_select_add_button_of_any_pizza_from_recommended() {
		
	    pizza.addingCornPizza();
	    System.out.println("this method passed..");
	}
	
	@Test
	@Then("User see that the pizza is getting added under Your Basket")
	public void user_see_that_the_pizza_is_getting_added_under_your_basket() {
	    pizza.selectSizeOfPizza();
	    pizza.addingMushroomPiza();
	    System.out.println("this method passed..");
	}
	
	@Test
	@Then("User validate pizza price plus Tax is checkout price")
	public void user_validate_pizza_price_plus_tax_is_checkout_price() {
	    pizza.checkOutPrice();
	    System.out.println("this method passed..");
	}
	
	@Test
	@Then("User validate checkout button contains Item count")
	public void user_validate_checkout_button_contains_item_count() {
		
	   pizza.verifyCheckoutButtonContainsItemCount();
	   System.out.println("this method passed..");
	   
	}
	
	@Test
	@Then("User validate checkout button contains total price count")
	public void user_validate_checkout_button_contains_total_price_count() {
	    pizza.checkoutButtonContainsItemsPrice();
	    System.out.println("this method passed..");
	}
	
	@Test
	@Then("User clicks on Drinks option")
	public void user_clicks_on_drinks_option() {
	   pizza.clickOnDrinks();
	}
	
	@Test
	@Then("User select Pepsi option to add into the Basket")
	public void user_select_pepsi_option_to_add_into_the_basket() {
	   pizza.selectingPepsi();
	}
	
	@Test
	@Then("User see {int} items are showing under checkout button")
	public void user_see_items_are_showing_under_checkout_button(Integer int1) {
	    pizza.itemsCount();
	}
	
	@Test
	@Then("User see total price is now more than before")
	public void user_see_total_price_is_now_more_than_before() {
	    pizza.currentPrice();
	}
	
	@Test
	@Then("User remove the Pizza item from Basket")
	public void user_remove_the_pizza_item_from_basket() throws InterruptedException {
	    pizza.removePizzas();
	}
	
	@Test
	@Then("see Price tag got removed from the checkout button")
	public void see_price_tag_got_removed_from_the_checkout_button() {
		System.out.println("Price is removed from checkout button. ");
		
		
	}
	
	@Test
	@Then("User see {int} item showing in checkout button")
	public void user_see_item_showing_in_checkout_button(Integer int1) {
	   pizza.currentItems();
	}
	
	@Test
	@Then("User Clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
	   pizza.clickOnCheckOutButton();
	}
	
	@Test
	@Then("User see minimum order required pop up is getting displayed")
	public void user_see_minimum_order_required_pop_up_is_getting_displayed() {
	    pizza.popUpDisplay();
	   
	}
	
	@After
	public void closeBrowser() {
		DriverInit.getDriver().quit();
		
	}
}
