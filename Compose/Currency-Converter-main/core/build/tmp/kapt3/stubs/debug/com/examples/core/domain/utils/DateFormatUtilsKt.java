package com.examples.core.domain.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0001\u001a\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0001\u001a\"\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007\u001a\u0016\u0010\u0013\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0001\u001a\u0016\u0010\u0019\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0001\u001a\u0016\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u0016\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0001\u001a\u0016\u0010!\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u001d\u001a\u001e\u0010!\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u001d\u001a\u0006\u0010#\u001a\u00020\u0001\u001a\u0006\u0010$\u001a\u00020\u0001\u001a\u000e\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&\u001a\b\u0010\'\u001a\u00020\u001dH\u0007\u001a\u001e\u0010(\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u0001\u001a*\u0010+\u001a\u00020\u00012\b\b\u0002\u0010,\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0012\u001a\u00020\u0001\u001a\u0006\u00100\u001a\u00020\u0001\u001a\u000e\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001\u001a\u000e\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u001d\u001a\u000e\u00105\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001\u00a8\u00066"}, d2 = {"changeDateFormat", "", "dateFromApi", "inputDateTemplate", "outputDateTemplate", "changeDateFormatForUpcomingHolidays", "changeDateFormatLocale", "changeDateToEnglishFormat", "outPutFormat", "date", "Ljava/util/Date;", "changeDateToFormat", "convertDateStringToMillSeconds", "", "regex", "convertDateStringToMilliSeconds", "convertDateToRelativeDate", "dateStr", "dateFormat", "convertDateToStringDate", "calender", "Ljava/util/Calendar;", "outputDateFormat", "locale", "Ljava/util/Locale;", "convertDateToStringDateLocalized", "convertDateToTimeStamp", "formatDayOrMonthString", "dayOrMonth", "", "formatTimeStampToDate", "timestamp", "outputFormat", "getAddedDate", "amount", "getCurrentDate", "getCurrentDateFormatted", "isDayEnded", "", "getCurrentYear", "getDateByType", "dateType", "Lcom/youxel/core/domain/entities/enums/DateType;", "getDateDifference", "start_date", "end_date", "dateDifference", "Lcom/youxel/core/domain/entities/enums/DateDifference;", "getEndDateOfTheYearFormatted", "getEndDayOfMonth", "pattern", "getLastDayOfMonthDate", "month", "getStartDayOfMonth", "core_debug"})
public final class DateFormatUtilsKt {
    
    /**
     * Created by Shehab ELsarky.
     */
    public static final long convertDateStringToMilliSeconds(@org.jetbrains.annotations.NotNull()
    java.lang.String dateFromApi, @org.jetbrains.annotations.NotNull()
    java.lang.String inputDateTemplate) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String changeDateFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String dateFromApi, @org.jetbrains.annotations.NotNull()
    java.lang.String inputDateTemplate, @org.jetbrains.annotations.NotNull()
    java.lang.String outputDateTemplate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String changeDateFormatForUpcomingHolidays(@org.jetbrains.annotations.NotNull()
    java.lang.String dateFromApi, @org.jetbrains.annotations.NotNull()
    java.lang.String inputDateTemplate, @org.jetbrains.annotations.NotNull()
    java.lang.String outputDateTemplate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String changeDateFormatLocale(@org.jetbrains.annotations.NotNull()
    java.lang.String dateFromApi, @org.jetbrains.annotations.NotNull()
    java.lang.String inputDateTemplate, @org.jetbrains.annotations.NotNull()
    java.lang.String outputDateTemplate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertDateToStringDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    java.lang.String outputDateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertDateToStringDateLocalized(@org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    java.lang.String outputDateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertDateToRelativeDate(@org.jetbrains.annotations.NotNull()
    java.lang.String dateStr, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String convertDateToStringDate(@org.jetbrains.annotations.NotNull()
    java.util.Calendar calender, @org.jetbrains.annotations.NotNull()
    java.lang.String outputDateFormat, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDateDifference(@org.jetbrains.annotations.NotNull()
    java.lang.String start_date, @org.jetbrains.annotations.NotNull()
    java.lang.String end_date, @org.jetbrains.annotations.NotNull()
    com.youxel.core.domain.entities.enums.DateDifference dateDifference, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCurrentDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCurrentDateFormatted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getEndDateOfTheYearFormatted() {
        return null;
    }
    
    public static final int getDateByType(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    com.youxel.core.domain.entities.enums.DateType dateType, @org.jetbrains.annotations.NotNull()
    java.lang.String regex) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getAddedDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date, int amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getAddedDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String regex, int amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getLastDayOfMonthDate(int month) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public static final int getCurrentYear() {
        return 0;
    }
    
    public static final long convertDateStringToMilliSeconds(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return 0L;
    }
    
    public static final long convertDateStringToMillSeconds(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String regex) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String changeDateToFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String outPutFormat, @org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String changeDateToEnglishFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String outPutFormat, @org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getStartDayOfMonth(@org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getEndDayOfMonth(@org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCurrentDateFormatted(boolean isDayEnded) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDayOrMonthString(int dayOrMonth) {
        return null;
    }
    
    public static final long convertDateToTimeStamp(@org.jetbrains.annotations.NotNull()
    java.lang.String dateFromApi, @org.jetbrains.annotations.NotNull()
    java.lang.String inputDateTemplate) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatTimeStampToDate(long timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String outputFormat) {
        return null;
    }
}