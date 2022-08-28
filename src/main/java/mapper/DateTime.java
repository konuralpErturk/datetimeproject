package mapper;

public class DateTime
{
    private String calendarDate;
    private String calendarMonthBeginDate;
    private String calendarMonthEndDate;
    private String nextWorkingDate;
    private String previousWorkingDate;
    private String quarterStartDate;
    private String quarterEndDate;
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

    private String month;
    private int weekend;
    private String weekEnding;
    private int workingDayOfYear;

    public void setCalendarDate(String calendarDate) {
        this.calendarDate = calendarDate;
    }

    public void setCalendarMonthBeginDate(String calendarMonthBeginDate) {
        this.calendarMonthBeginDate = calendarMonthBeginDate;
    }

    public void setCalendarMonthEndDate(String calendarMonthEndDate) {
        this.calendarMonthEndDate = calendarMonthEndDate;
    }

    public void setNextWorkingDate(String nextWorkingDate) {
        this.nextWorkingDate = nextWorkingDate;
    }

    public void setPreviousWorkingDate(String previousWorkingDate) {
        this.previousWorkingDate = previousWorkingDate;
    }

    public void setQuarterEndDate(String quarterEndDate) {
        this.quarterEndDate = quarterEndDate;
    }

    public void setQuarterStartDate(String quarterStartDate) {
        this.quarterStartDate = quarterStartDate;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }

    public void setMonthDay(int monthDay) {
        this.monthDay = monthDay;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public void setWeekOfMonth(int weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCharDate(String charDate) {
        this.charDate = charDate;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setWeekend(int weekend) {
        this.weekend = weekend;
    }

    public void setWeekEnding(String weekEnding) {
        this.weekEnding = weekEnding;
    }

    public void setWorkingDayOfYear(int workingDayOfYear) {
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
                ", Month='" + month + '\'' +
                ", weekend='" + weekend + '\'' +
                ", weekEnding='" + weekEnding + '\'' +
                ", workingDayOfYear='" + workingDayOfYear + '\'' +
                '}';
    }
}
