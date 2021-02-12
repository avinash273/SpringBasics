package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //setter method
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public CricketCoach() {
        System.out.println("Cricket coach inside no-arg constructor");
    }

    //this is inversion of control
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }

    //this is dependency injection
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
