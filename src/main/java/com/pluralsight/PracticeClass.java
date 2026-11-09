package com.pluralsight;
import java.util.ArrayList;

public class PracticeClass {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();


        names.add("Aaron");
        names.add("Charlie");
        names.add("Blake");


        for (int i = names.size() -1; i>=0; i--) {
            System.out.println(names.get(i));
        }
    }
}



