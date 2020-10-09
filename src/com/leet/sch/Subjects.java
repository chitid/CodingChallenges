package com.leet.sch;

public class Subjects {

    long subjectId;
    String subjectName;

    public Subjects(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subjects(long subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
