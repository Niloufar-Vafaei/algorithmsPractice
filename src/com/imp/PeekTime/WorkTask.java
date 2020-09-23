package com.imp.PeekTime;

import java.util.Date;

public class WorkTask {
    public WorkTask(Date startDate, Date endDate, int memoreUsege) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.memoreUsege = memoreUsege;
    }

    private Date startDate;
    private Date endDate;
    private int memoreUsege;

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setMemoreUsege(int memoreUsege) {
        this.memoreUsege = memoreUsege;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getMemoreUsege() {
        return memoreUsege;
    }
}
