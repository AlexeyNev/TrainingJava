package Enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today1 = new Today(WeekDays.MONDAY);
        today1.daysInfo();

        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        WeekDays w3 = WeekDays.MONDAY;
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY));
        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays [] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WENSDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    private WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WENSDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}

class Today {
    WeekDays weekDay;

    public Today (WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WENSDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Иди на работу!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Выходной!");
                break;
        }
        System.out.println("Настроение в этот день: " + weekDay.getMood());
    }
}