package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Toady is you lucky day";
    }
}
