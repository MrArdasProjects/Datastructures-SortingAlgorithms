/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> myArrayList = new ArrayList<>();
       Sorting s1= new Sorting(myArrayList);
       Random rastgele = new Random();
       for(int i=0; i<100; i++){
            int randomNumber = rastgele.nextInt(1000); 
            myArrayList.add(randomNumber);
       }
       int[] benchmarkArray= new int[100];
        for(int i=0; i<100;i++){
            benchmarkArray[i]= myArrayList.get(i);
        
        }
        int n = myArrayList.size();
        System.out.println("First location of array elements: ");
        s1.printArray();
        
        System.out.println("Final location of elements: ");
        long startTime = System.nanoTime();
        s1.quickSort(myArrayList, 0, n-1);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        
        s1.printArray();
        System.out.println("First Elapsed time is : "+ elapsedTime);
        
        
        long startTime2 = System.nanoTime();
        Arrays.sort(benchmarkArray);
         long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;
        
        System.out.println("second elapsed time is ;  "+ elapsedTime2);
        
    }
    
    
}

//First Elapsed time is : 638000
//second elapsed time is ;  616400 Java's quicksort alghoritm is faster than our created alghoritm 
//Because java use the most efficient methods and tools for doing this sorting implementation. İt works different than ours.
//That's why it is better and faster than our alghoritm.Arrays. İf we select another pivot
//Except for the above two cases, there is a special case when all the elements in the given input array are the same. In such a scenario, 
//the pivot element can't divide the input array into two and the time complexity of Quicksort increases significantly
