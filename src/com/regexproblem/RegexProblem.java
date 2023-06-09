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
     * This method is for user enter valid password and should 1 upperCase character
     */
    public void UppercasePassword(){
        Pattern p = Pattern.compile("[A-Za-z]{8,}");
        Matcher m = p.matcher("rahulKumar");
        boolean b = m.matches();
        if(b){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }
    }
    /**
     * This method is for user enter valid password and should 1 numeric value
     */
    public void NumericPassword(){
        Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).+${8,}");
        Matcher m = p.matcher("rahul1Kumar");
        boolean b = m.matches();
        if(b){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }
    }
    /**
     * This method is for user enter valid password and should 1 numeric value and
     * one special char and minimum 8 character in password
     */
    public void specialCharPassword() {
        Pattern p = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*., ?]).+${8,}");
        Matcher m = p.matcher("rahul1@Kro");
        boolean b = m.matches();
        if (b) {
            System.out.println("Password is Correct with exact one special Character");
        } else {
            System.out.println("Password is incorrect");
        }
    }

    /**
     * this method is for valid email pattern from given valid and invalid email samples
     */
    public void verifyEmailSamples() {
        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        for (int i = 0; i < validEmails.length; i++) {
            System.out.println("Result for emails = " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", validEmails[i]));
        }
        System.out.println("\nFor Invalid Emails ");
        for (int i = 0; i < inValidEmails.length; i++) {
            System.out.println("Result for emails = " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", inValidEmails[i]));
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
//        regex.password();
//        regex.UppercasePassword();
//        regex.NumericPassword();
//        regex.specialCharPassword();
        regex.verifyEmailSamples();
    }
}
