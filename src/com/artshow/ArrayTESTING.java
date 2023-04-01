package com.artshow;

import java.util.ArrayList;

public class ArrayTESTING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,40,50};
		System.out.println("Third Number:"+arr[3]);
		
		for(int i=0;i<arr.length;i++) {
			int a= i+1;
			System.out.println("Number "+a+" is: "+arr[i]);
		}
		
		// Array Listt
		System.out.println();
		// Create a list
		ArrayList<String>  list = new ArrayList<String>();
		list.add("Nikhil");
		list.add("Bishnoi");
		list.add("Ribbon");
		System.out.println(list.get(1));
			
		System.out.println();
		
		System.out.println("****For loop****");
		
		// Extract the value using for loop
		for(int i=0;i<list.size();i++) {
			System.out.println("List :"+list.get(i));
		}
		System.out.println();
		// Enhanced for loop
		System.out.println("*****Enhanced For Loop****");
		System.out.println();
		for (String L:list) {
			System.out.println(L);
		}
		
		
				
}}
