package app;

import app.models.WeekAdvise;
import app.enums.Day;

public class MainProgram {
    public static void main(String[] args) {

        WeekAdvise myAdvise = new WeekAdvise();

        myAdvise.advise(Day.MONDAY);
        myAdvise.advise(Day.FRIDAY);
        myAdvise.advise(Day.SUNDAY);

    }
}
