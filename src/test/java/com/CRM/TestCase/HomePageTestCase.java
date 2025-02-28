package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCase extends BaseClass {
	
	
  @Test (priority = 1)
  public void verifyURL() {
	  
	  String actUrl = hp.getAppURL();
	  Assert.assertTrue(actUrl.contains("crm"),"Test Fail: URL Not Matched! ");
	  System.out.println("Test Pass: URL Matched");
	  
  }
  
  @Test (priority = 2)
  public void verifyTitle() {
	  
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"), "Test Fail: Title Not Matched!! ");
	  System.out.println("Test Pass: Title Matched");
	  
  }
  
  @Test (priority = 3)
  public void verifySignInLink() {
	  
	  String nextPageUrl = hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"), "Test Fail: Login Page is not open! ");
	  System.out.println("Test Pass: Application is navigating to Login Page");
	  
  }
}
