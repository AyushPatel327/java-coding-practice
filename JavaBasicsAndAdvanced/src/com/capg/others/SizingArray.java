package com.capg.others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SizingArray {
//	static int b[] = new int[6];
		

	public static void main(String[] args) {
//		int a[] = new int[5];
//		
//		for (int i = 0; i < a.length; i++) {
//			a[i]= i;
	//	}
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	      List<List<Integer>> lists = new ArrayList<>();
	    for(int i = 0; i < n;i++){
	            lists.add(new ArrayList());
	        int d = sc.nextInt();
	        for(int j = 0; j< d;j++){
	            lists.get(i).add(sc.nextInt());
	        }
	       
	            int q = sc.nextInt();
	             for(int k = 0; k < q;i++){
	                 int x = sc.nextInt() - 1;
	                 int y = sc.nextInt() - 1;  
	                 
	                 try{
	                     System.out.println(lists.get(x).get(y));}
	                 catch(IndexOutOfBoundsException exc){
	                     System.out.println("ERROR!");
	                 }
	             }
	        
	    }
	    sc.close();
		
	}

}
