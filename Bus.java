package Cooperation01;

public class Bus {
	int busNumber; // ���� ��ȣ 
	int passengerCount; // �°� �� 
	int money; // ���� ����
	   
	// �Ű������� ���� ��ȣ�� �޴� ������ 
	public Bus(int busNumber) { 
	  this.busNumber = busNumber; 
	} 
	     
	// �°��� ������ Ż �� 
	public void take(int money) { 
	    this.money += money;      // ���� ��� (�Ű����� money)��ŭ ���� ������ ���� 
	    passengerCount++;         // �°� �� ���� 
	} 
	   
	// ������ ���� ���� ��� 
	public void ShowInfo() {  
	  System.out.println("���� "+ busNumber +"���� �°��� "+ passengerCount +"���̰�, ����� "+ money +"���Դϴ�."); 
	} 
}
