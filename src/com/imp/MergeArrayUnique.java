package com.imp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeArrayUnique {
    public <T> ArrayList<T> mergeArray(List<T> arrayOne, List<T> arrayTwo) {
        Set<T> arrayUnique = new HashSet<T>();
        for (T a:arrayOne) {
            if (!arrayUnique.contains(a)) {
                arrayUnique.add( a);
            }
        }
        for (T a:arrayTwo) {
            if (!arrayUnique.contains(a)) {
                arrayUnique.add( a);
            }
        }

        ArrayList<T> mainList = new ArrayList<T>();
        mainList.addAll(arrayUnique);

        return mainList;

    }

    public  String[] uniqueNames(String[] names1, String[] names2) {

        Set<String> uniqueArray = new HashSet<String>();
        for(String a:names1){
            if(!uniqueArray.contains(a)){
                uniqueArray.add(a);
            }
        }
        for(String a:names2){
            if(!uniqueArray.contains(a)){
                uniqueArray.add(a);
            }
        }
        return uniqueArray.toArray(new String[0]);
    }

}
