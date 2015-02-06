/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortingalgorithms;

public class Insertion<T extends Comparable<T>> implements SortingAlgorithms<T> {

    @Override
    public T[] sort(T[] array) {
        for(int i = 1;i<array.length;i++) {
            T a = array[i];
            for(int j = i;((j > 0)&&(array[j-1].compareTo(a)==1));j--){
                array[j] = array[j-1];
                array[j-1] = a;
            }
        }
        return array;
    }
}
