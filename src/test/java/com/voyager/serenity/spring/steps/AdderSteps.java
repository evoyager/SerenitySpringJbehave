package com.voyager.serenity.spring.steps;

import com.voyager.serenity.spring.RandomNumberUtil;
import net.thucydides.core.annotations.Step;

public class AdderSteps {

    int currentNumber;
    int sum;

    @Step("given current number")
    public void givenNumber() {
        currentNumber = RandomNumberUtil.randomInt();
    }

    @Step("add up {0}")
    public void whenAdd(int adder) {
        sum = currentNumber + adder;
    }

    @Step("summed up")
    public void thenSummedUp() {
    }

}
