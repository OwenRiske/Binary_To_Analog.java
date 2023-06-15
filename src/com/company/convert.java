package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class convert {

    public static int binaryToNum(String binary) {
        int total = 0;
        int count = 1;
        //split the binary into each digit
        String[] input = binary.split("");
        int position = input.length - 1;
        //convert each 1 to their corisponding number
        for (int i = 0; i < input.length; i++) {
            if (input[position].equals("1")) {
                total += count;
            }
            //change variable
            count *= 2;
            position -= 1;


        }
        //output total
        return total;
    }
public static String[] splitNum (int num){
        return Integer.toString(num).split("");
}
}
