package service;

import mapper.DateTime;
import repository.DateRepository;
import repository.DateRepositoryImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.Calendar.*;

public class CalculateTime {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    static Calendar cal = Calendar.getInstance();
    static String firstDate = "19000101";
    static String lastDate = "19000201";
    static List<DateTime> resultList = new ArrayList<>();
    static List<String> holidayMonthDayList = new ArrayList<>();
    static DateRepository repository = new DateRepositoryImpl();

    static int workingDayOfYear = 0;

    public static void main(String[] args) throws ParseException {
        createTurkishHolidayList();

        createFirstDate();

        while (isDateReachToLastDate())
        {
            createResultList();
        }
    }

    private static void createResultList()
    {
        DateTime dateTime = new DateTime();

        fillDateTime(dateTime);

        addDateToCalendar();

        resultList.add(dateTime);
    }

    private static void fillDateTime(DateTime dateTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = cal.getTime();
        Calendar localCalendar = cal;
        dateTime.setCalendarDate(sdf.format(date));
        dateTime.setCalendarMonthBeginDate(sdf.format(getMonthFirstDay(localCalendar)));
        dateTime.setCalendarMonthEndDate(sdf.format(getMonthLastDay(localCalendar)));
        dateTime.setNextWorkingDate(sdf.format(getNextWorkingDate(localCalendar)));
        dateTime.setPreviousWorkingDate(sdf.format(getPreviousWorkingDate(localCalendar)));
        dateTime.setQuarterStartDate(sdf.format(getQuarterStartDate(localCalendar)));
        dateTime.setQuarterEndDate(sdf.format(getQuarterStartDate(localCalendar)));
        dateTime.setCharDate(dateFormat.format(date));
        dateTime.setDay(repository.getDay(cal.get(Calendar.DAY_OF_WEEK)));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        dateTime.setDayOfWeek(cal.get(DAY_OF_WEEK_IN_MONTH));
        dateTime.setDayOfYear(cal.get(DAY_OF_YEAR));
        dateTime.setMonthDay(cal.get(DAY_OF_MONTH));
        dateTime.setHoliday(isDayHoliday(cal) ? 1 : 0);
        dateTime.setMonthNumber(cal.get(MONTH)+1);
        dateTime.setMonth(repository.getMonth(cal.get(MONTH)));
        dateTime.setQuarter(repository.getQuarterMonth(localCalendar.get(MONTH))+1);
        dateTime.setWeekNumber(cal.get(WEEK_OF_YEAR));
        dateTime.setWeekOfMonth(cal.get(WEEK_OF_MONTH));
        dateTime.setYear(cal.get(YEAR));
        dateTime.setWeekend(String.valueOf(isWeekend(cal)));
        dateTime.setWorkingDayOfYear(String.valueOf(isDayHoliday(cal) ? null : ++workingDayOfYear));
        //System.out.println(dateTime.toString());
    }

    private static Date getPreviousWorkingDate(Calendar cal)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.set(cal.get(cal.YEAR),cal.get(cal.MONTH),cal.get(cal.DATE));

        localCalendar.add(Calendar.DATE, -1);

        while(isDayHoliday(localCalendar))
        {
            localCalendar.add(Calendar.DATE, -1);
        }
        return localCalendar.getTime();
    }

    private static boolean isDateReachToLastDate() {
        return (Integer.parseInt(dateFormat.format(cal.getTime())) < Integer.parseInt(lastDate));
    }

    private static boolean isWeekend(Calendar cal){
        return (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
                cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);
    }

    private static boolean isDayHoliday(Calendar cal) {
        return isWeekend(cal) ||
                holidayMonthDayList.contains(dateFormat.format(cal.getTime()).substring(4, 8));
    }

    private static void addDateToCalendar() {
        cal.add(Calendar.DATE, 1);
    }

    private static void createFirstDate() throws ParseException {
        cal.setTime(dateFormat.parse(firstDate));
    }

    static Date getMonthFirstDay(Calendar cal) {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.set(cal.get(cal.YEAR),cal.get(cal.MONTH),cal.get(cal.DATE));
        localCalendar.set(Calendar.DAY_OF_MONTH, 1);
        return localCalendar.getTime();
    }

    static Date getMonthLastDay(Calendar cal) {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.set(cal.get(cal.YEAR),cal.get(cal.MONTH),cal.get(cal.DATE));
        localCalendar.set(DAY_OF_MONTH, cal.getActualMaximum(DAY_OF_MONTH));
        return localCalendar.getTime();
    }

    static Date getNextWorkingDate(Calendar cal)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.set(cal.get(cal.YEAR),cal.get(cal.MONTH),cal.get(cal.DATE));
        localCalendar.add(Calendar.DATE, 1);

        while(isDayHoliday(localCalendar))
        {
            localCalendar.add(Calendar.DATE, 1);
        }
        return localCalendar.getTime();
    }

    static Date getQuarterStartDate(Calendar cal)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.set(cal.get(cal.YEAR),cal.get(cal.MONTH),cal.get(cal.DATE));
        int quarterMonth = repository.getQuarterMonth(localCalendar.get(MONTH));
        localCalendar.set(cal.get(cal.YEAR),quarterMonth,cal.getActualMinimum(DAY_OF_MONTH));
        return localCalendar.getTime();
    }

    public static void createTurkishHolidayList() {
        holidayMonthDayList.add("0101");
        holidayMonthDayList.add("0423");
        holidayMonthDayList.add("0501");
        holidayMonthDayList.add("0519");
        holidayMonthDayList.add("0715");
        holidayMonthDayList.add("0830");
        holidayMonthDayList.add("1029");
    }
}
