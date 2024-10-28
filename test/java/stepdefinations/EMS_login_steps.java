package stepdefinations;

import org.openqa.selenium.WebDriver;

import com.qa.factory.Driver_Factory;
import com.qa.pages.EMS_login_page;

import io.cucumber.java.en.*;

public class EMS_login_steps {
	WebDriver driver;
	EMS_login_page page=new EMS_login_page(Driver_Factory.getDriver());
	@When("User click on company Login button")
	public void user_click_on_company_login_button() {
		page.click_on_emslogin_btn();
	}

	@And("User Enter service name{string}")
	public void user_enter_service_name(String servicename) {
		page.click_on_enter_servicename(servicename);
	}
		@When("User click on submit method")
		public void user_click_on_submit_method() {
		page.click_on_submit_button();
	}

		@When("User Enter valid {string} and {string}")
		public void user_enter_valid_email_and_password(String username,String password) {
		page.enter_username(username);
		page.enter_password(password);
	}
		@Then("User click on signin button")
		public void user_click_on_signin_button() {
			page.click_on_signin();
		}
		@When("User enter otp {string}")
		public void user_enter_otp(String otp) {
			page.enter_otp(otp);
		}
		@When("^User Enter Invalid values into (.*)")
		public void user_enter_invalid_values_into_servicename(String servicename) {
			page.click_on_enter_servicename(servicename);
		}
		@When("^User Enter invalid (.*) and (.*)$")
		public void user_enter_invalid_username_and_password(String username,String password) {
			page.enter_username(username);
			page.enter_password(password); 
		}
		@And("User can click forgot password link")
		public void user_can_click_forgot_password_link() {
			page.click_on_forgot_password();
		}

		@When("User enter email {string}into email field")
		public void user_enter_email_sattava_gmail_com_into_email_field(String email) {
		   page.enter_email( email); 
		}

		@And("User click on send otp button")
		public void user_click_on_send_otp_button() {
		   page.click_send_otp_btn();
		}

		@And("User enter {string}otp into otp field")
		public void user_enter_otp_into_otp_field(String otp) {
		    page.enter_otp_forgot_password(otp);
		}


       @When("User enter New password {string} and confirm password {string}")
       public void user_enter_new_password_and_confirm_password(String newpassword, String confirmpassword) {
		   page.enter_new_password(newpassword);
		   page.confirm_password(confirmpassword);
		}

		@Then("User click on update password button")
		public void user_click_on_update_password_button() {
		    page.click_update_password_btn();
		}
//		@When("^User enter (.*)into email field")
//		public void user_enter_into_email_field(String email) {
//		page.enter_email(email);
//		}
		@Then("^User enter (.*)  and (.*)$")
		public void user_enter_path_and_path(String newpassword, String confirmpassword) {
			 page.enter_new_password(newpassword);
			 page.confirm_password(confirmpassword);
		}
}
