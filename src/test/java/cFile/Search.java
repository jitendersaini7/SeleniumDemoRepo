package cFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
    
  
    @Given("^I visit the website as a guest user$")
    public void i_visit_the_website_as_a_guest_user() {
        
        System.out.println("---I visit the website as a guest user--");
      
    }

    @When("^I select the books option from the Search dropdown$")
    public void i_select_the_option_from_the_search_dropdown() {
    	  System.out.println("---I select the books option from the Search dropdown---");
    }
    
    @When("^I select the baby option from the Search dropdown$")
    public void I_select_the_baby_option_from_the_Search_dropdown() {
    	  System.out.println("---I select the books option from the Search dropdown---");
    }

    @And("^I click on search icon option$")
    public void i_click_on_search_icon_option() {
    	System.out.println("---I click on search icon option---");
       
    }

    @Then("^I should see the page having heading as Amazon Best Reads is getting displayed$")
    public void i_should_see_the_page_having_heading_as_is_getting_displayed() {
       System.out.println("---I should see the page having heading as is getting displayed---");
    }
    
    @Then("I should see the page having heading as Offers on Baby products is getting displayed$")
    public void i_should_see_the_page_having_heading_as_Offers_on_Babby_products_is_getting_displayed() {
       System.out.println("---I should see the page having heading as is getting displayed---");
    }

    @But("^I should not see the other category products$")
    public void i_should_not_see_the_other_category_products() {
      System.out.println("---I should not see the other category products---");
    }

}
