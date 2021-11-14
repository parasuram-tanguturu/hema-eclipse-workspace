package com.secondproject;

public class Worldprint {
	
	
	void print() {
	      print("Hello World");
		
	}

	void print(String word) {
			print(word,1);
	}

	void print(String word,int numberoftimes) {
		for(int i=1; i<=numberoftimes; i++ ) {
			System.out.printf("# %s # \n" ,  word );
			
		}
	}
	 
 }
	
