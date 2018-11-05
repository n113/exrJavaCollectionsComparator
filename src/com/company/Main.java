package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Alice", 19, "female", "USA");
        Students s2 = new Students("John", 22, "male", "Canada");
        Students s3 = new Students("Max", 36, "male", "Germany");
        Students s4 = new Students("Kirill", 26, "male", "Russia");
        Students s5 = new Students("Mila", 18, "female", "Kosovo");
        Students s6 = new Students("Tanya", 24, "female", "Belarus");
        Students s7 = new Students("Steven", 29, "male", "Australia");
        Students s8 = new Students("Bob", 27, "male", "England");

        ArrayList<Students> arrS = new ArrayList<>();
        arrS.add(s1);
        arrS.add(s2);
        arrS.add(s3);
        arrS.add(s4);
        arrS.add(s5);
        arrS.add(s6);
        arrS.add(s7);
        arrS.add(s8);

        //Collections.sort(arrS, Students.COMPARE_BY_COUNTRY);
        //Collections.sort(arrS, Students.COMPARE_BY_AGE);
        Collections.sort(arrS, Students.COMPARE_BY_NAME);

        for (int i = 0; i <arrS.size() ; i++) {
            System.out.println(arrS.get(i).getName()+", "+arrS.get(i).getAge());
        }
    }//main
}//class
