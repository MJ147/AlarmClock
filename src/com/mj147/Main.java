package com.mj147;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        AlarmClock alarmClock = new AlarmClock();

        alarmClock.setAlarm(LocalTime.now().plusSeconds(5)); // set alarm time

//        alarmClock.turnOn();
        alarmClock.turnOf(10);

        alarmClock.clock();
    }
}
