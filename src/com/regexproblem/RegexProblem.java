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
     * This method is for User enter valid last name
     * And last-name starts with capital and has minimum 3 character
     */
    public void lastName(){
        Pattern p = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher m = p.matcher("Kumar");
        boolean b = m.matches();
        if(b){
            System.out.println("Valid last name");
        }else {
            System.out.println("Invalid last name");
        }
    }

    /**
     * This method is for user enter valid email
     */
    public void email(){
        /* Pattern E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co)
         and 2 optional (xyz & in) with precise @ and . positions */

        Pattern p = Pattern.compile("[a-z0-9+.+a-z]+@+[bl+.+co+.+in]{2,}");
        Matcher m = p.matcher("abc.xyz@bl.co.in");
        boolean b = m.matches();
        if(b){
            System.out.println("Valid email");
        }else {
            System.out.println("Invalid email");
        }
    }

    /**
     * This method is for user enter valid mobile number
     */
    public void mobileNumber(){
        Pattern p = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$");
        Matcher m = p.matcher("91 9934691893");
        boolean b = m.matches();
        if(b){
            System.out.println("Valid mobile number");
        }else {
            System.out.println("Invalid mobile number");
        }
    }

    /**
     * This method is for user enter valid password and should minimum 8 character
     */
    public void password(){
        Pattern p = Pattern.compile("[A-Za-z]{8,}");
        Matcher m = p.matcher("rahulkumar");
        boolean b = m.matches();
        if(b){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }
    }

    /**
     * Main method to execute the program
     */
    public static void main(String[] args) {
        RegexProblem regex = new RegexProblem();
//        regex.firstName();
//        regex.lastName();
//        regex.email();
//        regex.mobileNumber();
        regex.password();
    }
}
