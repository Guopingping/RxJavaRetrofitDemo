package com.gp.rxjavaretrofitdemo.entity;

/**
 * Created by ping6 on 2017/2/9.
 */

public class HttpResult<T> {
    private int count;
    private int start;
    private int total;
    private String title;

    //用来模仿Data
    private T subjects;

    public int getCount() {
        return count;
    }

    public int getStart() {
        return start;
    }

    public int getTotal() {
        return total;
    }

    public String getTitle() {
        return title;
    }

    public T getSubjects() {
        return subjects;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubjects(T subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("title=" + title + " count=" + count + " start=" + start);
        if(null != subjects){
            sb.append(" subjects:" + subjects.toString());
        }
        return sb.toString();
    }
}
