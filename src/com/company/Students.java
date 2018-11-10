package com.company;

import java.util.Comparator;

public class Students implements Comparable {
    static int counter=0;
    private String name;
    private int age;
    private String sex;
    private String country;

    //to compare(sort) by default
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    //other ways to sort:
    static Comparator<Students> COMPARE_BY_COUNTRY = new Comparator<Students>() {
        public int compare(Students one, Students other) {
            return one.getCountry().compareTo(other.getCountry());
        }
    };

    static Comparator<Students> COMPARE_BY_NAME = new Comparator<Students>() {
        public int compare(Students one, Students other) {
            return one.getName().compareTo(other.getName());
        }
    };

    static Comparator<Students> COMPARE_BY_AGE = new Comparator<Students>() {
        public int compare(Students one, Students other) {
            String age  = String.valueOf(one.getAge());
            String age2  = String.valueOf(other.getAge());
            return age.compareTo(age2);
        }
    };


    Students(String name, int age, String sex, String country) {
        counter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getCountry() {
        return country;
    }
}
