/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

public class Shellsort<T extends Comparable<T>> implements SortingAlgorithms<T> {
    
    @Override
    public T[] sort(T[] array) {
        int[] jumps = getJumps(array.length);
        Insertion insert = new Insertion();
        return (T[]) insert.sort(array,jumps);
    }
    
    private int[] getJumps(int n) {
        if(n < 2) {
            return null;
        }
        int len = Math.max(1,(int)(Math.log(2)*n)-1);
        int[] jumps = new int[len];
        jumps[0] = 1;
        for(int i=1;i<len;i++){
            jumps[i] = 3*jumps[i-1]+1;
        }
        return jumps;
    }
    
}
