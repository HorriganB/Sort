/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gilmour
 */
public class Sort {
    public static List<Integer> ints = new ArrayList<Integer>();
    public static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            System.out.println("Let's build our list.");
            System.out.println("Enter a number from 0 - 50.");
            System.out.println("Enter a # outside the range to exit input phase.");
            int input = in.nextInt();
            while (input <= 50 && input >= 0){
                ints.add(input);
                input = in.nextInt();
            }
            int counter;
            for(int k = 0; k <= 50; k++){
            System.out.print(k + ": ");
            counter = 0;
            for (Integer x : ints){
                if (x.equals(k)){
                    counter++;
                }
            }
            System.out.print(counter + "\n");
            }
            System.out.println("2 = SelectSort, 1 = InsertSort");
    }
          
        
  
       
   
}


        
  

    

