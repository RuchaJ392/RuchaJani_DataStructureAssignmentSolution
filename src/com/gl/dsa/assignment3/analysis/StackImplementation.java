package com.gl.dsa.assignment3.analysis;
import java.util.*;
import  com.gl.dsa.assignment3.analysis.Test;
public class StackImplementation 
{
	private int N,n,i=1,j=1;
	boolean isValueLess=false;
	Stack<Integer> building=new Stack<Integer>();
	Stack<Integer> tempStack=new Stack<Integer>();
    public StackImplementation(int N) 
    {
    	this.N=N;

    }
	public void displayStack() 
	{
		
	   
	        Scanner sc=new Scanner(System.in);
	        int previous_value=0;
	        boolean isValueEntered=false;
		    while(i<=N) 
		    {
		    	System.out.println("enter the floor size given on day "+i);
		    	i++;
		    	n=sc.nextInt();
				building.push(n);
				isValueEntered=true;
				if(isValueEntered) 
				{
					previous_value=n;
					isValueEntered=false;
				}
				
				System.out.println(previous_value);
				if(n<N)
				{
					this.isValueLess=true;
					//System.out.println(this.isValueLess);
					
				}
			
				if(this.isValueLess)
				{ 
					int index=building.indexOf(n);
					tempStack.push(building.remove(index));
					building.add(index, null);
					this.isValueLess=false;
				}
			}
		    System.out.println("building stack is"+building);
		    System.out.println("The order of construction is as follows");
	
		    while(j<=N)
		     {

		      
	            if(building.elementAt(j-1)==null)
	            {
	                
		            
	                System.out.println("Day"+j);
	            
	            }
	      
	            else 
	            {
	            	System.out.println("Day"+j+" "+building.elementAt(j-1));
	            }
	        
		    	 j++;
		     }
			

				Test.sortStack(building);

	
		 
		
	}
	
	


}
