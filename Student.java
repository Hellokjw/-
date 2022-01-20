package Cooperation01;

//분류: 객체 간 협력, 교통수단 예제문제
public class Student {
	public String studentName; // 학생 이름 
  	public int money;          // 가진 돈 
  	
  	// 매개변수로 학생이름, 가진 돈을 받는 생성자 
    public Student(String studentName, int money) {       
      this.studentName = studentName; 
      this.money = money; 
    } 

    // 버스를 탄다  
  	public void takeBus(Bus bus) { 
  	   bus.take(1200);  
  	   this.money -= 1200; // 버스요금 1200원을 지불 
    } 
  	
  	// 지하철을 탄다 
    public void takeSubway(Subway subway) { 
		subway.take(1300); 
		this.money -= 1300;  // 지하철 요금 1300원을 지불 
    } 
    
	//택시를 탄다 
	public void takeTaxi(Taxi taxi) { 
		taxi.take(3000); 
		this.money -= 3000;  // 택시 요금 3000원 지불 
	} 

	//학생의 현재 정보를 출력하는 메서드 
	public void ShowInfo() { 
		System.out.println(studentName + "님의 남은 돈은 "+money+"원입니다."); 
	}
}
