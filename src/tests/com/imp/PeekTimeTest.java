package com.imp;

import com.imp.CompanyInterview.PeekTime.PeekTime;
import com.imp.CompanyInterview.PeekTime.WorkTask;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class PeekTimeTest {

    @Test
    void findPeekTime() {
        PeekTime peekTime = new PeekTime();
        List<WorkTask> taskList = new ArrayList<>();

        taskList.add(new WorkTask(new Date(), new Date(), 1000));
        taskList.add(new WorkTask(new Date(), new Date(), 2000));
        taskList.add(new WorkTask(new Date(), new Date(), 3000));

        peekTime.findPeekTime(taskList);

    }
}