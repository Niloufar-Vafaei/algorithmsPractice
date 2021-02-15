package com.imp.CompanyInterview.Toptal;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public String solution(String[] A, String[] B, String P) {
        // write your code in Java SE 11
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < B.length; i++) {
            if (B[i].contains(P)) {
                result.add(A[i]);
            }
        }
        Optional<String> n = result.stream()
                .sorted()
                .findFirst();
        if (n.isEmpty())
            return "NO CONTACT";
        else
            return n.get();
    }

    public String solution(String S) {
        // write your code in Java SE 11
        if (S.length() <= 3) return S;
        if (S.length() == 4) return S.substring(0, 1) + '-' + S.substring(2, 3);

        StringBuilder resultNumber = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != ' ' && S.charAt(i) != '/' && S.charAt(i) != '-') {
                resultNumber.append(S.charAt(i));
            }
        }
        String n = resultNumber.toString();
        for (int i = 0; i < n.length(); i++) {
            if (counter < 3) {
                result.append(n.charAt(i));
                counter++;
            } else {
                result.append('-');
                if (n.length() - i <= 3) {
                    result.append(n.substring(i));
                    return result.toString();
                } else if (n.length() - i == 4) {
                    result.append(n.substring(i, i + 2) + '-' + n.substring(i + 2));
                    return result.toString();
                } else {
                    result.append(n.charAt(i));
                    counter = 1;
                }
            }
        }
        return result.toString();
    }

    public int solutiosn(int Y, String A, String B, String W) {


        LocalDate startMonday = getFirstMonday(Y, convertToMonth(A));
        LocalDate lastSunday = getLastSunday(Y, convertToMonth(B));

        long days = ChronoUnit.DAYS.between(startMonday, lastSunday.plusDays(1));
        int weeks = (int) days / 7;
        return weeks;
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
}
