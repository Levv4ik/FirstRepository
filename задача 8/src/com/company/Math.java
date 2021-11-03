package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Math {
    public static void div() throws IOException {
        String first;
        String second;
        double firstNum;
        double secondNum;
        double result;
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two number for dividing: ");
        try {
            first = rd.readLine();
            second = rd.readLine();
            firstNum = Double.parseDouble(first);
            secondNum = Double.parseDouble(second);
            if (secondNum == 0) throw new ArithmeticException();
            result = firstNum / secondNum;
            System.out.println("Result:" + result);
        } catch (NumberFormatException e) {
            System.err.println("You entered not a number ");
        } catch (ArithmeticException e) {
            System.err.println("You can't divide with 0");
        }
    }

    public static void readNumber(int start, int end) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String num;
        int number;
        int arrNum = 0;
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers in range from " + start + " to " + end);
        while (arrNum < numbers.length) {
            try {
                num = rd.readLine();
                number = Integer.parseInt(num);
                if (number > start && number < end) {
                    numbers[arrNum] = number;
                    System.out.println("Number is in range from " + start + " to " + end);
                    arrNum++;
                }
                else throw new ArithmeticException();
            } catch (NumberFormatException e) {
                System.err.println("You entered not a number, try again");
            } catch (ArithmeticException q) {
                System.err.println("Number is out of range from " + start + " to " + end);
            }
        }
        Arrays.sort(numbers);
        System.out.println("Entered numbers: ");
        System.out.println(Arrays.toString(numbers));
    }
}



