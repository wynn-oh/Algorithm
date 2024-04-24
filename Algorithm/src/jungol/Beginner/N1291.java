package jungol.Beginner;

import java.util.Scanner;

public class N1291 {
	
	/**
	 *  #1291 : 구구단
	 *  
	 * [처리조건] 
	 * 1. 구간의 처음(s)과 끝(e)을 입력받는다.(s와 e는 2부터 9사이의 정수)
	 * 2. 입력된 구간은 반드시 처음 입력 값이 끝의 입력 값보다 작아야 하는 것은 아니다. 즉, 입력된 구간의 범위는 증가하나 감소하는 순서 그대로 출력되어야 한다.
	 * 3. 구구단 사이는 3개의 공백으로 구분한다.
	 * 4. 데이터의 크기가 주어진 범위를 벗어날 경우는 "INPUT ERROR!"를 출력하고 s와 e를 다시 입력받는다.
	 * 
	 * */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int prmt1 = scanner.nextInt();
		int prmt2 = scanner.nextInt();
		
		// check validation
		if(prmt1 < 2 || prmt1 > 9 || prmt2 < 2 || prmt2 > 9) {
			System.out.println("INPUT ERROR!");
		}
	}

}
