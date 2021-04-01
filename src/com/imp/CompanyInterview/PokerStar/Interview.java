package com.imp.CompanyInterview.PokerStar;

public class Interview {
    public int solution(String A, String B) {
        // write your code in Java SE 8
        int AlicWinCount = 0;
        for (int i = 0; i < A.length(); i++) {
            char a=Character.toLowerCase(A.charAt(i));
            char b=Character.toLowerCase(B.charAt(i));
            if (a == 'a' || b == 'a') {
                if(a == 'a' && b != 'a'){
                    AlicWinCount++;
                }
            } else if (Character.compare(a, b) > 0) {
                AlicWinCount++;
            }
        }
        return AlicWinCount;
 }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int countZero = 0;
        int countOne = 0;
        for (int i = 0; i < A.length; i += 1) {
            if (A[i] != 0 && isIndexEven(i))
                countZero++;
            else if (A[i] != 1 && !isIndexEven(i))
                countZero++;

            if (A[i] != 1 && isIndexEven(i))
                countOne++;
            else if (A[i] != 0 && !isIndexEven(i))
                countOne++;
        }
        return Math.min(countOne,countZero);
    }

    private boolean isIndexEven(int index) {

        return index%2==0;
    }

//    public String solution(String S, int[] A) {
//        // write your code in Java SE 8
//        if(S.isEmpty())
//             throw new NullPointerException();
//        StringBuilder result = new StringBuilder();
//        int k = 0;
//        result.append(S.charAt(0));
//        while (result.length() < S.length()) {
//            result.append(S.charAt(A[k]));
//            k=A[k];
//            if(A[k]==0)
//                break;
//        }
//        return result.toString();
//    }
}
