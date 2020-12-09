package com.imp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternCheck {
    public Boolean patternCheck(String s) {
        String pattern="/d/";
        Pattern p=Pattern.compile(pattern);

        // Search above pattern in "geeksforgeeks.org"
        Matcher m = p.matcher("GeeksforGeeks.org");
        // Print starting and ending indexes of the pattern
        // in text
        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end()-1));
        return false;
    }

    public void splitText(){
        String text = "geeks1for2geeks3";
        // Specifies the string pattern which is to be searched
        String delimiter =  "\\d";
        Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        // Used to perform case insensitive search of the string
        String[] result = pattern.split(text);

        for (String temp: result)
            System.out.println(temp);
    }

}
