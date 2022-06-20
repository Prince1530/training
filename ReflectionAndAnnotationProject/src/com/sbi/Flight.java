package com.sbi;
@DevlopedBy()
public class Flight {
	
	public String flightname;
	public int flightnumber;
	public String source;
	public String destination;
	
	
	public Flight(int flightnumber,String flightname) {
		super();
		
		this.flightnumber=flightnumber;
		this.flightname=flightname;
		
	}
	
	public Flight(int flightnumber,String flightname,String source) {
		super();
		
		this.flightnumber=flightnumber;
		this.flightname=flightname;
		this.source=source;
		
	}
	public Flight()
	{
		super();
		
	}
	public Flight(int flightnumber,String flightname,String source,String destination) {
		super();
		
		this.flightnumber=flightnumber;
		this.flightname=flightname;
		this.source=source;
		this.destination=destination;
		
	}
	public void fly()
	{
		System.out.println("flight is flying");
		// TODO Auto-generated method stub
	
	}
	public void landing()
	{
		System.out.println("flight is landing");
		// TODO Auto-generated method stub
	
	}
	
}
