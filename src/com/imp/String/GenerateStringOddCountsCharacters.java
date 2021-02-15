package com.imp.String;

public class GenerateStringOddCountsCharacters {
    public String generateTheString(int n) {
        String ch = "b";
        String tx = "a";
        StringBuilder result = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; ++i) {
                result.append(ch);
            }
            return result.append(tx).toString();
        } else
            for (int i = 0; i < n; ++i) {
                result.append(ch);
            }
        return result.toString();
    }
    /* ----------------
     public String generateTheString(int n) {
        char[] str = new char[n];
        Arrays.fill(str, 'a');
        if(n%2==0) {
            str[0] = 'b';
        }
    return new String(str);
    --------------------
}*/
}
