package epam.training.SortingAlgorithm;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	int size;
    	Scanner scan = new Scanner(System.in);
        System.out.println( "Enter the size of array!" );
        size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
        	arr[i] = scan.nextInt();
        }
        SortingMethods bs = new SortingMethods();
        bs.bubbleSort(arr.clone());
        long start = System.nanoTime();
        bs.sort(arr, 0, arr.length-1);
        long now = System.nanoTime();
        System.out.println("MergeSort Time Taken "+(now-start)+" nano seconds");
        start = System.nanoTime();
        bs.qsort(arr, 0, arr.length-1);
        now = System.nanoTime();
        System.out.println("QuickSort Time Taken "+(now-start)+" nano seconds");
        Main.printArray(arr);
        
    }
    
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
