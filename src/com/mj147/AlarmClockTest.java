package com.mj147;

import java.time.LocalTime;

public class AlarmClockTest {

    public static void main(String[] args) {

        AlarmClock alarmClock = new AlarmClock();

        alarmClock.setAlarm(LocalTime.now());

        boolean resault = false;
        if (alarmClock.alarm(1) == " Alarm: tit tit tit!") {
            resault = true;
        }

        System.out.println("Alarm method test: " + resault);
    }
}

