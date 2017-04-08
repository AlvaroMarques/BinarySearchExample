/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Álvaro
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ns = new int[]{1,3,5,8,4,11};
        binaryArray x = new binaryArray(ns);
        System.out.println(x.binarySearchTree(7));
    }
    
}
