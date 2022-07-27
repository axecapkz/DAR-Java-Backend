import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a several numbers for array: ");
        String lines = str.readLine();
        String strs [] = lines.trim().split("\\s+");
        int []array = new int[strs.length];
        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            array[i] = Integer.parseInt(strs[i]);
            sum = sum + array[i];
        }

        System.out.println("Sum of array is: " + sum);
    }
}
