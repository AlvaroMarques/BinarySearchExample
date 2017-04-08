/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;
import java.util.Arrays;
/**
 *
 * @author Álvaro
 */
public class binaryArray {
    int[] array;
    public binaryArray(int [] array){
        this.array = array;
        Arrays.sort(this.array);
        
    }
    public boolean binarySearchTree(int n){
        int c,min,max;
        c = array.length/2;
        min = 0;
        max = array.length;
        do {
            if(n>array[c]){
                min = c;
                c = (c+max)/2;
            }else if(n < array[c]){
                max = c;
                c = (c+min)/2;
            }
            if(n == array[c]){
                return true;
            }
        } while (c != min && c != max);
        
        return false;
    }
}
