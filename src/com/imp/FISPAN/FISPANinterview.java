package com.imp.FISPAN;
/*
1.split String input with "|" and separate it to two part if first part is "character" return
character of second part if
first part is "word" return the count of the word of second part
 */

import java.util.List;

/*
2. Return list of Address
order{
    Address address
    type Pizza
}
Address{
    String s1
    String s2
}
 */
class Orders{
   List<Addreses> Address;
   String Pizza;

}
class Addreses{
    String s1;
    String s2;

}
public class FISPANinterview {
public int splitString(String input){
    String [] txt=input.split("|");
    if(txt[0].equals("character"))
        return txt[0].length();
    else{
        String[] s=txt[1].split(" ");
        return s.length;
    }
}

public List<String> findAddress(List<Orders> orders){
	return null;


}
}
