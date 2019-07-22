package mohan.practice.base;

import cucumber.api.event.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CustomHooks implements ConcurrentEventListener {


    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunStarted.class, setUp);
        eventPublisher.registerHandlerFor(TestRunFinished.class, teardown);
    }
    
    private EventHandler<TestRunStarted> setUp = event ->{
        //anything that comes under before All must be static. Otherwise it work work
        beforeAll();
    };

    private static void beforeAll() {
        System.out.println("Before Suite");
    }


    private EventHandler<TestRunFinished> teardown = event ->{
        //anything that comes under teardown All must be static. Otherwise it work work
        tearDown();
    };

    private static void tearDown() {
        System.out.println("After Suite");
    }

    @Before
    public void beforeEveryScenarioFromCucumberHooks(){
        System.out.println("beforeEveryScenarioFromCucumberHooks");
    }


    @After
    public void afterEveryScenarioFromCucumberHooks(){
        System.out.println("after Every Scenario From Cucumber Hooks");
    }

}
