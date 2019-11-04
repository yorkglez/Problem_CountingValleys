package com.problemcountingvalleys.app;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Variables declaration
        int stepsNumber = 0;
        int result = 0;
        String steps = "";

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input from user
        stepsNumber = in.nextInt();
        steps = in.next();

        System.out.println(steps);
        //Get Resutls
        result = countingValleys(stepsNumber, steps);

        //Output result
        System.out.println(result);

        //Close input
        in.close();
    }

    static int countingValleys(int stepsNumber, String steps)
    {
        //Variables declaration
        int level = 0;
        int valley = 0;

        //Convert string to array char
        char[] stepsArray = steps.toCharArray();

        //Process
       for(char element: stepsArray)
       {
           //Validate up valley
           if (element == 'U')
            {
                //Increase level
                level++;
                //if level is 0 increase valleys
                if(level == 0)
                {
                    valley++;
                }
            }
           //Validate down valley
            else{
                level--;
            }
        }

        return valley;
    }
}
