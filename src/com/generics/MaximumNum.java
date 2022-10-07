package com.generics;

public class MaximumNum {

	public static Float maximumFloat(Float num1, Float num2, Float num3) {

		Float max = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			max = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			max = num2;
		else
			max = num3;
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Maximum Float Number Among 3 will be :- " + maximumFloat(70.6f, 40.7f, 50.8f));
	}

}
