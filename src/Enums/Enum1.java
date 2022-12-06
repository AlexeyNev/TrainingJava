package Enums;

public class Enum1 {
    public static void main(String[] args) {
        Today today1 = new Today(WeekDays.MONDAY);
        Today today2 = new Today(WeekDays.SUNDAY);
        today1.daysInfo();
        today2.daysInfo();
    }
}

enum WeekDays {
    MONDAY, TUESDAY, WENSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
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
    }
}