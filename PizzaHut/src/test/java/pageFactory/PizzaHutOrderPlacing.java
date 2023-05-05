package pageFactory;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.CommonFunctions;

public class PizzaHutOrderPlacing {
	
	 CommonFunctions cfs = new CommonFunctions();
	
	public PizzaHutOrderPlacing(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter your location for delivery']")
	WebElement enterLocation;
	
	@FindBy(how = How.XPATH, using = "//button[@data-testid=\"close-offer-collection\"]")
	WebElement closebutton;

	@FindBy(how = How.XPATH, using = "//button[@class=\"button button--secondary text-center\"]")
	WebElement startYourOrder;
	
	//button[@data-synth="close-scheduled-orders"]
	@FindBy(how = How.XPATH, using = "(//span[@class=\"rounded-full bg-white\"])[1]")
	WebElement radioButton;

	@FindBy(how = How.XPATH, using="//a[@data-synth='link--pizzas--side']") WebElement PizzaMenuBar;
	
	@FindBy(how =How.XPATH, using="//button[@data-synth=\"button--corn-&-cheese-pan-medium--one-tap\"]")
	WebElement cornPizza;
	
	
	
	@FindBy(how =How.XPATH, using="(//select[@class=\"phdv-dropdown-select bg-grey-lightest p-10 w-full typography-6 bold\"])[26]")
	WebElement sizeDropdown;
	
	@FindBy(how = How.XPATH, using="(//button[@class=\"button button--md button--green flex-1 font-semibold\"])[26]")
	WebElement CheesyMushroomMagic;
	
	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'₹')])[60]")
     WebElement subtotalElement;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'₹')])[61]")
	 WebElement totalTaxElement;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'₹')])[63]")
	 WebElement basketValueElement;

	@FindBy(how = How.XPATH, using = "//div[@class='display-supplement-value']")
	WebElement supplementValueElement;

	@FindBy(css = "a[data-synth='link--checkout']")
	 WebElement checkoutButton;
	
	@FindBy(how = How.CSS, using="span.bg-green-dark") WebElement itemCountCheckout;
	
	@FindBy(xpath = "(//span[@data-synth=\"basket-value\"])[2]") WebElement itemsPriceCheckout;

	
	@FindBy(how = How.XPATH, using="//a[@data-synth=\"link--drinks--side\"]")WebElement drinksOption;
	
	@FindBy(how = How.XPATH, using=("(//button[@class='button button--md button--green flex-1 font-semibold'])[1]"))
	WebElement addPepsi;
	
	@FindBy(xpath="(//span[@data-synth=\"basket-value\"])[2]")WebElement presentBasketValue;
	
	@FindBy(xpath = "(//button[@class=\"icon-close relative opacity-25 text-grey ml-10 p-10\"])[1]")
	WebElement removeCornPizza;
				
	@FindBy(xpath = "(//button[@class=\"icon-close relative opacity-25 text-grey ml-10 p-10\"])[1]")
	WebElement removeMushroomPizza;
	
	@FindBy(xpath=("//span[@class=\"bg-green-dark pl-5 pr-5 rounded\"]"))WebElement itemCountnow;
	
	@FindBy(how = How.XPATH, using="(//span[@class=\"absolute inset-0 flex-center\"])[2]")
	WebElement clickCheckout;
	
	@FindBy(xpath="//div[@class=\"pt-20 bg-white p-20 m-20 rounded text-center shadow relative\"]") 
	WebElement popUp;
	
	public void enterDeliverAddress(String text) throws InterruptedException {
		cfs.scrollWebPage();
	    enterLocation.sendKeys(text);
	    enterLocation.sendKeys(Keys.CLEAR);
	    enterLocation.clear();
	    enterLocation.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	    enterLocation.sendKeys(Keys.DELETE);
	    
	    enterLocation.sendKeys("lulu mall bangalore");
	    Thread.sleep(5000); //it is used because to load locations it takes time..
	    enterLocation.sendKeys(Keys.BACK_SPACE);
	    enterLocation.sendKeys("e");
	    Thread.sleep(5000);
	    enterLocation.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	}

	public void closeButton() {

		closebutton.click();

	}
	//public void startYourOrderButton() {

	//	startYourOrder.click();

	//}
	
	public void enterDeliverAddresss() throws InterruptedException {
		
		 enterLocation.sendKeys(Keys.CLEAR);
		    enterLocation.clear();
		    enterLocation.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		    enterLocation.sendKeys(Keys.DELETE);
		    
		    enterLocation.sendKeys("Kadapa Railway Station");
		    enterLocation.sendKeys(Keys.BACK_SPACE);
		    enterLocation.sendKeys(Keys.BACK_SPACE);
		   
		    enterLocation.sendKeys("on");
		    Thread.sleep(5000);
		    enterLocation.sendKeys(Keys.ENTER);
		  
	}

	public void radioButoonChecking() {
		if (radioButton.isEnabled()) {
		    System.out.println("Radio button is enabled");
		} else {
		    System.out.println("Radio button is not enabled");
		    }
		
		 boolean isEnabled = radioButton.isEnabled();

		    assertTrue("Radio button is enabled", isEnabled);
	
	}
	
	public void clickOnPizzaMenu() {
		
		PizzaMenuBar.click();
	}
	
	public void addingCornPizza() {
		
		cornPizza.click();
	}
	
	public void selectSizeOfPizza() {
		Select select = new Select(sizeDropdown);
        select.selectByIndex(5);
        
	}
	public void addingMushroomPiza() {

		CheesyMushroomMagic.click();
	}
	
	
	public void checkOutPrice() {
		
		 double subtotal = Double.parseDouble(subtotalElement.getText().replaceAll("[^\\d.]", ""));
		 double totalTax = Double.parseDouble(totalTaxElement.getText().replaceAll("[^\\d.]", ""));
		 double restaurantCharges = Double.parseDouble(supplementValueElement.getText().replaceAll("[^\\d.]", ""));
		 double expectedBasketValue = subtotal + totalTax + restaurantCharges;
	     double actualBasketValue = Double.parseDouble(basketValueElement.getText().replaceAll("[^\\d.]", ""));
		  // add delta value to handle rounding errors
		 
		 System.out.println("Sub Total "+subtotal+"  Total Tax "+ totalTax+"  Restauramt Charges "+restaurantCharges);
       System.out.println("Expected Basket Value is: "+expectedBasketValue);
       System.out.println("Actual Basket Value "+actualBasketValue);
       assertEquals(expectedBasketValue, actualBasketValue, 0.001);
       if(expectedBasketValue == actualBasketValue) {
		 System.out.println("prices matched.");
       }
       else {
    	   System.out.println("prices not matched.");
       }
	}
		    
	public void verifyCheckoutButtonContainsItemCount() {
		
		String itemCount = itemCountCheckout.getText().replaceAll("[^\\d]", "");
		System.out.println("Number of items selected showing on Checkout: " + itemCount);
	}
		
	 public void checkoutButtonContainsItemsPrice() {
		  
		 String basketValue = basketValueElement.getText();
		 System.out.println("Basket Value: " + basketValue);

	   }
		
    public void clickOnDrinks() {
			   drinksOption.click();
		   }
		   
    public void selectingPepsi() {
			   addPepsi.click();
		   }

		public void itemsCount() {
			String itemCountText = itemCountCheckout.getText();
			int itemCount = Integer.parseInt(itemCountText.replaceAll("[^\\d]", ""));
			System.out.println("Number of items selected: " + itemCount);


		}
		public void currentPrice() {
			 String currentBasketValue = presentBasketValue.getText();
			 System.out.println("Basket Value: " + currentBasketValue);
		}
	public void removePizzas() throws InterruptedException {
		removeCornPizza.click();
		Thread.sleep(5);
		removeMushroomPizza.click();
		
	}
	
	public void currentItems() {
	    String itemCount = itemCountnow.getText().replaceAll("[^\\d]","");
	    int actualItemCount = Integer.parseInt(itemCount);
	    int expectedItemCount = 1;
	    
	    assertEquals(actualItemCount, expectedItemCount);
	    System.out.println("Current Items in Basket " + actualItemCount);
	}

	
	public void clickOnCheckOutButton() {
		clickCheckout.click();
	}
	
	public void popUpDisplay() {
		popUp.isDisplayed();
		Assert.assertTrue(popUp.isDisplayed());
	}
}
