package repository;

import java.util.Calendar;

import static java.util.Calendar.*;

public class DateRepositoryImpl implements DateRepository {
    @Override
    public String getMonth(int yearOfMonth) {
        String month;

        switch (yearOfMonth) {
            case JANUARY:
                month = "JANUARY";
                break;
            case FEBRUARY:
                month = "FEBRUARY";
                break;
            case MARCH:
                month = "MARCH";
                break;
            case APRIL:
                month = "APRIL";
                break;
            case MAY:
                month = "MAY";
                break;
            case JUNE:
                month = "JUNE";
                break;
            case JULY:
                month = "JULY";
                break;
            case AUGUST:
                month = "AUGUST";
                break;
            case SEPTEMBER:
                month = "SEPTEMBER";
                break;
            case OCTOBER:
                month = "OCTOBER";
                break;
            case NOVEMBER:
                month = "NOVEMBER";
                break;
            case DECEMBER:
                month = "DECEMBER";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + yearOfMonth);
        }
        return month;
    }

    @Override
    public int getQuarterMonth(int quarter) {
        return quarter*3;
    }

    @Override
    public String getDay(int weekOfDay) {
        String day;

        switch (weekOfDay) {
            case MONDAY:
                day = "MONDAY";
                break;
            case TUESDAY:
                day = "TUESDAY";
                break;
            case WEDNESDAY:
                day = "WEDNESDAY";
                break;
            case THURSDAY:
                day = "THURSDAY";
                break;
            case FRIDAY:
                day = "FRIDAY";
                break;
            case SATURDAY:
                day = "SATURDAY";
                break;
            case SUNDAY:
                day = "SUNDAY";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + weekOfDay);
        }
        return day;
    }


}
