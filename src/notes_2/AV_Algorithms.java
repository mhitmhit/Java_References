package notes_2;

public class AV_Algorithms {

}
/**

An algorithm is a process or set of rules/steps to be followed in calculations or some other problem-solving operation.
When crafting algorithms, the amount or size of input will often affect the overall runtime of the algorithm.
As programmers, we measure the effectiveness of algorithms based on their Time-complexity (how many steps are 
required for an algorithm), and Space-complexity (how much memory is required for an algorithm). Both complexity 
measurements are represented using Big-O notation, which measures the efficiency of an algorithm as inputs approach infinity.
Additionally, some problems occur frequently in programming, such as sorting data sets or searching for specific 
values, and many common techniques exist which can be used to solve these problems.

 
 
 
 
 A recursive algorithm 
 is one that calls itself directly or indirectly in order to continuously repeat the same 
 set of steps until a solution is reached.
With recursive functions, the functions keep executing and calling themselves (recursing) until they reach some 
condition called the base case.
The base case in recursion is the condition that defines the simplest scenario or stopping point for the recursive algorithm.
 
 
 
 
 
 A Greedy Algorithm 
 is a paradigm where in a given solution, at any specific stage, the algorithm will always choose 
 the most immediate and optimal solution to satisfy the current stage, 
 even if it is not the most optimal for the solution as whole.
 
 
 
 
 

Divide and Conquer Algorithms
A Divide and Conquer algorithm, or DAC for short, can be thought of as a technique that separates a 
given problem out into tangible sub-problems that can be more easily solved. There are typically three parts 
to a DAC algorithm:

    Divide: In this step, we break the problem down into smaller sub-problems until they can be solved.
    Conquer: This step is where we actually solve the problem, typically through recursion.
    Combine: Combine the results from all of the subproblems to get our final solution for the entire problem.


 
 

Backtracking Algorithms
A Backtracking Algorithm, similar to Brute Force, is a paradigm that uses a recursive approach to test every 
possible solution and then compare the results to find the most optimal. These types of algorithms are often quite 
expensive in terms of Time complexity, because it needs to check every possibility that can exist. The term Backtracking 
means that if the algorithm determines that the current path it is traversing is never going to be optimal, it will 
backtrack to a point where another decision, or path exists. Each time we backtrack and iterate, we can describe the 
next solution as a new Permutation.

 
 
 
 
 
 
 Linear Search
 Linear search is a very simple search algorithm. In this type of search, a sequential search is done for all items, 
 one by one. Every item is checked, and if a match is found, then that particular item is returned; otherwise, 
 the search continues until the end of the data collection
 In a Linear Search, a sequential search is performed for all items one by one.
Every item is checked, and if a match is found, then that particular item is returned; otherwise, the search continues 
until the end of the data collection.
Although linear search is generally not the most efficient method of searching an array, it is the 
best method for searching an unsorted array.







Binary Search (data must be sorted)   O(log n)
Binary search is a method for searching for a given item in a sorted array
    The time complexity of the binary search algorithm is O(log n).
The space complexity of the binary search algorithm depends on the implementation of the algorithm.
    In the iterative method, the space complexity would be O(1).
    The space complexity for the recursive method would be O(log n).
Example:
//  Searches the array A for the integer N.
//  Precondition:  A must be sorted in increasing order.
//  Postcondition: If N is in the array, then the return value, i,
//     satisfies A[i] == N.  If N is not in the array, then the
//     return value is -1.
// 
//static int binarySearch(int[] A, int N) {
//      
//    int lowestPossibleLoc = 0;
//    int highestPossibleLoc = A.length - 1;
//    
//    while (highestPossibleLoc >= lowestPossibleLoc) {
//       int middle = (lowestPossibleLoc + highestPossibleLoc) / 2;
//       if (A[middle] == N) {
//                 // N has been found at this index!
//          return middle;
//       }
//       else if (A[middle] > N) {
//                 // eliminate locations >= middle
//          highestPossibleLoc = middle - 1;
//       }
//       else {
//                 // eliminate locations <= middle
//          lowestPossibleLoc = middle + 1;   
//       }
//    }
//    
//    // At this point, highestPossibleLoc < lowestPossibleLoc,
//    // which means that N is known to not be in the array. Return
//    // -1 to indicate that N could not be found in the array.
// 
//    return -1;
//  
//}
 
 
 
 
 
 
 
 
 
 
 



Bubble Sort O(n^2)
simple sorting algorithm that repeatedly steps through the array to be sorted, compares adjacent elements and 
swaps them if they are in the wrong order.
poor performance on large data. good when pc resources are low.
Example:
public class Main {
  public static void main(String[] args) {
    int[] arr = {64, 34, 25, 12};

    // Loop through each element of the array
    for (int i = 0; i < arr.length - 1; i++) {
      // Last i elements are already sorted
      for (int j = 0; j < arr.length - i - 1; j++) {
        // Compare adjacent elements and swap if needed
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 Merge Sort:O(nlog(n))
 A divide-and-conquer algorithm divides a problem into smaller subproblems, solves the subproblems recursively, 
 and then combines their solutions to solve the original problem. 
 The time complexity of this sort is O(nlog(n))
 Example:
 public class App {
    public static void main(String[] args) {
      int[] arr = {64, 34, 25, 12, 22, 11, 90};
  
      // Call the merge sort method
      mergeSort(arr, 0, arr.length - 1);
  
      // Print the sorted array
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    }
  
    public static void mergeSort(int[] arr, int left, int right) {
      if (left < right) {
        int middle = (left + right) / 2;
  
        // Recursively sort the left and right sub-arrays
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
  
        // Merge the sorted sub-arrays
        merge(arr, left, middle, right);
      }
    }
  
    public static void merge(int[] arr, int left, int middle, int right) {
      // Find the sizes of the left and right sub-arrays
      int n1 = middle - left + 1;
      int n2 = right - middle;
  
      // Create temporary arrays to hold the left and right sub-arrays
      int[] L = new int[n1];
      int[] R = new int[n2];
  
      // Copy the elements of the left and right sub-arrays into the temporary arrays
      for (int i = 0; i < n1; i++) {
        L[i] = arr[left + i];
      }
      for (int j = 0; j < n2; j++) {
        R[j] = arr[middle + 1 + j];
      }
  
      // Merge the temporary arrays back into the original array
      int i = 0, j = 0;
      int k = left;
      while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
          arr[k] = L[i];
          i++;
        } else {
          arr[k] = R[j];
          j++;
        }
        k++;
      }
  
      // Copy any remaining elements from the left sub-array
      while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
      }
  
      // Copy any remaining elements from the right sub-array
      while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
      }
    }
  }
 
 
 
 
 
 
 */
