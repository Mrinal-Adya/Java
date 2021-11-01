package com.flower;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnjoyRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Adults");
		int adults = scan.nextInt();
		System.out.println("Enter number of Children");
		int children = scan.nextInt();
		System.out.println("Enter number of Hours");
		int hours = scan.nextInt();
		System.out.println("Enter Ride you want to take");
		String ride = scan.next();
		String rideName = ride.toUpperCase();
		
		int totalFareForChildren = fareforChildren(rideName,children,hours);
		int totalFareForAdults = fareforAdults(rideName,adults,hours);
		
		int finalFare = totalFareForChildren + totalFareForAdults;
		
		System.out.print("Totals number of hours = " + hours + "\n" + "Adult fair Ride =" + totalFareForAdults + "\n" + 
		"Children ride fare = $ " +totalFareForChildren + "\n" + "Total amount =$ " + finalFare );
		

	}
	
public static int fareforChildren(String ride,int numberOfChildren,int hrs) {
	
		Map<String,Integer> priceForChildren = new HashMap<>();
		
		priceForChildren.put("ALIBABA", 40);
		priceForChildren.put("ALPINE", 30);
		priceForChildren.put("BUMPPER", 25);
		priceForChildren.put("BALOON", 60);
		
		
		if(priceForChildren.containsKey(ride)) 
			return priceForChildren.get(ride)*numberOfChildren*hrs;
		else {
			
			System.out.println("Plz Enter valid input");
			return 0;
		}
	}


	public static int fareforAdults(String ride, int numberOfAdults,int hrs) {
		
		Map<String,Integer> priceForAdults = new HashMap<>();
		
		priceForAdults.put("ALIBABA", 50);
		priceForAdults.put("ALPINE", 60);
		priceForAdults.put("BUMPPER", 45);
		priceForAdults.put("BALOON", 70);
		
		if(priceForAdults.containsKey(ride)) 
			return priceForAdults.get(ride)*numberOfAdults*hrs;
		else {
			System.out.println("Plz Enter valid input");
			return 0;
		}			
		
	}
	
}
