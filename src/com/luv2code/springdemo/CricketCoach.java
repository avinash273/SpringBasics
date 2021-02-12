package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //add new fields for email and team
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket coach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket coach: inside setter method - setTeam");
        this.team = team;
    }

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
