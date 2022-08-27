package mapper;

import java.util.Date;

public class DateTime
{
    private String calendarDate;
    private String calendarMonthBeginDate;
    private String calendarMonthEndDate;
    private String nextWorkingDate;
    private String previousWorkingDate;
    private String quarterEndDate;
    private String quarterStartDate;
    private int dayOfWeek;
    private int dayOfYear;
    private int holiday;
    private int monthDay;
    private int monthNumber;
    private int quarter;
    private int weekNumber;
    private int weekOfMonth;
    private int year;
    private String charDate;
    private String day;
    private String Month;
    private String weekend;
    private String weekEnding;
    private String workingDayOfYear;

    public String getCalendarDate() {
        return calendarDate;
    }

    public void setCalendarDate(String calendarDate) {
        this.calendarDate = calendarDate;
    }

    public String getCalendarMonthBeginDate() {
        return calendarMonthBeginDate;
    }

    public void setCalendarMonthBeginDate(String calendarMonthBeginDate) {
        this.calendarMonthBeginDate = calendarMonthBeginDate;
    }

    public String getCalendarMonthEndDate() {
        return calendarMonthEndDate;
    }

    public void setCalendarMonthEndDate(String calendarMonthEndDate) {
        this.calendarMonthEndDate = calendarMonthEndDate;
    }

    public String getNextWorkingDate() {
        return nextWorkingDate;
    }

    public void setNextWorkingDate(String nextWorkingDate) {
        this.nextWorkingDate = nextWorkingDate;
    }

    public String getPreviousWorkingDate() {
        return previousWorkingDate;
    }

    public void setPreviousWorkingDate(String previousWorkingDate) {
        this.previousWorkingDate = previousWorkingDate;
    }

    public String getQuarterEndDate() {
        return quarterEndDate;
    }

    public void setQuarterEndDate(String quarterEndDate) {
        this.quarterEndDate = quarterEndDate;
    }

    public String getQuarterStartDate() {
        return quarterStartDate;
    }

    public void setQuarterStartDate(String quarterStartDate) {
        this.quarterStartDate = quarterStartDate;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public int getHoliday() {
        return holiday;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }

    public int getMonthDay() {
        return monthDay;
    }

    public void setMonthDay(int monthDay) {
        this.monthDay = monthDay;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public int getWeekOfMonth() {
        return weekOfMonth;
    }

    public void setWeekOfMonth(int weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCharDate() {
        return charDate;
    }

    public void setCharDate(String charDate) {
        this.charDate = charDate;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }

    public String getWeekEnding() {
        return weekEnding;
    }

    public void setWeekEnding(String weekEnding) {
        this.weekEnding = weekEnding;
    }

    public String getWorkingDayOfYear() {
        return workingDayOfYear;
    }

    public void setWorkingDayOfYear(String workingDayOfYear) {
        this.workingDayOfYear = workingDayOfYear;
    }

    @Override
    public String toString() {
        return "DateTime{" +
                "calendarDate=" + calendarDate +
                ", calendarMonthBeginDate=" + calendarMonthBeginDate +
                ", calendarMonthEndDate=" + calendarMonthEndDate +
                ", nextWorkingDate=" + nextWorkingDate +
                ", previousWorkingDate=" + previousWorkingDate +
                ", quarterEndDate=" + quarterEndDate +
                ", quarterStartDate=" + quarterStartDate +
                ", dayOfWeek=" + dayOfWeek +
                ", dayOfYear=" + dayOfYear +
                ", holiday=" + holiday +
                ", monthDay=" + monthDay +
                ", monthNumber=" + monthNumber +
                ", quarter=" + quarter +
                ", weekNumber=" + weekNumber +
                ", weekOfMonth=" + weekOfMonth +
                ", year=" + year +
                ", charDate='" + charDate + '\'' +
                ", day='" + day + '\'' +
                ", Month='" + Month + '\'' +
                ", weekend='" + weekend + '\'' +
                ", weekEnding='" + weekEnding + '\'' +
                ", workingDayOfYear='" + workingDayOfYear + '\'' +
                '}';
    }
}
