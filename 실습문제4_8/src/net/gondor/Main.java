package net.gondor;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 8. 스태틱으로 만들어보세요
 * 
 * @author 206-002
 *
 */
public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해주세요");
		int num1 = input.nextInt();
		numbers.add(num1);
		System.out.println("두번째 수를 입력해주세요");
		int num2 = input.nextInt();
		numbers.add(num2);
		System.out.println("세번째 수를 입력해주세요");
		int num3 = input.nextInt();
		numbers.add(num3);
		
		Comparing.arrange(numbers);
		Comparing.showArray(numbers);
	}
}