package Cooperation01;

public class Taxi {
	int taxiNumber; // �ý� ��ȣ 
	int passengerCount; // �ý� �°� �� 
	int money; // �ý� ���� 
	  
	// �Ű������� �ý� ������ �޴� ������ 
	public Taxi(int taxiNumber) { 
	 this.taxiNumber = taxiNumber; 
	} 

	// �ýÿ� �°��� Ÿ�� 
	public void take(int money) { 
		this.money += money; // �ý� ���(�Ű����� money)��ŭ �ý� ���� ���� 
		passengerCount++; // �°� �� ���� 
	} 
	 
	// �ý� ���� ���� ��� 
	public void ShowInfo() { 
	   System.out.println("������ȣ "+ taxiNumber + "�� �°��� " + passengerCount + "���̰�, ����� " + money +"���̴�."); 
	} 
}
