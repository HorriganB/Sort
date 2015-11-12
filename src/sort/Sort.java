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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
    }

    public void histoInt() {

        int counter;

        for (int k = 0; k <= 50; k++) {

            System.out.print(k + ": ");

            counter = 0;

            for (Integer x : ints) {

                if (x.equals(k)) {

                    counter++;

                }

            }

            System.out.print(counter + "\n");

        }

    }

}
