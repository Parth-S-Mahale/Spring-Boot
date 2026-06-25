package Advance_Java.input_streams;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class concept {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        /* int num = System.in.read(); */

        /* InputStreamReader in = new InputStreamReader(System.in); */
        /* BufferedReader bf = new BufferedReader(in); */
        /* int num = Integer.parseInt(bf.readLine()); */
        /* bf.close(); */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}
