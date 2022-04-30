package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	Add ad = new Add();
    	Sub su = new Sub();
    	Mul mu = new Mul();
    	Div di = new Div();

    	String sum = sc.nextLine();
    	
    	if(sum.equals("+")) {
			System.out.println(ad.calculate());
		}
		else if(sum.equals("-")) {
			System.out.println(su.calculate());
		}
		else if(sum.equals("*")) {
			System.out.println(mu.calculate());
		}
		else if(sum.equals("/")) {
			System.out.println(di.calculate());
		}
		else {
			System.out.println("선택한 연산자가 적절하지 않습니다 ... 다시 선택해 주세요");
    	
    	
    	sc.close();
		}
	}
}
