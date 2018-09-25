package com.voyager.serenity.spring.steps;

import com.voyager.serenity.spring.page.google.GooglePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class GoogleSteps extends ScenarioSteps {

	GooglePage landingPage;

	public GoogleSteps(Pages pages) {super(pages);}

	@Step
	public GoogleSteps open_landing_page(){
		landingPage.open();
		return this;
	}

	@Step
	public GoogleSteps search_for_keyword(String keyword){
		landingPage.search(keyword.toLowerCase());
		return this;
	}

	@Step
	public GoogleSteps get_result(String keyword){
		assert landingPage.getResult(keyword);
		return this;
	}

}
