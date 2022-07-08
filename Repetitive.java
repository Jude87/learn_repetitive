package example.repetitive;

import java.util.Scanner;

public class Repetitive {
	/*
	 *  반복문
	 *  프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로 특정 문장들을 반복해서 수행하도록 함
	 *  반복문의 종류로는 for문과 while문이 있음
	 *  
	 *  for문
	 *  for(초기식; 조건식; 증감식){
	 *         수행될 문장;
	 *  }
	 */
	public void testFor() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "번째 출력");
		}
		//i를 감소
		for(int i = 10; i > 0; i--) {
			System.out.println(i + "번째 출력");
		}
		//증감식은 반드시 1씩 증감할 필요 없음
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i + "번째 출력");
		}
		//int가 아닌 char를 입력하면?
		//유니코드로 인식해서 실행한다
		for(char ch = 'a'; ch <= 'e'; ch++) {
			System.out.println(ch);
		}
	}
	/*
	 *  while문
	 *  while(조건식){
	 *        수행될 문장;
	 *        [증감식 or 분기문];
	 *  }
	 */
	public void testWhile() {
		//초기식
		int i = 0;
		while(i < 10) { //조건식
			System.out.println(i + "번째 i 출력");
			i++; //증감식			
		}
		
		//감소
		int j = 10;
		while(j > 0) {
			System.out.println(j + "번째 j 출력");
			j--;
		}
		
		//무한 루프 : 조건 값을 항상 true
		int k = 0;
		while(true) {
			System.out.println(k++ + "번째 k 출력");
		}
		/*
		 *  do ~ while문
		 *  do 안의 내용을 먼저 실행하고 while의 조건식 확인 후 true면 문장 수행, while뒤에 ;(세미콜론) 꼭 필요함
		 *  do~while문은 조건문이 true가 아니더라도 무조건 한 번 이상 수행됨
		 *  
		 *  초기식;
		 *  do {
		 *        수행될 문장;
		 *        [증감식 or 분기문];
		 *  } while(조건식);  
		 */
	}
	public void testDowhile() {
		//초기식
		int i = 0;
		do {
			System.out.println(i + "번째 i 출력");
			i++; // 증감식
		}while(i < 10); //조건식 + 세미콜론
		
		int j = 10;
		do {
			System.out.println(j + "번째 j 출력");
			j--;
		}while(j > 0);
		
		// do~while문 무한 루프
		int k = 0;
		do {
			System.out.println(k + "번째 k 출력");
			k++;
		}while(true);
	}
	/*
	 *  중첩 반복문
	 *  for문에 진입하면 수행될 문장1을 먼저 수행하고 두번째 for문에 진입하면 조건식2가 false가 될 때까지
	 *  수행될 문장2를 수행 후 나오면 수행될 문장3을 수행하고 조건식1로 돌아와 true면 반복
	 *  
	 *  표현식
	 *  for(초기값1; 조건식1; 증감식;){
	 *      수행될 문장;
	 *      for(초기값2; 조건식2; 증감식2){
	 *          수행될 문장2;
	 *      }
	 *      수행될 문장3;
	 *  }
	 */
	public void testGugudan() {
		//중첩 반복문 구구단
		//for문
		for(int i = 2; i < 10; i++) {
			System.out.println("==== " + i + "단 ====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
		//while문
		int i = 2;
		while(i < 10) {
			System.out.println("==== " + i + "단 ====");
			int j = 1;
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + (i*j));
				j++;
			}
			i++;
		}
	}
	public void testBreak() {		
		//분기문 (break)
		//반복문에서는 break문 자신이 포함된 가장 가까운 반복문을 빠져나감		 
//		for(int i = 1; ; i++) {
//			System.out.println(i + "출력");
//			if(i >= 10) {
//				break;
//			}
//		}
		
		// 숫자를 입력 받아 입력 받은 숫자만큼만 반복적으로 출력 후 종료
		Scanner sc = new Scanner(System.in);
		System.out.print("반복할 횟수 입력 : ");
		int num = sc.nextInt();
		
		int i = 1;
		while(true) {
			System.out.println(i + "번째 i 출력");
			if(i == num) {
				break;
			}
		}
	}
	public void testFor2() {
		//초기식 생략 for문
		int i = 1;
		for(;i<=10;i++) {
			System.out.println(i + "번째 i 출력");
		}
		//조건식 생략 for문
		for(int j = 1;;j++) {
			if(j <= 10) {
			System.out.println(j + "번째 j 출력");
			} else {
				break;
			}
		}
		//증감식 생략 for문
		for(int k = 0; k < 10; ) {
			System.out.println(k + "번째 k 출력");
			k++;
		}
		//모두 생략
		int l = 0;
		for(;;) {
			if(l < 10) {
				System.out.println(l + "번째 l 출력");
				} else {
					break;
				}
			l++;
		}
	}
	public void testContinue() {
	// 분기문 (continue)
	// 반복문 내에서만 사용 가능하며, 반복문 실행 시 continue 아래 부분은 실행하지 않고 반복문 다시 실행
	// for문의 경우 증감식으로 이동, while(do~while)문의 경우 조건식으로 이동
	// 전체 반복 중에 특정 조건을 만족하는 경우를 제외하고 할 때 유용
//	   for(int i = 1; i <= 10; i++) {
//		   if(i % 2 == 0) {
//			   continue;
//		   }
//		   System.out.println(i + " 출력");
//	   }
	   
		//1~100까지의 합(3과 5의 배수 제외)을 출력
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			sum2 += i;
		}
		System.out.println("sum : " + sum2);
	}
	/*
	 *  중첩 반복문
	 *  두 번째 for문에 break를 만날 경우 반복문을 나가 수행될 문장3을 수행 후
	 *  다시 첫 번째 for문을 실행하지만, 마지막 break가 있다면 수행될 문장3을 수행 후 for문을 완전히 빠져나감
	 */
	public void testGugudna2() {
		//분기문을 이용한 중첩 반복문 구구단
		
		//for문으로 구구단 짝수단(2단,4단,6단,8단)만 구현
		for(int i = 2; i < 10; i++) { // 증감식을 i+=2씩 증가시켜도 같은 결과가 나옴
			if(i % 2 == 1) continue; // 만약에 홀수값이 나오면 다시 돌아가라
			System.out.println("==== " + i + "단 ====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		//while문으로 구구단 홀수곱만 구현
		int i = 2;
		while(i < 10) {
			System.out.println("==== " + i + "단 ====");
			int j = 0;
			while(j < 10) {
				j++; // 밑의 continue 이후에 증감식이 있으면 값의 변화가 없기 때문에 안에 넣음
				if(j % 2 == 0) continue;
				System.out.println(i + " X " + j + " = " + i*j);
			}
			i++;
		}
		//이런식으로도 구현 가능하다 (증감식 사용 X)
//		int i = 2;
//		while(i < 10) {
//			System.out.println("==== " + i + "단 ====");
//			int j = 1;
//			while(j < 10) {
//				System.out.println(i + " X " + j + " = " + i*j);
//				j+=2;
//			}
//			i++;
//		}		
	}
}
