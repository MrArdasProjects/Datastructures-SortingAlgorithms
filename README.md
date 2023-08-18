# Datastructures-SortingAlgorithms
This project pertains to the implementation of important methods related to Sorting Algorithms in the context of the Data Structures and Advanced Algorithms course within the Computer Engineering department. 

The following instructions have been implemented in the project.

1. Create an ArrayList named myArrayList. Fill it with 100 integer values ranged 
between [1,1000]. You can generate them by using java.util.Random library. Also, 
create another list with the same numbers of myArrayList and name this new list as
benchmarkArrayList. 

2. Implement the Quicksort algorithm in Sorting class. Select the pivot as the first
element of the list. It should take a list as its only parameter.

3. Sort the numbers in myArrayList using your Quicksort method and print the sorted 
list.
4. Sort the numbers in benchmarkArrayList using Arrays.sort()and print the 
sorted list. 

5. Compare the execution time of your implementation with the built-in sorting method of 
Java. What is the running time of your algorithm and what is the running time of Java 
method? Is there a recognizable time difference between them? What could be the 
reason behind it if there is a difference? Does the running time change if we select the 
pivot as the last element? Discuss your findings with your own words as a comment to 
your source code.

You can use the given template method to measure the running time. Keep the list 
printing operation outside of time calculation so that it will not affect the result.

long startTime = System.nanoTime();
// The sorting operation
long endTime = System.nanoTime();
long elapsedTime = endTime - startTime;
// Print sorted list
