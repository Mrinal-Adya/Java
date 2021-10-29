package com.arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter size of array");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		System.out.println("Enter Array");
		
		for(int i=0;i<n;i++) 
			list.add(scan.nextInt());
		//
		int sum = add(list);
		System.out.println("Sum of elements in array is" + sum);
		System.out.println("Mean is " + sum/n);
		double med = median(list);
		System.out.println("Median is " + med);
		
		
		
	}
	
	public static double median(ArrayList<Integer> list) {
		Collections.sort(list);
		if(list.size() % 2 ==1)
			return list.get((list.size()+1)/2 -1);
		else {
			double l = list.get((list.size()+1)/2 -1);
			double r = list.get((list.size()+1)/2);
			return (l+r)/2;
		}
	
		}
	
	public static int add(ArrayList<Integer> list) {
		
		int sum =0;
		
		for(int i:list)
			sum += i;
		return sum;
	}	
	
	
	

}

