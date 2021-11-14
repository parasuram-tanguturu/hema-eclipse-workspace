package com.firstjavaproject;

public class Multiplicationtable {
	// 5*1=5
	// 5*10=50

	void print() {
       //1.Requrement :: print 
		print(5);

	}

	void print(int table) {
		print(table, 1, 10);
	}

	void print(int Table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d  %d=%d", Table, i, Table * i).println();

		}
	}
}
