package com.mj147;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AlarmClock {

    private LocalTime time = LocalTime.now();
    private LocalTime alarm;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private String isWorking = "off";
    private int lateEnd = 0;

    public void setAlarm(LocalTime alarm) {
        this.alarm = alarm;
    }

    public void turnOn() {
        isWorking = "on";
    }

    public void turnOf() {
        isWorking = "of";
    }

    public void turnOf(int lateEnd) {
        isWorking = "of";
        this.lateEnd = lateEnd;
    }

    public void clock() {

        LocalTime time2 = null;
        LocalTime endTime = LocalTime.now().plusSeconds(lateEnd);

        while  (isWorking == "on" || !time.isAfter(endTime)) {

            time = LocalTime.now();

            if (time2 == null || time.format(formatter).equals(time2.format(formatter))) {
                time2 = time.plusSeconds(1);
                System.out.print(time.format(formatter));
                System.out.print(alarm(3));
                System.out.println();
            }

        }
    }

    public String alarm(int numberOfRetries) {

        String alarmSound = "";
        if (time.isAfter(alarm.minusSeconds(1)) && time.isBefore(alarm.plusSeconds(numberOfRetries-1))) {
            alarmSound = " Alarm: tit tit tit!";
        }

        return alarmSound;
    }

}
