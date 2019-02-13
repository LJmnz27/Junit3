package org.pursuit.junitnumbers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberHelper {

    private static NumberHelper numberHelper;

    private NumberHelper(){}

    public static NumberHelper getInstance(){
        if (numberHelper == null) numberHelper = new NumberHelper();
        return numberHelper;
    }
    public String oddOrEven(int input){

            if(input % 2 == 1){
                return "odd";
            } else {
                return "even";
            }
    }

    public boolean divisibleBy5(int input){
        if (input % 5 == 0){
            return true;
        }
        return false;
    }

    public int[]multiplesOfN(int baseNumber, int range){
        if(range < 0){
            throw new IllegalArgumentException("Range cannot be less than 1");
        }
    int [] result = new int[range];
        for (int i = 0; i < range; i++) {
            result[i]=baseNumber * (i+1);
        }
            return result;
    }

    public int stringToNumber(String number){
        return Integer.parseInt(number);
    }

    public int arraySum(int[] numbers) {

        int sum = 0;
        for (int i = 0; i <numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int largestNumber(int[] numbers) {

        int largest = Integer.MIN_VALUE;


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {

                largest = numbers[i];

            }

        }
        return largest;
    }

   public int[] numberSort(int[] numbers){

        return Arrays.sort(numbers);
   }
}