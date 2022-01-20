package Practice01;
import java.util.*;

//버스 좌석 예매 프로그램 만들기 (영화관 좌석 예매 프로그램과 비슷)
//* 자바로 만든 버스 좌석 예매 프로그램에 구현된 기능
//1. 좌석 확인: 현재의 좌석 상황을 나타냄.
//2. 좌석 예매: 현재 좌석과 예약 가능한 좌석 수를 나타내고, 버스 좌석의 행렬 값을 입력받아서 좌석을 예약함.
//3. 예매 취소: 예약한 좌석을 취소할 수 있는 기능 (한 자리씩만 취소 가능)
//4. 예매 일괄 취소: 예약한 좌석을 취소할 수 있는 기능 (예약한 모든 자리가 취소됨)
//5. 프로그램 종료

public class BusSeats {
	private Scanner sc;
	private static String[][] seats; // 좌석 번호 (행과 열)	
	private static int InputNum; // 열 입력(숫자)
	private static String InputRows; // 행 입력(알파벳)
	private static int InputRowsInt; // 알파벳 아스키 코드 값
	private static int ReserveSeats; // 좌석 예약 번호
	// [i][j]
	// i(행): 알파벳
	// j(열): 숫자
	
	static {
		InputRows = ""; // 행 번호 초기화
		InputRowsInt = 0; // 행 알파벳 아스키 코드 값 초기화
		InputNum = 0; // 열 번호 초기화
		seats = new String[][] {
			{"1", "2", "3", "4"},
			{"1", "2", "3", "4"}
		};
		ReserveSeats = 0;
	}

	public BusSeats() {
		sc = new Scanner(System.in);
	}// 생성자 종료
	
	private void SeatsStatus(String[][] arr) { // 좌석 예매 상태 알아보기
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i].length; // sum = sum + arr[i].length
		}
		System.out.println();
	}
	
	private void ResetSeats() { // 예매 일괄 취소하기
		if(ReserveSeats == 0) {
			System.out.println("예약된 좌석이 없습니다.");
			return;
		}
		else {
			for(int i=0; i< seats.length; i++) {
				for(int j=0; j< seats[i].length; j++) {
					seats[i][j] = String.valueOf(j+1);
				}
			}
			ReserveSeats = 0;
			System.out.println("예매를 모두 취소했습니다.");
		}
	}

	private void Show_Seats() { // 예매 좌석 확인하기
		System.out.println(" <고속버스 승차>");
		System.out.println();
		for(int a=0; a< seats.length; a++) {
			for(int b= 65+a; b< 66+a; b++) {
				System.out.print((char)b);
			}
			System.out.print("|");
			System.out.print(" ");
			
			for(int b=0; b< seats[a].length; b++) {
				System.out.print(" ");
				System.out.print(seats[a][b]);
			}
			System.out.println();
			
			for(int c=0; c< seats[a].length + 8; c++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
	
	private void ChangeSeats() { // 예매 좌석 변경하기
		if(seats[InputRowsInt][InputNum - 1] != "X") {
			seats[InputRowsInt][InputNum - 1] = "X";
			System.out.println("\n@@ 좌석을 예약했습니다. @@");
			ReserveSeats++;
		}
		else {
			System.out.println("\n이미 예약된 좌석입니다. 다시 확인하십시오!");
		}
	}
	
	private void CancelSeats() { // 예매 좌석 취소하기
		if(seats[InputRowsInt][InputNum - 1] == "X") {
			seats[InputRowsInt][InputNum - 1] = String.valueOf(InputNum);
			System.out.println("\n@@ 좌석 예약을 취소했습니다. @@");
			ReserveSeats--;
		}
		else {
			System.out.println("\n예약된 좌석이 아닙니다. 다시 확인하십시오!");
		}
	}
	
	public void Show_Menu() { // 좌석 예매 프로그램 메뉴 선택
		do {
			try {
				String text = "\n======== 버스 좌석 예매 프로그램 ========";
				System.out.println(text);
							  
				System.out.println("1.좌석 확인하기");
				System.out.print("2.좌석 예매하기");
				SeatsStatus(seats);
				System.out.println("3.좌석 예매 취소하기");
				System.out.println("4.좌석 예매 일괄 취소하기");
				System.out.println("5.프로그램 종료하기");
				
				System.out.print("메뉴 선택>> ");
				int menu = Integer.parseInt(sc.nextLine());
				System.out.println();
				
				for(int d=0; d< text.length(); d++) {
					System.out.print("=");
				}
				System.out.println();
				
				switch (menu) {
				case 1:
					Show_Seats();
					break;
					
				case 2:
					InputSeats(menu);
					break;
					
				case 3:
					InputSeats(menu);
					break;
					
				case 4:
					ResetSeats();
					break;
					
				case 5:
					System.out.println("프로그램을 종료합니다!!");
					return;
					
				default:
					System.out.println("\n @@ 다시 선택하세요!! @@ ");
				}
			}
			catch(Exception e) {
				System.out.println("\n @@ 다시 선택하세요!! @@ ");
			}
		}while(true);
	}
	
	private void DisplayMenu() throws InterruptedException { // 예매 좌석 선택하기
		Show_Seats();
		
		// 버스 좌석 배치도
		System.out.println("<\"X\"는 이미 예약된 좌석입니다.>");
		System.out.print("\n행 선택(알파벳)>> ");
		InputRows = sc.nextLine();
		System.out.print("열 선택(숫자)>> ");
		InputNum = Integer.parseInt(sc.nextLine());
	}
	
	private void InputSeats(int menu) { // 선택할(예매) 또는 선택한(취소) 좌석 입력하기
		try {
			if(ReserveSeats == 0 && menu == 3) {
				System.out.println("\n @@ 예약된 좌석이 없습니다. @@");
				return;
			}
			DisplayMenu();
			
			switch(InputRows) {
			case "A":
			case "a":
				InputRowsInt = 0;
				if(menu == 2) {
					ChangeSeats();
					break;
				}
				else if(menu == 3) {
					CancelSeats();
					break;
				}
				
			case "B":
			case "b":
				InputRowsInt = 1;
				if(menu == 2) {
					ChangeSeats();
					break;
				}
				else if(menu == 3) {
					CancelSeats();
					break;
				}
				
			default:
				System.out.println("\n @@ 다시 선택하세요!! @@ ");
			}
		}
		catch(Exception e) {
			System.out.println("\n @@ 다시 선택하세요!! @@ ");
		}
	}
}
