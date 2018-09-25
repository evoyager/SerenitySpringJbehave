package com.voyager.serenity.spring.definitions;

import com.voyager.serenity.spring.steps.GoogleSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GoogleDefinitions {
    @Steps
    GoogleSteps gs;

    @Given("the user accesses the google landing page")
    public void open_landing_page(){
        gs.open_landing_page();
    }

    @When("when they type in $keyword")
    public void search_for_keyword(String keyword){
        gs.search_for_keyword(keyword);
    }

    @Then("we should see $keyword")
    public void find_in_results(String keyword){
        gs.get_result(keyword);
    }
}
