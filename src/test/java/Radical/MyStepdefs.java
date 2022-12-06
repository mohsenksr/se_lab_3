package Radical;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Radical radical;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        radical = new Radical();
    }

    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I get radical of a division by b the two values$")
    public void iAddTheTwoValues() {
        result = radical.aDivisionByb(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

    @Given("^Two input values, <a> and <b>$")
    public void twoInputValuesFirstAndSecond() {
    }

    @Then("^I expect the result <result>$")
    public void iExpectTheResultResult() {
    }
}