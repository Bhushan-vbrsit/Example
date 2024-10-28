package stepdefinations;


import com.qa.factory.Driver_Factory;
import com.qa.pages.Private_Limited_Registration_Pages;
import io.cucumber.java.en.*;

public class Private_LimitedRegistration_steps {
	
	Private_Limited_Registration_Pages page=new Private_Limited_Registration_Pages(Driver_Factory.getDriver());
	@When("User click on Employer dropdown")
	public void user_click_on_employer_dropdown() {	
		 page.click_employer_btn();
	}

	@When("User click on Registration button")
	public void user_click_on_registration_button() {
		 page.click_registration_btn();
	}

	@When("User click on Radio button")
	public void user_click_on_radio_button() {
		page.select_company_type();
	}

	@When("User enter valid {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_valid_and_and_and_and_and_and_and_and_and_and_and_and_and(String cname, String sname, String email, String pwd, String mnumber, String Anumber, String caddress, String cin, String gst, String pan, String name, String pmail, String pnumber, String adress) {
		page.Enter_the_company_data(cname, sname, email, pwd, mnumber, Anumber, caddress, cin, gst, pan, name, pmail, pnumber, adress);
	}
	@Then("User click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		page.click_on_submit_btn();
	}
	@Then("User can verify the home button is working or not")
	public void user_can_verify_the_home_button_is_working_or_not() {
		
	}
    @When("User enter Invalid {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_invalid(String coname, String sername, String cemail, String pwds, String monumber, String Avnumber, String comaddress, String comcin, String comgst, String compan, String pname, String permail, String compnumber, String peradress)  {
		page.Enter_the_company_data(coname, sername, cemail, pwds, monumber, Avnumber, comaddress, comcin, comgst, compan, pname, permail, compnumber, peradress);
		
	}
    @When("User enter password {string} into password field")
    public void user_enter_password_into_password_field(String pwd) {
    	page.enter_password(pwd);
    }
    @Then("User can verify the after clicking the eye icon password should be visible or not")
    public void user_can_verify_the_after_clicking_the_eye_icon_password_should_be_visible_or_not() throws InterruptedException {
    	page.click_on_eye_icon();
    }

}
