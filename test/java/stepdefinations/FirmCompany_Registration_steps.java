package stepdefinations;

import com.qa.factory.Driver_Factory;
import com.qa.pages.Firm_Company_Registration_Page;



import io.cucumber.java.en.When;

public class FirmCompany_Registration_steps {
	Firm_Company_Registration_Page page=new Firm_Company_Registration_Page(Driver_Factory.getDriver());
	

	@When("User click on Radio buttons")
	public void user_click_on_radio_buttons() {
		page.select_company_type();
	}

	@When("User enter valid firm credentials{string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_valid_firm_credentials_and_and_and_and_and_and_and_and_and_and_and_and_and(String cname, String sname, String email, String pwd, String mnumber, String Anumber, String caddress, String reg, String gst, String pan, String name, String pmail, String pnumber, String adress) {
		page.Enter_the_company_data(cname, sname, email, pwd, mnumber, Anumber, caddress, reg, gst, pan, name, pmail, pnumber, adress);
	}
	
}
