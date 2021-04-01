package com.imp.CompanyInterview.PokerStar;

public class FindWinner {
    public int solution(String A, String B) {
        if (A.length() != B.length()) return -1;
        int countAliceWin = 0;
        for (int i = 0; i < A.length(); i++) {
            char a = Character.toLowerCase(A.charAt(i));
            char b = Character.toLowerCase(B.charAt(i));
            if (a == 'a' || b == 'a') {
                if (a == 'a' && b != 'a') {
                    countAliceWin++;
                }
            } else if (a > b) {
                countAliceWin++;
            }
        }
        return countAliceWin;
    }
}
