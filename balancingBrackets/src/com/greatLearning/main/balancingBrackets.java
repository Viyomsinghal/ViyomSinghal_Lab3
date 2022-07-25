package com.greatLearning.main;

import java.util.Scanner;

import com.greatLearning.service.balancingExpression;

public class balancingBrackets {
	

	public static void main(String[] args) {
		balancingExpression exp=new balancingExpression();
		String expression;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the expression to be checked :");
		expression=sc.next();
		
		
		if(exp.isBalanced(expression)) {
			System.out.println("The entered string has Balanced Brackets");
		}else {
			System.out.println("The entered string does not contain balanced brackets");
		}
	}

}
