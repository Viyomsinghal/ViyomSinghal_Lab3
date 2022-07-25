package com.greatLearning.service;

import java.util.Scanner;
import java.util.Stack;

public class balancingExpression {
	
	public static boolean isBalanced (String expression) {
		Stack<Character>stack=new Stack<Character>();
		for(int i=0;i<expression.length();i++) {
			char ch=expression.charAt(i);
			if(ch=='(' || ch=='[' ||ch=='{') {
				stack.push(ch);
				continue;
			}if(stack.isEmpty()) {
				return false;
			}
			
			char c= stack.pop();
			switch(ch) {
				case '}':
					
					if(c=='(' || c=='[') {
						return false;
					}
					break;
				case ')':
					
					if(c=='{' || c=='[') {
						return false;
					}
					break;
				case ']':
				
				if(c=='(' || c=='{') {
					return false;
				}
				break;
			
		}
	}
   
		return stack.empty();
		
	}

}
