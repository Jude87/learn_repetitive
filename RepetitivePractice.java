package practice.repetitive;

import java.util.Scanner;

public class RepetitivePractice {
	public void method1() {
		
		for(int i = 0; i < 4; i++) {
			//공백 출력 (3,2,1,0)
			for(int j = 3; j > i; j--) { // 3:0 2:1 1:2
				System.out.print(" ");
			}
			//별 출력 (1,3,5,7)
			for(int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
				
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345 만들기
		 */
//		for(int i = 0; i < 5; i++) {
//			int start = 1; //다시 1부터 시작하도록 시작 for문 안에 넣음
//			for(int j = 0; j < 5; j++) {
//				System.out.print(start);
//				start++;
//			}
//			System.out.println();
//		}
		for(int i = 0; i <= 0; i++) {
			 
		}
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
	}
	public void method2() {
		//마름모 모양 별찍기
		System.out.print("홀수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//입력값 num이 7이라면?
		//상단부 (피라미드) 0~2행
		for(int i = 0; i < num / 2; i++) {
			//공백 출력 (3,2,1)
			for(int j = num / 2; j > i; j--) {
				System.out.print(" ");
			}
			//별 출력 (1,3,5)
			for(int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			//개행
			System.out.println();
		}
		//하단부 (역피라미드) 3~6행
		for(int i = num / 2; i >= 0; i--) {
			//공백 출력 (0,1,2,3)
			for(int j = num / 2; j > i; j--) {
				System.out.print(" ");
			}
			//별 출력 (7,5,3,1)
			for(int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			//개행
			System.out.println();
		}
	}
	public void method3() {
		//문자열 무한 반복 입력
		Scanner sc = new Scanner(System.in);
		String result = "";
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			if(str.equals("stop")) { // 문자열의 값이 stop이라면
				System.out.println("결과 : " + result);
				break;
			}
			result += str + " ";
			System.out.println("결과 : " + result);
		}
	}
	public void method4() {
		//카페 주문 프로그램
		Scanner sc = new Scanner(System.in);
		
		//메뉴별 주문량
		int ameri = 0;
		int latte = 0;
		int vanilla = 0;
		
		//무한 반복
		while(true) {
			//메뉴 출력
			System.out.println("======= 메뉴 =======");
			System.out.println("1. 아메리카노");
			System.out.println("2. 카페라떼");
			System.out.println("3. 바닐라라떼");
			System.out.println("===================");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.print("수량 선택 : ");
			int amount = sc.nextInt();
			
			switch(menu) {
			case 1:
				ameri += amount;
				break;
			case 2:
				latte += amount;
				break;
			case 3:
				vanilla += amount;
				break;
			default:
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}
			
			System.out.print("추가 주문 하시겠습니까? (Y/N) : ");
			char select = sc.next().charAt(0);
			
			if(select == 'N' || select == 'n') {
				System.out.println("===================");
				if(ameri != 0) {
					System.out.println("아메리카노 " + ameri + "잔 : " + 3500 * ameri + "원");
				}
				if(latte != 0) {
					System.out.println("카페라떼 " + latte + "잔 : " + 4100 * latte + "원");
				}
				if(vanilla != 0) {
					System.out.println("바닐라라떼 " + vanilla + "잔 : " + 4300 * vanilla + "원");
				}
				System.out.println("===================");
				System.out.println("총액 : " + (3500 * ameri + 4100 * latte + 4300 * vanilla) + "원");
				break;
			}
		}
	}
}
