package com.firstjavaproject;

public class MultiplicationTableRunner { 

	public static void main(String[] args) {
		Multiplicationtable table = new Multiplicationtable();

		table.print();  // print 5 table from 1 to 10
		table.print(8);  // print given table from 1 to 10
		table.print(5, 1, 10); // print given table from -to by given range

	}

}
