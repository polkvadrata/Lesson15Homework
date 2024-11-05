package app.models;

import app.enums.Day;
import app.services.Advise;

public class WeekAdvise implements Advise {

    @Override
    public void advise(Day currentDay) {
        switch (currentDay) {
            case MONDAY:
                System.out.println("Це тількі початок");
                break;
            case TUESDAY:
                System.out.println("Це все ще початок тижня");
                break;
            case WEDNESDAY:
                System.out.println("Вже середина тижня");
                break;
            case THURSDAY:
                System.out.println("Залишилося зовсім трохи");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("Пропоную відвідати місцевий Паб");
                break;
            case SUNDAY:
                System.out.println("Пропоную сходити до батьків");
                break;
            default:
                System.out.println("Для такого дня порад немає");
        }
    }
}