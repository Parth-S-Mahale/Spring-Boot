package Advance_Java.input_streams.try_with_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class concept {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int num = 0;

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(bf.readLine());
            System.out.println("Input: " + num);

        }
    }
}
