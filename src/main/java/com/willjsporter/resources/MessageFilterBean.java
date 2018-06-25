package com.willjsporter.resources;

import javax.ws.rs.QueryParam;

class MessageFilterBean {

    private @QueryParam("year") int year;
    private @QueryParam("start") int start;
    private @QueryParam("end") int size;

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getStart() {
        return start;
    }

    void setStart(int start) {
        this.start = start;
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }
}
