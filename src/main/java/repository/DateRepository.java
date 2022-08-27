package repository;

import java.util.Calendar;

public interface DateRepository {
    String getDay(int weekOfDay);

    String getMonth(int yearOfMonth);

    int getQuarterMonth(int quarter);
}

/*
INSERT INTO core_data.dm_time (
  calendar_date, day_of_year, month_of_week,
  week_number, week_ending, accounting_month_end,
  calendar_month_end, month_day, month,
  month_number, quarter, year, day_of_week,
  day, holiday, week_of_month, pre_working_day,
  next_working_day, bw_working_date,
  fw_working_date, accounting_month_begin,
  working_day_of_year, char_date,
  weekend, quarter_start_date, quarter_end_date,
  calendar_month_begin_date, half_day_holiday,
  halfday_fw_working_date, halfday_next_working_day,
  halfday_bw_working_date, halfday_pre_working_day
)
VALUES
  (
    '2028-05-09', 130, 2, 19, '2028-05-12',
    '2028-05-31', '2028-05-31', 9, 'MAY',
    5, 2, 2028, 3, 'TUESDAY', 0, 2, '2028-05-08',
    '2028-05-10', '2028-05-09', '2028-05-09',
    '2028-05-01', '93', '20280509', 'NO',
    '2028-04-01', '2028-06-30', '2028-05-01',
    '0', '2028-05-09', '2028-05-10',
    '2028-05-09', '2028-05-08'
  );

* */