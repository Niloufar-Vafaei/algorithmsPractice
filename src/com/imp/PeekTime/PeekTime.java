package com.imp.PeekTime;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PeekTime {
    public void findPeekTime(List<WorkTask> obj) {

        WorkTask o = obj.stream().max(Comparator.comparing(WorkTask::getMemoreUsege)).get();
        System.out.println("end at ---->" + o.getEndDate() + "start at ---->"
                + o.getStartDate() + "memoryUsage---->" + o.getMemoreUsege());

        List<Integer> number = Arrays.asList(2, 3, 4, 5,6);
        int even = number.stream().filter(x -> x % 2 == 0).reduce(1, (ans,i)->ans*i);
        System.out.println("******even= "+even);
    }
}
