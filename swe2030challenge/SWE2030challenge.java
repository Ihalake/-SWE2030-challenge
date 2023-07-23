/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe2030challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/** 
 * 

       
 * @author Issene Halake
 */
public class SWE2030challenge {
    

    public static void main(String[] args) {
        //..............increment and decrement..................
        System.out.println("..........PART1 INCREMENT AND DECREMENT......");
        int value = 1;
        int counter = 0;

        while (counter < 3) {
            value++;
            System.out.println("Increment " + (counter + 1) + ": " + value);
            counter++;
        }

        counter = 0;
        while (counter < 3) {
            value--;
            System.out.println("Decrement " + (counter + 1) + ": " + value);
            counter++;
        }
       // implementing the increment and decrement challenge in java with a while loop.
   System.out.println(".......part 2 DICE ROLL......");
        Random dice = new Random();
        int roll1 = dice.nextInt(6) + 1;
        int roll2 = dice.nextInt(6) + 1;
        int roll3 = dice.nextInt(6) + 1;
        int total = roll1 + roll2 + roll3;

        

        if ((roll1 == roll2) && (roll2 == roll3)) {
            System.out.println("You rolled triples! +6 bonus to total!");
            total += 6;
        } else if (((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3))) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        if (total >= 10) {
            System.out.println(" Dice roll is above 10 , You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }
    //............................ Array reverse and Sort.......................................................
    System.out.println(".......PART3 ARRAYS .....");
    String[] pallets = {"B14", "A11", "B12", "A13"};

        System.out.println("Sorted ....");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }

        System.out.println("Reverse ....");
        for (int i = 0; i < pallets.length / 2; i++) {
            String temp = pallets[i];
            pallets[i] = pallets[pallets.length - 1 - i];
            pallets[pallets.length - 1 - i] = temp;
        }
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }
 // .............................if else excerise ..................................................................
    System.out.println("......PART 4 IF ELSE ........ ");     
 Random random = new Random();
        int daysUntilExpiration = random.nextInt(12);
        int discountPercentage = 0;

        if (daysUntilExpiration <= 5) {
            discountPercentage = 10;
        } else if (daysUntilExpiration == 1) {
            discountPercentage = 20;
        }

        if (daysUntilExpiration < 1) {
            System.out.println("Your subscription has expired!");
        } else if (daysUntilExpiration == 1) {
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + " %!");
        } else if (daysUntilExpiration <= 5) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + " %!");
        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
        }
        
 //......HashSet in Java to count the number of distinct absolute values in an array of integers.....................
 System.out.println(" ......part5 hashset example......");
 int[] A = {-1, 2, -3, 2, -1, 4, 3};
        int distinctAbsoluteCount = countDistinctAbsolute(A);
        System.out.println("Number of distinct absolute values: " + distinctAbsoluteCount);
    }

    public static int countDistinctAbsolute(int[] A) {
        Set<Integer> abNumbers = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            abNumbers.add(Math.abs(A[i]));
        }
        return abNumbers.size();
    }
 //................Frog Jump..............
    {
int X = 10, Y = 85, D = 30;
        int jumps = frogJump(X, Y, D);
System.out.println("Number of jumps required: " + jumps);}
    public static int frogJump(int X, int Y, int D) {
        int jumpProgress = X;
        int count = 0;
        while (jumpProgress < Y) {
            jumpProgress += D;
            count++;
        }
        return count;
    }
     
}

   



        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       