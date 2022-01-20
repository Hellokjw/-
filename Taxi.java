package Cooperation01;

public class Taxi {
	int taxiNumber; // 택시 번호 
	int passengerCount; // 택시 승객 수 
	int money; // 택시 수입 
	  
	// 매개변수로 택시 변수를 받는 생성자 
	public Taxi(int taxiNumber) { 
	 this.taxiNumber = taxiNumber; 
	} 

	// 택시에 승객이 타면 
	public void take(int money) { 
		this.money += money; // 택시 요금(매개변수 money)만큼 택시 수입 증가 
		passengerCount++; // 승객 수 증가 
	} 
	 
	// 택시 현재 정보 출력 
	public void ShowInfo() { 
	   System.out.println("차량번호 "+ taxiNumber + "의 승객은 " + passengerCount + "명이고, 요금은 " + money +"원이다."); 
	} 
}
