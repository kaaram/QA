package com.test.implementation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TransferImplementation {

	
	

@Given("^I succesfully logged into my account$")
public void I_succesfully_logged_into_my_account() throws Throwable {
    
}

@Given("^I am provided with your account details$")
public void I_am_provided_with_your_account_details() throws Throwable {
    
}

@Given("^Balance in my account \\$(\\d+) greater than minimum balance$")
public void Balance_in_my_account_$_greater_than_minimum_balance(int arg1) throws Throwable {
    
}

@When("^I initiate a transfer of \\$(\\d+) to your account$")
public void I_initiate_a_transfer_of_$_to_your_account(int arg1) throws Throwable {
   
}

@Then("^The transaction has to succeed$")
public void The_transaction_has_to_succeed() throws Throwable {
    
}

@Then("^My balance has to be reduced by \\$(\\d+)$")
public void My_balance_has_to_be_reduced_by_$(int arg1) throws Throwable {
    
}

@Given("^Balance in my account less than or equal to minimum balance$")
public void Balance_in_my_account_less_than_or_equal_to_minimum_balance() throws Throwable {
    
}

@Then("^The transaction has to fail$")
public void The_transaction_has_to_fail() throws Throwable {
    
}

@Then("^My balance has to remain same$")
public void My_balance_has_to_remain_same() throws Throwable {
    
}

@Then("^I have to be notified that there is no sufficient balance in my account.$")
public void I_have_to_be_notified_that_there_is_no_sufficient_balance_in_my_account() throws Throwable {
    
}


}
