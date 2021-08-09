package com.company;
import firsttask.FirstTaskClass;

public class Main {

    public static void main(String[] args)
    {
        FirstTaskClass ftc = new FirstTaskClass();
        String ftcstr = "abc1de24fg56";
        int x = ftc.SumOfDigits(ftcstr);
        System.out.println("First Task: ");
        System.out.println("Input: "+ ftcstr +"Output: "+x);
    }
}
