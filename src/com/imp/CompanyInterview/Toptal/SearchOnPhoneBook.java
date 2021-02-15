package com.imp.CompanyInterview.Toptal;

/*
 * implement a function return the name of contact that has P in phone number
 * if there is more than one contact name your function should return the alphabetically smallest.
 * if no mach is fount should return "NO CONTACT"
 * example:
 * A[]={"sam","ahmad"}, B[]={"123456","9876"}, P="87"
 * function return= ahmad
 * */

import java.util.stream.IntStream;

public class SearchOnPhoneBook {
    public String solution(String[] A, String[] B, String P) {
        return IntStream.range(0, B.length)
                .filter(i -> B[i].contains(P))
                .mapToObj(j -> A[j])
                .sorted()
                .findFirst()
                .orElse("NO CONTACT");
//
//        List<String> result = new ArrayList<String>();
//        for (int i = 0; i < B.length; i++) {
//            if (B[i].contains(P)) {
//                result.add(A[i]);
//            }
//        }
//            return result.stream()
//            .sorted().findFirst().orElse("NO CONTACT");
    }
}
