package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 100m in 12 seconds";
    }

    @Override
    public String getDailyFortune() {
        return "running away from life wont help";
    }
}
