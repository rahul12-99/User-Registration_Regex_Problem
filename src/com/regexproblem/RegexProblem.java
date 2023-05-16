package com.regexproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {
    /**
     * This method is for User enter valid first name
     * And first-name starts with capital and has minimum 3 character
     */
    public void firstName(){
        Pattern p = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher m = p.matcher("Rahul");
        boolean b = m.matches();
        if(b){
            System.out.println("Valid first name");
        }else {
            System.out.println("Invalid first name");
        }
    }

    /**
     * Main method to execute the program
     */
    public static void main(String[] args) {
        RegexProblem regex = new RegexProblem();
        regex.firstName();
    }
}
