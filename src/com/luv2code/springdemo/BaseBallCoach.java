package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "spend 30 mins on batting practice";
    }
}
