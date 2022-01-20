package Cooperation01;

// 분류: 객체 간 협력, 교통수단 예제문제
// 문제 설명)
// 학생이 학교에 가기 위해 수행하는 여러 과정을 객체 지향 프로그램으로 만들기
// 이 예제에서는 학생이 버스, 지하철, 택시를 타고 가는 것을 객체 지향 프로그래밍!!

public class Transport {
	public static void main(String[] args) {
		// 학생 3명 생성 
	    Student student1 = new Student("김일현", 10000); 
	    Student student2 = new Student("김이현", 9000); 
	    Student student3 = new Student("김삼현", 11000); 
	    
		Bus bus401 = new Bus(401);    // 노선 번호가 401인 버스 생성 
		student1.takeBus(bus401); // 김일현이 401번 버스를 탐 
		bus401.ShowInfo();            // bus의 정보 출력 
		student1.ShowInfo();      // 김일현의 정보 출력 
		System.out.println();
	
		Subway subwayL1 = new Subway("1호선");  // 노선 번호가 1호선인 지하철 생성 
		student2.takeSubway(subwayL1);     // 김이현이 2호선을 탐 
		subwayL1.ShowInfo(); // subway의 정보 출력 
		student2.ShowInfo();                  // 김이현의 정보 출력 
		System.out.println();
		
		Taxi taxi4212 = new Taxi(4212); // 택시 번호가 4212인 택시 생성 
		student3.takeTaxi(taxi4212); // 김삼현이 4212번 택시를 탐 
		taxi4212.ShowInfo(); // taxi의 정보 출력 
		student3.ShowInfo(); // 김삼현의 정보 출력 
		System.out.println();
	}
}
