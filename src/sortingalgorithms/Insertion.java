/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortingalgorithms;

public class Insertion implements SortingAlgorithms {

    @Override
    public int[] sort(int[] array) {
        for(int i = 1;i<array.length;i++) {
            int a = array[i];
            for(int j = i;((j > 0)&&(array[j-1] > a));j--){
                array[j] = array[j-1];
                array[j-1] = a;
            }
        }
        return array;
    }
}
