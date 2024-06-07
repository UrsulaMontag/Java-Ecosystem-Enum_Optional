package org.example;

public enum Weekday {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String dayNormal;
    private final int weekdayNum;

    Weekday(String dayNormal, int weekdayNum) {
        this.dayNormal = dayNormal;
        this.weekdayNum = weekdayNum;
    }

    public String getDayNormal() {
        return dayNormal;
    }

    public int getWeekdayNum() {
        return weekdayNum;
    }

    public String weekdayOrWeekend(String day) {
        if (day.matches("Saturday") || day.matches("Sunday")) {
            return "weekend!";
        }
        return dayNormal;
    }


}
