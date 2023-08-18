/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;


public class Sorting {
    private ArrayList<Integer> arrayList;
     public Sorting(){
        
       this.arrayList = new ArrayList<>();
    
    }
    public Sorting(ArrayList<Integer> array){
    this.arrayList=array;
    
    
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
    
    
     public ArrayList<Integer> quickSort(ArrayList<Integer> array, int left, int right){
         int i=left;
         int j=right;
         int pivot=array.get(left);
        while (i<=j){
            while(array.get(i)<pivot){
            i++;
            }
            while(array.get(j)>pivot){
                j--;
            }
            if(i<=j){
            int temp= array.get(i);
            array.set(i, array.get(j));
            array.set(j, temp);
            i++;
            j--;
            }
        }
        if(left<j)
            quickSort(array, left,j);
        if(i<right)
            quickSort(array, i, right);
        
        return array;
    }
    
   
         public void printArray()
    {
        for (int i = 0; i < arrayList.size(); ++i)
            System.out.print(arrayList.get(i) + " ");

        System.out.println();
    }
     
     
    
}
