/**
 * @author David Ogunbanjo
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("-Program purpose: The Program check weather a number/word is a palindrome\n");
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a word (Enter \"-1\" to quit): ");
            String word = scan.next();
            if(word.equals("-1")){
                break;
            }
            System.out.println((palin(word, 0,word.length()-1))? word+" is a palindrome": word+" is not a palindrome");

        }
        System.out.println("-Thank you for visiting out program");
    }
    public static boolean palin(String word, int left, int right){
        if(left == right || left > right){
            return true;
        }

        if (word.substring(left, left+1).equals(word.substring(right,right+1))){
            return palin(word, left+1, right-1);
        }
        return false;

    }
}