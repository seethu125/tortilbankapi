package com.api.bank;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.api.bank.enitities.BankBranch;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.base.Objects;

public class StepDefs extends SpringIntegrationTest{
	ResponseEntity<BankBranch> response = null;

    
    @When("the client calls /banks/ with {string}")
    public void the_client_calls_bank_with_branch_ifsc(String string) throws Throwable {
    	response = restTemplate.exchange("http://localhost:8080/banks/" + string, HttpMethod.GET,null, BankBranch.class);
    }
    
    @Then("the bank branch api receives status code of {int}")
    public void the_client_receives_status_code_of_200_for_bank_branch_api(Integer responseCode) {
    	assert(response.getStatusCode().value() ==  responseCode);
    }
    
    @Then("expects a JSON equivaluent to {string}")
    public void the_client_receives_a_bank_branch_value(String string) throws JsonMappingException, JsonProcessingException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	BankBranch sampleBankBranch = objectMapper.readValue(string, BankBranch.class);
    	assert(Objects.equal(response.getBody(), sampleBankBranch));
    }


}
