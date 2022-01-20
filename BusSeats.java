package Practice01;
import java.util.*;

//���� �¼� ���� ���α׷� ����� (��ȭ�� �¼� ���� ���α׷��� ���)
//* �ڹٷ� ���� ���� �¼� ���� ���α׷��� ������ ���
//1. �¼� Ȯ��: ������ �¼� ��Ȳ�� ��Ÿ��.
//2. �¼� ����: ���� �¼��� ���� ������ �¼� ���� ��Ÿ����, ���� �¼��� ��� ���� �Է¹޾Ƽ� �¼��� ������.
//3. ���� ���: ������ �¼��� ����� �� �ִ� ��� (�� �ڸ����� ��� ����)
//4. ���� �ϰ� ���: ������ �¼��� ����� �� �ִ� ��� (������ ��� �ڸ��� ��ҵ�)
//5. ���α׷� ����

public class BusSeats {
	private Scanner sc;
	private static String[][] seats; // �¼� ��ȣ (��� ��)	
	private static int InputNum; // �� �Է�(����)
	private static String InputRows; // �� �Է�(���ĺ�)
	private static int InputRowsInt; // ���ĺ� �ƽ�Ű �ڵ� ��
	private static int ReserveSeats; // �¼� ���� ��ȣ
	// [i][j]
	// i(��): ���ĺ�
	// j(��): ����
	
	static {
		InputRows = ""; // �� ��ȣ �ʱ�ȭ
		InputRowsInt = 0; // �� ���ĺ� �ƽ�Ű �ڵ� �� �ʱ�ȭ
		InputNum = 0; // �� ��ȣ �ʱ�ȭ
		seats = new String[][] {
			{"1", "2", "3", "4"},
			{"1", "2", "3", "4"}
		};
		ReserveSeats = 0;
	}

	public BusSeats() {
		sc = new Scanner(System.in);
	}// ������ ����
	
	private void SeatsStatus(String[][] arr) { // �¼� ���� ���� �˾ƺ���
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i].length; // sum = sum + arr[i].length
		}
		System.out.println();
	}
	
	private void ResetSeats() { // ���� �ϰ� ����ϱ�
		if(ReserveSeats == 0) {
			System.out.println("����� �¼��� �����ϴ�.");
			return;
		}
		else {
			for(int i=0; i< seats.length; i++) {
				for(int j=0; j< seats[i].length; j++) {
					seats[i][j] = String.valueOf(j+1);
				}
			}
			ReserveSeats = 0;
			System.out.println("���Ÿ� ��� ����߽��ϴ�.");
		}
	}

	private void Show_Seats() { // ���� �¼� Ȯ���ϱ�
		System.out.println(" <��ӹ��� ����>");
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
	
	private void ChangeSeats() { // ���� �¼� �����ϱ�
		if(seats[InputRowsInt][InputNum - 1] != "X") {
			seats[InputRowsInt][InputNum - 1] = "X";
			System.out.println("\n@@ �¼��� �����߽��ϴ�. @@");
			ReserveSeats++;
		}
		else {
			System.out.println("\n�̹� ����� �¼��Դϴ�. �ٽ� Ȯ���Ͻʽÿ�!");
		}
	}
	
	private void CancelSeats() { // ���� �¼� ����ϱ�
		if(seats[InputRowsInt][InputNum - 1] == "X") {
			seats[InputRowsInt][InputNum - 1] = String.valueOf(InputNum);
			System.out.println("\n@@ �¼� ������ ����߽��ϴ�. @@");
			ReserveSeats--;
		}
		else {
			System.out.println("\n����� �¼��� �ƴմϴ�. �ٽ� Ȯ���Ͻʽÿ�!");
		}
	}
	
	public void Show_Menu() { // �¼� ���� ���α׷� �޴� ����
		do {
			try {
				String text = "\n======== ���� �¼� ���� ���α׷� ========";
				System.out.println(text);
							  
				System.out.println("1.�¼� Ȯ���ϱ�");
				System.out.print("2.�¼� �����ϱ�");
				SeatsStatus(seats);
				System.out.println("3.�¼� ���� ����ϱ�");
				System.out.println("4.�¼� ���� �ϰ� ����ϱ�");
				System.out.println("5.���α׷� �����ϱ�");
				
				System.out.print("�޴� ����>> ");
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
					System.out.println("���α׷��� �����մϴ�!!");
					return;
					
				default:
					System.out.println("\n @@ �ٽ� �����ϼ���!! @@ ");
				}
			}
			catch(Exception e) {
				System.out.println("\n @@ �ٽ� �����ϼ���!! @@ ");
			}
		}while(true);
	}
	
	private void DisplayMenu() throws InterruptedException { // ���� �¼� �����ϱ�
		Show_Seats();
		
		// ���� �¼� ��ġ��
		System.out.println("<\"X\"�� �̹� ����� �¼��Դϴ�.>");
		System.out.print("\n�� ����(���ĺ�)>> ");
		InputRows = sc.nextLine();
		System.out.print("�� ����(����)>> ");
		InputNum = Integer.parseInt(sc.nextLine());
	}
	
	private void InputSeats(int menu) { // ������(����) �Ǵ� ������(���) �¼� �Է��ϱ�
		try {
			if(ReserveSeats == 0 && menu == 3) {
				System.out.println("\n @@ ����� �¼��� �����ϴ�. @@");
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
				System.out.println("\n @@ �ٽ� �����ϼ���!! @@ ");
			}
		}
		catch(Exception e) {
			System.out.println("\n @@ �ٽ� �����ϼ���!! @@ ");
		}
	}
}
