package org.java.demo.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class TimeSheet {


    @EmbeddedId
    private TimeSheetID timeSheetID;

    @Column
    private long date;

    @Column
    private Float value;

    public TimeSheetID getTimeSheetID() {
        return timeSheetID;
    }

    public void setTimeSheetID(TimeSheetID timeSheetID) {
        this.timeSheetID = timeSheetID;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Ozaki to string TimeSheet{" +
                "id=" + timeSheetID + '\'' +
                ", date=" + date + '\'' +
                ", value=" + value + '\'' +
                '}';

    }
}
