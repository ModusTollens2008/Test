package com.company;
import firsttask.FirstTaskClass;

import java.util.Vector;

public class Main {

    public static void main(String[] args)
    {
        FirstTaskClass ftc = new FirstTaskClass();
        String ftcstr = "abc1de24fg56";
        int x = ftc.sumOfDigits(ftcstr);
        System.out.println("First Task: ");
        System.out.println("Input: "+ ftcstr +"Output: "+x);
        Vector vector = new Vector();
        vector.add(43.4);
        vector.add(43.4);
        vector.add(43.4);
        vector.add(43.4);

        System.out.println(vector.elementAt(4));
    }
}
