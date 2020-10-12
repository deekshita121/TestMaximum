package com.capg.testMaximum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TestMaximum <T extends Comparable<T>>
{
	
	private static final Logger log = LogManager.getLogger(TestMaximum.class);
	T x, y, z;
	
	public TestMaximum(T x, T y, T z)
	{
		super();
		this.x=x;
		this.y=y; 
		this.z=z;
	}
	
	public T toMax()
	{
		return  TestMaximum.toMax(this.x,this.y,this.z);
		
	}
	
	public static <T extends Comparable<T>> T toMax(T x, T y, T z)
	{
		T max = x;
		if(y.compareTo(max)>0)
			max=y;
		if(z.compareTo(max)>0)
			max=z;
	
		return max;
	}
	
	
	
    public static void main( String[] args )
    {
    	
		Integer a=40, b=20, c=55;
		TestMaximum<Integer>testMaximum=new TestMaximum<Integer>(a,b,c);
		String d="45", e="60", f="55";
		TestMaximum<String>testMaximum1=new TestMaximum<String>(d,e,f);
		log.info("The maximum in "+a+", "+b+", "+c+" is "+testMaximum.toMax());
		log.info("The maximum in "+d+", "+e+", "+f+" is "+testMaximum1.toMax());
		
    }
}
