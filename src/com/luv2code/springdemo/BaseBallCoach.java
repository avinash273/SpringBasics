package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {
    //define a private filed for dependcy
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseBallCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30 mins on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
