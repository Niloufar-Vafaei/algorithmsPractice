package com.imp.CompanyInterview.Toptal;
/*
* reformat String s base on this structure xxx-xxx-xx or xxx-xxx-xx-xx.
* S contain spaces, /, - and at least two digit
* */
public class ReformatString {
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
}
