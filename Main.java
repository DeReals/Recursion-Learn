/**
 * @author David Ogunbanjo
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("\nExample 1:");
        System.out.println("-Program purpose: The Program check weather a number/word is a palindrome\n");

        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a word (Enter \"-1\" to quit): ");
            String word = scan.next();
            if(word.equals("-1")){
                break;
            }
            System.out.println("Test 1: Return Type");
            System.out.println("-"+((palin1(word, 0,word.length()-1))? word+" is a palindrome": word+" is not a palindrome"));
            System.out.println("Test 2: Non Return Type");
            palin2(word, 0,word.length()-1);
        }
        System.out.println("-Thank you for visiting our palindrome program");

        System.out.println("\nExample 2:");
        System.out.println("-Program purpose: The Program performs a binary search with recursion\n");

        int[] nums = {1,3,5,6,7,22,24,34,71,89,97};
        int target = nums[(int)(Math.random()*nums.length)];
        // output the numbers in the list
        StringBuilder SBNum = new StringBuilder();
        SBNum.append("[");
        for (int num : nums) {
            SBNum.append("-");
            SBNum.append(num);
            SBNum.append("-");
        }
        SBNum.append("]");
        System.out.println("Numbers: "+SBNum);
        System.out.println("Target: "+target);
        binarySearch(nums, target,0,nums.length-1);
        System.out.println("-Thank you for visiting our Binary Search program");
    }

    // Palindrome set up with return
    public static boolean palin1(String word, int left, int right){
        // base case
        if(left == right || left > right){
            return true;
        }

        // general case
        if (word.substring(left, left+1).equals(word.substring(right,right+1))){
            return palin1(word, left+1, right-1);
        }
        return false;

    }

    // Palindrome set up without return
    public static void palin2(String word, int left, int right){
        // base case
        if(left == right || left > right){
            System.out.println("-"+word+" is a palindrome");
            return;
        }

        // general case
        if (word.substring(left, left+1).equals(word.substring(right,right+1))){
            palin2(word, left+1, right-1);
        }else{
            System.out.println("-"+word+" is not a palindrome");
        }

    }

    // Binary Search using Recursion
    public static void binarySearch(int[] numbers, int target, int left, int right){
        int middle = left/2 + right/2;
        System.out.println("Middle Index: "+middle + " Number: "+numbers[middle]);

        //base case
        if (numbers[middle] == target){
            System.out.println("Target Found!");
            return;
        }

        // General Case
        if(target > numbers[middle]){
            binarySearch(numbers, target,middle+1,right);
        }else{
            binarySearch(numbers, target,left,middle-1);
        }
    }

}
