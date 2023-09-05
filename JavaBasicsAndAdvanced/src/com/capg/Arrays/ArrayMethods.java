package com.capg.Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayMethods {
	
	public static void main(String[] args) {
		 int[] arr = {14,20,32,45,71};
	        
	        //Arrays.fill(arr,0);
	        
	        for(int a: arr)
	        System.out.print(a + " ");
// equals and hash code	        

	        
		System.out.println("\nHashcode : " + Arrays.hashCode(arr));
		System.out.println("Class: " + arr.getClass());
		System.out.println("String method: " + arr.toString());
		
// parallel sort 
		Arrays.parallelSort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
// list of arrays
		List<int[]> list = Arrays.asList(arr);
		
		Iterator<int[]> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
// stream of arrays
		int[] resultArray = Arrays.stream(arr).filter(n -> n%5==0).toArray();
		
		for (int i : resultArray) {
			System.out.print(i + " ");
		}

	}
}
