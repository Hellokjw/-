package Cooperation01;

// �з�: ��ü �� ����, ������� ��������
// ���� ����)
// �л��� �б��� ���� ���� �����ϴ� ���� ������ ��ü ���� ���α׷����� �����
// �� ���������� �л��� ����, ����ö, �ýø� Ÿ�� ���� ���� ��ü ���� ���α׷���!!

public class Transport {
	public static void main(String[] args) {
		// �л� 3�� ���� 
	    Student student1 = new Student("������", 10000); 
	    Student student2 = new Student("������", 9000); 
	    Student student3 = new Student("�����", 11000); 
	    
		Bus bus401 = new Bus(401);    // �뼱 ��ȣ�� 401�� ���� ���� 
		student1.takeBus(bus401); // �������� 401�� ������ Ž 
		bus401.ShowInfo();            // bus�� ���� ��� 
		student1.ShowInfo();      // �������� ���� ��� 
		System.out.println();
	
		Subway subwayL1 = new Subway("1ȣ��");  // �뼱 ��ȣ�� 1ȣ���� ����ö ���� 
		student2.takeSubway(subwayL1);     // �������� 2ȣ���� Ž 
		subwayL1.ShowInfo(); // subway�� ���� ��� 
		student2.ShowInfo();                  // �������� ���� ��� 
		System.out.println();
		
		Taxi taxi4212 = new Taxi(4212); // �ý� ��ȣ�� 4212�� �ý� ���� 
		student3.takeTaxi(taxi4212); // ������� 4212�� �ýø� Ž 
		taxi4212.ShowInfo(); // taxi�� ���� ��� 
		student3.ShowInfo(); // ������� ���� ��� 
		System.out.println();
	}
}
