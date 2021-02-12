package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run 100m in 12 seconds";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it! " + fortuneService.getFortune();
    }
}
