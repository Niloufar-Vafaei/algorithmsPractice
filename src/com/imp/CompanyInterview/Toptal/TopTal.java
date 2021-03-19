package com.imp.CompanyInterview.Toptal;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TopTal {
    private static LocalDate getLastSunday(int y, int month) {
        LocalDate date = null;

        if (month != 12) {

            date = LocalDate.of(y, month + 1, 1);
            date = date.minusDays(1);

        } else {
            date = LocalDate.of(y, month, 31);
        }

//	    date=date.minusDays(1);

        for (int i = date.lengthOfMonth(); i > 1; i--) {

            if ("Sunday".equalsIgnoreCase(date.getDayOfWeek().toString())) {

                break;
            } else {

                date = date.minusDays(1);
            }
        }
        return date;
    }

    private static LocalDate getFirstMonday(int year, int month) {

        LocalDate date = LocalDate.of(year, month, 1);

        for (int i = 0; i < date.lengthOfMonth(); i++) {

            if ("Monday".equalsIgnoreCase(date.getDayOfWeek().toString())) {

                break;

            } else {

                date = date.plusDays(1);
            }
        }
        return date;
    }


    private int convertToMonth(String month) {
        switch (month) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int solutiosn(int Y, String A, String B, String W) {


        LocalDate startMonday = getFirstMonday(Y, convertToMonth(A));
        LocalDate lastSunday = getLastSunday(Y, convertToMonth(B));

        long days = ChronoUnit.DAYS.between(startMonday, lastSunday.plusDays(1));
        int weeks = (int) days / 7;
        return weeks;
    }


    public int carryOperations(int A, int B) {

        int reserve=-1;
        int stop = Math.max(A, B);
        int count = -1;

        while (stop != 0) {
            if ((A % 10 + B % 10)>10)
            {
                count++;
                reserve=(A % 10 + B % 10)%10;
            }
            A=A%10;
            B=B%10;
            stop=stop%10;

        }
        return count;

    }
}
