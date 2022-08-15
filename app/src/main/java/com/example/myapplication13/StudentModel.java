package com.example.myapplication13;

public class StudentModel {
    private String name;
    private int rollNumber;
    private boolean isEnroll;

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", isEnroll=" + isEnroll +
                '}';
    }

    public StudentModel(String name, int rollNumber, boolean isEnroll) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.isEnroll = isEnroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNmber() {
        return rollNumber;
    }

    public void setRollNmber(int rollNmber) {
        this.rollNumber = rollNmber;
    }

    public boolean isEnroll() {
        return isEnroll;
    }

    public void setEnroll(boolean enroll) {
        isEnroll = enroll;
    }
}
