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
    
    private static Integer[] getRandomArray() {
        //TODO create method to generate random array of ints
        return new Integer[]{1,5,8,3,9,2,4,10,7,15,20,11,36,22,40,16,19,30,21};
    }

    private static Map<String, SortingAlgorithms<Integer>> populateMap() {
        Map<String, SortingAlgorithms<Integer>> algorithms = new HashMap<String, SortingAlgorithms<Integer>>();
        algorithms.put("Insertion", new Insertion());
        algorithms.put("Merge", new Merge());
        algorithms.put("Shellsort", new Merge());
        return algorithms;
    }
    
    public static void main(String[] args) {
        Map<String, SortingAlgorithms<Integer>> algorithms = populateMap();
        Menu menu = new Menu(algorithms.keySet().toArray(new String[0]));
        Scanner in = new Scanner(System.in);
        int selection = 0;
        Integer[] unsortedArray = getRandomArray();
        Integer[] sorted = new Integer[unsortedArray.length];
        
        do {
            menu.printMenu();
            selection = in.nextInt();
            
            switch(selection){
                case(1):
                    sorted = algorithms.get("Insertion").sort(unsortedArray);
                    break;
                case(2):
                    sorted = algorithms.get("Merge").sort(unsortedArray);
                    break;
                case(3):
                    sorted = algorithms.get("Shellsort").sort(unsortedArray);
                    break;
                default:
                    break;
            }
            System.out.println(Arrays.toString(sorted));
        }while(selection!=0);
    }
    
}
