package com.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\Cucumber_Structure\\Practice_cucumber\\src\\test\\resource\\features\\EMS_login.feature",
glue={"stepdefinations","App_Hooks"},
plugin={"pretty",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="not @Skip"
		) 
public class Test_Runner {

}
