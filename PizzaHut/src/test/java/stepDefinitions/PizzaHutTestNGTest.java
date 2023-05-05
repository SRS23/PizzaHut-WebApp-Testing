package stepDefinitions;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PizzaHutPaymentTest;
import testReports.PizzaHutExtentReports;
import utilities.CommonFunctions;
import utilities.DriverInit;
import utilities.GetDataFromExcell;

public class PizzaHutTestNGTest extends PizzaHutExtentReports{
	//We Need to run test between 11 am to 11pm . Because this timings are pizzahut order taking timings.
	//as we are testing order placing with payment, we need run between 11am to 11pm , otherwise test fails.
	
		GetDataFromExcell obj = new GetDataFromExcell();
		 PizzaHutPaymentTest hut =  new PizzaHutPaymentTest(DriverInit.getDriver());
		 CommonFunctions cfs = new CommonFunctions();
		 
		@BeforeTest
		public void websiteLinks () throws IOException {
			
			System.out.println(obj.getUrlLink());
		}
	
		@Test(priority=1)
		@Given("Website launche with url")
		public void website_launche_with_url() throws IOException {
			
			reportConfig1();
			CreateTest1("WebSite Launched with given Url");	
		}
		
		
		@Test(priority=3)
		@Then("A black color auto pop up screen will be displayed. Close it")
		public void a_black_color_auto_pop_up_screen_will_be_displayed_close_it() {
			
			CreateTest1("A black color auto pop up screen will be displayed. Close it");
				hut.closeButton();
			
		}
		
		@Test(priority=2)
		@Then("set the user delivery location as Lulu Mall, Bangalore")
		public void set_the_user_delivery_location_as_lulu_mall_bangalore() throws InterruptedException {
			
			CreateTest1("set the user delivery location as Lulu Mall, Bangalore");
			
			cfs.scrollWebPage();
			hut.enterDeliverAddress();
			
		}
		
		@Test(priority=4)
		@Then("click on view all deals")
		public void click_on_view_all_deals() {
			CreateTest1("click on view all deals");
		    cfs.scrollWebPage3();
			hut.viewDealsButton();
		}
		
		@Test(priority=5)
		@Then("enter delivery address")
		public void enter_delivery_address() throws InterruptedException {
			CreateTest1("enter delivery address"); //CreateTest1();
			hut.enterDeliverLocation();
		}
		
		@Test(priority=6)
		@Then("The user is now on the Deals page. Validate that the URL has text as ‘deals’")
		public void the_user_is_now_on_the_deals_page_validate_that_the_url_has_text_as_deals() throws InterruptedException {
			CreateTest1("The user is now on the Deals page. Validate that the URL has text as ‘deals’");
			hut.urlDealstest();
			
			
		}
		
		@Test(priority=7)
		@Then("Go to sides and add any item that is below 200")
		public void go_to_sides_and_add_any_item_that_is_below_200 (){
			
			CreateTest1("Go to sides and add any item that is below 200");
			hut.clickKidsTreatDeal149();
			hut.addDealToBasket();
			
			
		}
		
		@Test(priority=8)
		@Then("Validate that the product is added under Basket but checkout button price item is still not showing")
		public void validate_that_the_product_is_added_under_basket_but_checkout_button_price_item_is_still_not_showing() {
		
			CreateTest1("Validate that the product is added under Basket but checkout button price item is still not showing");
			hut.itemsOnCheckoutButton();
			hut.checkoutButtonNotShowingPrice();
			
		}
		

		@Test(priority=9)
		@Then("Navigate to the Drinks page")
		public void navigate_to_the_drinks_page() {
			
			CreateTest1("Navigate to the Drinks page");
			hut.clickOnDrinks();
			
			
		}
		
		@Test(priority=10)
		@Then("Add any two drinks so that total cart pricing is more than 200")
		public void add_any_two_drinks_so_that_total_cart_pricing_is_more_than_200() {
			
			CreateTest1("Add any two drinks so that total cart pricing is more than 200");
			hut.addDrinks();
			
		}
		
		@Test(priority=11)
		@Then("Click on the Checkout button. The user will be navigated to the checkout page")
		public void click_on_the_checkout_button_the_user_will_be_navigated_to_the_checkout_page() {
			
			CreateTest1("Click on the Checkout button. The user will be navigated to the checkout page");
			hut.chekoutOption();
			
			
		}
		
		@Test(priority=12)
		@Then("Validate that the Online Payment radio button is selected by default")
		public void validate_that_the_online_payment_radio_button_is_selected_by_default() {
			
			CreateTest1("Validate that the Online Payment radio button is selected by default");
			hut.onlinePaymentRadioButton();
			
			
		}
		
		@Test(priority=13)
		@Then("Change the Payment option to Cash")
		public void change_the_payment_option_to_cash() {
			CreateTest1("Change the Payment option to Cash");
			hut.clickOnCash();
			
		}
		
		@Test(priority=14)
		@Then("Validate that the I agree checkbox is checked by default")
		public void validate_that_the_i_agree_checkbox_is_checked_by_default() {
			
			CreateTest1("Validate that the I agree checkbox is checked by default");
			hut.checkbokChecking();
		}
		
		@Test(priority=15)
		@Then("Enter name, mobile, and email address")
		public void enter_name_mobile_and_email_address() {
			
			CreateTest1("Enter name, mobile, and email address");
			hut.enterNameNumberEmail();
			
		}
		
		@Test(priority=16)
		@Then("Click on the Apply Gift Card link")
		public void click_on_the_apply_gift_card_link() {
		
			CreateTest1("Click on the Apply Gift Card link");
			hut.clickonApplyGiftCard();
			
		}
		
		@Test(priority=17)
		@When("A pop up should appear. Click on the Voucher")
		public void a_pop_up_should_appear_click_on_the_voucher() {
			
			CreateTest1("A pop up should appear. Click on the Voucher");
			hut.clickVoucher();
			
		}
		
		@Test(priority=18)
		@Parameters("VoucherCode")
		@Then("Give the Voucher code as 12345 and submit")
		public void give_the_voucher_code_as_and_submit() {
			
			CreateTest1("Give the Voucher code as 12345 and submit");
			hut.enterVoucherCode();
			hut.clickRedeem();
			
		}
		
		@Test(priority=19)
		@Then("Validate if an error is coming that the number is incorrect")
		public void validate_if_an_error_is_coming_that_the_number_is_incorrect() {
		
			CreateTest1("Validate if an error is coming that the number is incorrect");
			hut.errorValidation();
			
			
		}
		
		@Test(priority=20)
		@Then("Close the voucher pop up")
		public void close_the_voucher_pop_up() {
			
			CreateTest1("Closed the voucher pop up");
			hut.closeVoucherPopUp();
			
		}
		
		@Test(priority=21)
		@Then("The user should again navigate to your Basket page.")
		public void the_user_should_again_navigate_to_your_basket_page() {
		
			CreateTest1("The user  navigated to Basket page.");
			
			
		}
		
		@AfterTest
		public void flushh() {
			flushTest1();
			DriverInit.quitDriver();
		}
		
}
