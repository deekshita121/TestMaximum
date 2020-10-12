package com.capg.testMaximum;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TestMaximum <T extends Comparable<T>>
{
	List<T> inputs;
	private static final Logger log = LogManager.getLogger(TestMaximum.class);
	T x, y, z;
	
	public TestMaximum(T...inputs)
	{
		this.inputs=Arrays.asList(inputs);
	}
	
	public T toMax()
	{
		return  TestMaximum.toMax(inputs);
		
	}
	
	public static <T extends Comparable<T>> T toMax(List<T> inputs)
	{

		T max;
		List<T> sortedList = new ArrayList<>(inputs);
		Collections.sort(sortedList);
		max = sortedList.get(sortedList.size() - 1);
		return max;
	}
	
	
	
    public static void main( String[] args )
    {
    	
		Integer a=40, b=20, c=55, d=2, e=43;
		log.info(new TestMaximum<Integer>(a,b,c,d,e).toMax());
		String m="45", n="60", o="55", p="6", q="21";
		log.info(new TestMaximum<String>(m,n,o,p,q).toMax());
		
		
    }
}
