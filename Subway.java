package Cooperation01;

public class Subway {
	String lineNumber; // ����ö �뼱 
	int passengerCount; // �°� �� 
	int money; // ����ö ���� 
	 
	 // �Ű������� ����ö �뼱�� �޴� ������ 
	 public Subway(String lineNumber) { 
	   	this.lineNumber = lineNumber; 
	 } 
	 
	 // �°��� ����ö�� ź�ٸ� 
	 public void take(int money) { 
	 	this.money = money;      // ����ö ��� (�Ű����� money)��ŭ ����ö ������ ���� 
	    passengerCount++;        // �°� �� ���� 
	 } 
	 
	// ����ö ���� ���� ��� 
	public void ShowInfo() { 
	  System.out.println("����ö " + lineNumber +"�� �°��� "+ passengerCount +"���̰�, ����� "+ money +"���Դϴ�."); 
	} 
}
