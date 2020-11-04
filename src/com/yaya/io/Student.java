package com.yaya.io;

import java.io.Serializable;

public class Student extends People implements Serializable {
    private String schoolName;
    private String schoolNumber;

    public Student() {
    }

    public Student(String name, int age, String schoolName, String schoolNumber) {
        setName(name);
        setAge(age);
        this.schoolName = schoolName;
        this.schoolNumber = schoolNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolNumber='" + schoolNumber + '\'' +
                ", age=" + getAge() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
