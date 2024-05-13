package question1;

import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("what is the number you what to search: ");
        int searchNumber = scanner.nextInt();

        int count = 0;
        for (int num : nums) {
            if (num == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("your number appears " + count + " times");
        } else {
            System.out.println("number doesnt exist in the array");
        }
    }
}
