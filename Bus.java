package Cooperation01;

public class Bus {
	int busNumber; // 버스 번호 
	int passengerCount; // 승객 수 
	int money; // 버스 수입
	   
	// 매개변수로 버스 번호를 받는 생성자 
	public Bus(int busNumber) { 
	  this.busNumber = busNumber; 
	} 
	     
	// 승객이 버스에 탈 때 
	public void take(int money) { 
	    this.money += money;      // 버스 요금 (매개변수 money)만큼 버스 수입이 증가 
	    passengerCount++;         // 승객 수 증가 
	} 
	   
	// 버스의 현재 정보 출력 
	public void ShowInfo() {  
	  System.out.println("버스 "+ busNumber +"번의 승객은 "+ passengerCount +"명이고, 요금은 "+ money +"원입니다."); 
	} 
}
