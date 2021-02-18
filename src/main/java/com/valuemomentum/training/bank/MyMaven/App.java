package com.valuemomentum.training.bank.MyMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "--------Banking Application" );
        customer c1=new customer(101, "ram", (double) 2500);
        c1.display();
    }
}
