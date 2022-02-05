package com.gl.dsa.assignment3.driver;

import com.gl.dsa.assignment3.analysis.*;
import java.util.Scanner;

public class Main 
{
	
	public static void main(String args[]) 
	{ 
		
		int N;
		
        Scanner sc=new Scanner(System.in);
		System.out.println(" enter the total no of floors in the building"+ " ");
		N=sc.nextInt();
		
		StackImplementation si=new StackImplementation(N);
		si.displayStack();
	
		
	}

	
}
