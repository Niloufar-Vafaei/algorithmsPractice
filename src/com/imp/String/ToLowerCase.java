package com.imp.String;
/*Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.*/

public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int asciiCh = str.charAt(i);
            if (asciiCh > 90 || asciiCh < 65)
                result.append(str.charAt(i));
            else {
                int castAscii = asciiCh + 32;
                result.append((char) castAscii);
            }
        }
        return result.toString();
    }
}
