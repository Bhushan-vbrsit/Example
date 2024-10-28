package stepdefinations;

import com.qa.factory.Driver_Factory;
import com.qa.pages.Company_Update_Registration_page;

import io.cucumber.java.en.*;

public class Company_Update_Registration_Steps {
	Company_Update_Registration_page page=new Company_Update_Registration_page(Driver_Factory.getDriver());
	@When("User click on Summary Registration button")
	public void user_click_on_summary_registration_button() throws InterruptedException {
		page.click_on_summary_button();
	}

	@When("User click on Edit button")
	public void user_click_on_edit_button() throws InterruptedException {
	    page.click_on_edit_button();
	}

	@When("^User update the (.*) and (.*)$")
	public void user_update_the_contact_number_and_company_address(String phonenumber,String address) throws InterruptedException {
		page.enter_phone_number(phonenumber,address);
	}

	@Then("User click on update company button")
	public void user_click_on_update_company_button() throws InterruptedException {
		page.click_on_update_button();
	}
	@Then("^User enter the (.*) in search field the related companies should be displayed or not")
	public void user_enter_the_evy_in_search_field_the_related_companies_should_be_displayed_or_not(String com) {
	    page.search_company(com);
	}
	@When("User click on Delete icon")
	public void user_click_on_delete_icon() {
	   page.click_on_delete_icon();
	}

	@And("User click on delete button")
	public void user_click_on_delete_button() throws InterruptedException {
	    page.click_on_delete_btn();
	}
	@Then("User click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {
		page.click_on_logout_button();
	}
}
