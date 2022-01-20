package Cooperation01;

//�з�: ��ü �� ����, ������� ��������
public class Student {
	public String studentName; // �л� �̸� 
  	public int money;          // ���� �� 
  	
  	// �Ű������� �л��̸�, ���� ���� �޴� ������ 
    public Student(String studentName, int money) {       
      this.studentName = studentName; 
      this.money = money; 
    } 

    // ������ ź��  
  	public void takeBus(Bus bus) { 
  	   bus.take(1200);  
  	   this.money -= 1200; // ������� 1200���� ���� 
    } 
  	
  	// ����ö�� ź�� 
    public void takeSubway(Subway subway) { 
		subway.take(1300); 
		this.money -= 1300;  // ����ö ��� 1300���� ���� 
    } 
    
	//�ýø� ź�� 
	public void takeTaxi(Taxi taxi) { 
		taxi.take(3000); 
		this.money -= 3000;  // �ý� ��� 3000�� ���� 
	} 

	//�л��� ���� ������ ����ϴ� �޼��� 
	public void ShowInfo() { 
		System.out.println(studentName + "���� ���� ���� "+money+"���Դϴ�."); 
	}
}
