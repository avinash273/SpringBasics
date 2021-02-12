package com.luv2code.springdemo;

/**
 * Requirements:
 * App should be configurable
 * Easily change the coach for another sport
 * Hockey, Cricket, Tennis etc..
 */
public class MyApp {
    public static void main(String[] args) {
        /**
         * create the object
         * calling the interface itself here
         * But, the coach variable is not configurable yet, as TrackCoach is hardcoded
         * Ideally this should be loaded from a config file, this is where spring factory object comes into play
         */

        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
        theCoach = new BaseBallCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
