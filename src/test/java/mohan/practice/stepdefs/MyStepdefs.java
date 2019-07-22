package mohan.practice.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepdefs {
    @Given("I am running something before every scenario")
    public void iAmRunningSomethingBeforeEveryScenario() {
        System.out.println("I am running before every scenario from background\n");
    }

    @When("I do something {string}")
    public void iDoSomething(String arg0) {
    }

    @And("I do something in integer {int}")
    public void iDoSomethingInInteger(int arg0) {
    }

    @When("I do something")
    public void iDoSomething(List<Map<String, String>> data) {
        for(Map<String, String> eachKey : data){
            System.out.println(eachKey.get("url"));
            String[] creds = eachKey.get("credentials").split(",");
            System.out.println("username : "+creds[0]);
            System.out.println("password : "+creds[1]);
        }
    }
}
