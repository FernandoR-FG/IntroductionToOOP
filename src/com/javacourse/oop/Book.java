package com.javacourse.oop;

public class Book {
	//State
	private int noOfCopies;
	//Behaivor
	void setNoOfCopies(int noOfCopies) {
		if(noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}
	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}
	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
}
