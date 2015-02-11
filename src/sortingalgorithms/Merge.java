/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortingalgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge<T extends Comparable<T>> implements SortingAlgorithms<T>{

    @Override
    public T[] sort(T[] array) {
        T[] left = Arrays.copyOfRange(array, 0,array.length/2);
        T[] right = Arrays.copyOfRange(array,(int)Math.ceil(array.length/2),array.length);
        T[] a = sort(left,right);
        return a;
    }
    
    public T[] sort(T[] left, T[] right) {
        if((left.length > 1)&&(right.length > 1)) {
            left = sort(Arrays.copyOfRange(left, 0,left.length/2),
                        Arrays.copyOfRange(left,(int)Math.ceil(left.length/2),left.length));
            right = sort(Arrays.copyOfRange(right, 0,right.length/2),
                        Arrays.copyOfRange(right,(int)Math.ceil(right.length/2),right.length));
            return merge(left,right);
        } else if (right.length > 1) {
            right = sort(Arrays.copyOfRange(right, 0,right.length/2),
                        Arrays.copyOfRange(right,(int)Math.ceil(right.length/2),right.length));
            return merge(left,right);
        } else {
            return merge(left,right);
        }
    }
    
    public T[] merge(T[] left, T[] right) {
        return merge((T[]) Array.newInstance(left.getClass().getComponentType(), left.length+right.length), 0, left, right);
    }
    
    public T[] merge(T[] t,int pos,T[] left, T[] right) {
        if((left!=null)&&(right!=null)){
            if(left[0].compareTo(right[0]) <= 0) {
                t[pos]=left[0];
                pos+=1;
                if(left.length == 1){
                    return merge(t,pos,null,right);
                } else {
                    return merge(t,pos,(T[])Arrays.copyOfRange(left,1,left.length),right);
                }
            } else {
                t[pos]=right[0];
                pos+=1;
                if(right.length==1){
                    return merge(t,pos,left,null);
                } else {
                    return merge(t,pos,left,(T[])Arrays.copyOfRange(right,1,right.length));
                }
            }
        } else if(left!=null) {
            t[pos]=left[0];
            pos+=1;
            if(left.length==1){
                return merge(t,pos,null,right);
            } else {
                return merge(t,pos,(T[])Arrays.copyOfRange(left,1,left.length),right);
            }
        } else if(right!=null) {
            t[pos]=right[0];
            pos+=1;
            if(right.length==1){
                return merge(t,pos,left,null);
            } else {
                return merge(t,pos,left,(T[])Arrays.copyOfRange(right,1,right.length));
            }
        }
        return t;
    }
}
