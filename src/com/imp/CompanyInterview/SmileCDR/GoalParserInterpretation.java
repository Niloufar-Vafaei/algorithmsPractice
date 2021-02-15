package com.imp.CompanyInterview.SmileCDR;
/*
* You own a Goal Parser that can interpret a string command.
*  The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
*  The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as
*  the string "al". The interpreted strings are then concatenated in
* the original order.Given the string command, return the Goal Parser's interpretation of command.
* */

public class GoalParserInterpretation {
    //get time out when i use it.
    public String interpretWhile(String command) {
        int i = 0;
        StringBuffer result =new StringBuffer();
        while(i<command.length()){
            if(command.charAt(i)=='G'){
                result.append("G");
                i++;
            }else
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                result.append("o");
                i=i+2;
            }else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                result.append("al");
                i=i+4;
            }
        }
        return result.toString();
    }
    public String interpretForSolve(String command) {
        StringBuffer result =new StringBuffer();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                result.append("G");
            }else
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                result.append("o");
                i=i+1;
            }else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                result.append("al");
                i=i+3;
            }

        }
        return result.toString();

    }
}
