package Cooperation01;

public class Subway {
	String lineNumber; // 지하철 노선 
	int passengerCount; // 승객 수 
	int money; // 지하철 수입 
	 
	 // 매개변수로 지하철 노선을 받는 생성자 
	 public Subway(String lineNumber) { 
	   	this.lineNumber = lineNumber; 
	 } 
	 
	 // 승객이 지하철에 탄다면 
	 public void take(int money) { 
	 	this.money = money;      // 지하철 요금 (매개변수 money)만큼 지하철 수입이 증가 
	    passengerCount++;        // 승객 수 증가 
	 } 
	 
	// 지하철 현재 정보 출력 
	public void ShowInfo() { 
	  System.out.println("지하철 " + lineNumber +"의 승객은 "+ passengerCount +"명이고, 요금은 "+ money +"원입니다."); 
	} 
}
