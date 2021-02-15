package com.imp.String;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistnationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> startPoint = new HashSet<>();
        String result="";
        for (List<String> each : paths) {
            startPoint.add(each.get(0));
        }
        for (List<String> each : paths) {
            if (!startPoint.contains(each.get(1)))
                result = each.get(1);
        }
        return result;
    }
}
