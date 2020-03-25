package com.company;

public class Main {

    public static void main(String[] args) {
	String monate [] =
            {
	        "Jänner", "Februar", "Maerz", "April", "Mai", "Juni", "Juli",
	                    "August", "September", "Oktober", "November", "Dezember"
            };
        //System.out.println(monate.length);
        for (int months = 0; months < monate.length; months++ )
		{
			System.out.println((months +1) +(" ")+ monate[months]);
		}
	    }
}
