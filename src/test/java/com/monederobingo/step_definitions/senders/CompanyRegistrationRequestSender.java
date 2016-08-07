/* Copyright 2016 Sabre Holdings */
package com.monederobingo.step_definitions.senders;

import com.monederobingo.api.client.requests.auth.registration.CompanyRegistrationRequest;
import com.monederobingo.step_definitions.domain_holders.ServiceResultHolder;
import cucumber.api.java.en.When;

public class CompanyRegistrationRequestSender
{
    private final ServiceResultHolder serviceResultHolder;
    private final CompanyRegistrationRequest companyRegistrationRequest;

    public CompanyRegistrationRequestSender(ServiceResultHolder serviceResultHolder, CompanyRegistrationRequest companyRegistrationRequest)
    {
        this.serviceResultHolder = serviceResultHolder;
        this.companyRegistrationRequest = companyRegistrationRequest;
    }

    @When("^User sends registration request$")
    public void userSendRegistrationRequest() throws Throwable
    {
        serviceResultHolder.set(companyRegistrationRequest.send());
    }
}
