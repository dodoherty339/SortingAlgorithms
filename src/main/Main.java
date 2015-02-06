/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import menu.Menu;
import sortingalgorithms.*;

public class Main {
    
    private static int[] getRandomArray() {
        //TODO create method to generate random array of ints
        return new int[]{1,5,8,3,9,2,4,10};
    }

    private static Map<String, SortingAlgorithms> populateMap() {
        Map<String, SortingAlgorithms> algorithms = new HashMap<String, SortingAlgorithms>();
        algorithms.put("Insertion", new Insertion());
        algorithms.put("Merge", new Merge());
        return algorithms;
    }
    
    public static void main(String[] args) {
        Map<String, SortingAlgorithms> algorithms = populateMap();
        Menu menu = new Menu(algorithms.keySet().toArray(new String[0]));
        Scanner in = new Scanner(System.in);
        int selection = 0;
        int[] unsortedArray = getRandomArray();
        int[] sorted = new int[unsortedArray.length];
        
        do {
            menu.printMenu();
            selection = in.nextInt();
            
            switch(selection){
                case(1):
                    sorted = algorithms.get("Insertion").sort(unsortedArray);
                    break;
                case(2):
                    break;
                case(3):
                    break;
                default:
                    break;
            }
            System.out.println(Arrays.toString(sorted));
        }while(selection!=0);
    }
    
}
