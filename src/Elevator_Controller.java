import java.util.*;
public class Elevator_Controller {

	final static int personNumber =10;
	static Person[] person;
	Elevator_Operation odd = new Elevator_Operation();// Ȧ���� ���� ���������� 
	Elevator_Operation even = new Elevator_Operation();// ¦���� ���� ����������
	Elevator_Operation total = new Elevator_Operation(); // ��ü�� ����������
	
	
	public static void main(String[] args) {
		person = new Person[personNumber];

		int time =0;
		for(int i=0; i<personNumber; i++){
			person[i] = new Person();// ����� 10�� ���� ����
			System.out.println(person[i].getWeight());
		}
		while(true){
			
			
			
			time++;// �ð��� ���� ����
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void searchPerson(int time){
		int i=0;
		
		for(i=0; i<personNumber;i++){
			if(time ==person[i].getTime()){// ����� ��ư�� �����ٰ� �ν�
				
			}
		}
	}
	
	
}


	