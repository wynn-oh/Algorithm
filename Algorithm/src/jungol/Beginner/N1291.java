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
	private static String term = "   ";
	private static String astr = " * ";
	private static String eqls = " = ";

	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
		
		
		while(true) {
		    
		    int prmtr1 = scnr.nextInt();
		    int prmtr2 = scnr.nextInt();
		    
		    boolean isColNum = true;
		    
	             if (prmtr1 < 2 || prmtr2 < 2) {isColNum = false;} 
	        else if (prmtr1 > 9 || prmtr2 > 9) {isColNum = false;}
		    
		    // check validation
		    if(!isColNum) { 
		        System.out.println("INPUT ERROR!");
		    } else {
		    	if(prmtr1 > prmtr2) minRept(prmtr1, prmtr2);
		    	else                maxRept(prmtr1, prmtr2);
		        break;
		    }
		    
		}
		
		scnr.close();
		
	}
	
	private static void maxRept(int prmtr1, int prmtr2) {
        for(int reptVal = 1; reptVal < 10; reptVal++) {
            for(int i = prmtr1; i <= prmtr2; i++) {
                String lpdStr = "";
                
                if(i * reptVal < 10) {lpdStr += " " + i * reptVal;} 
                else                 {lpdStr +=       i * reptVal;}
                
                System.out.printf(i+astr+reptVal+eqls+lpdStr+term);
            }
            System.out.println();
        }
	}
	
	private static void minRept(int prmtr1, int prmtr2) {
        for(int reptVal = 1; reptVal < 10; reptVal++) {
            for(int i = prmtr1; i >= prmtr2; i--) {
                String lpdStr = "";
                
                if(i * reptVal < 10) {lpdStr += " " + i * reptVal;} 
                else                 {lpdStr +=       i * reptVal;}
                
                System.out.printf(i+astr+reptVal+eqls+lpdStr+term);
            }
            System.out.println();
        }
	}

}
