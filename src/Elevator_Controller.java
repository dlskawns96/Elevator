import java.util.*;
public class Elevator_Controller {

	final static int personNumber =10;
	static Person[] person;
	Elevator_Operation odd = new Elevator_Operation();// Ȧ���� ���� ���������� 
	Elevator_Operation even = new Elevator_Operation();// ¦���� ���� ����������
	Elevator_Operation total = new Elevator_Operation(); // ��ü�� ����������
	static Person[] oddArr = new Person[personNumber];
	static Person[] evenArr = new Person[personNumber];
	static Person[] totalArr = new Person[personNumber];
	
	public static void main(String[] args) {
		person = new Person[personNumber];

		int time =0;
		for(int i=0; i<personNumber; i++){
			person[i] = new Person();// ����� 10�� ���� ����
			oddArr[i] = null;
			evenArr[i] = null;
			System.out.println(person[i].getWeight());
		}
		while(true){
			
			
			
			time++;// �ð��� ���� ����
			
			searchPerson(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void searchPerson(int time){
		int i=0;
		
		for(i=0; i<personNumber;i++){
			if(time ==person[i].getTime()){// ����� ��ư�� �����ٰ� �ν�
				allocateElevator(person[i]);
			}
		}
	}
	public static void allocateElevator(Person man){// man���� ����ȭ�� elevator�� �Ҵ�����ش�.
		if(man.getTotal() == true){// ������ ���� ���� �ִ� ���� �޶� total elevator�� �̿��ؾ� �ϴ� ���
			
		}
		else if(man.getEvenDown() == true || man.getEvenUp() == true){
			// Ȧ�� ��
			if(man.getEvenDown() == true){
				// Ȧ�� �Ʒ���
			}
			else{
				
			}
		}
		else if(man.getOddDown() == true || man.getOddUp() == true){
			// ¦����
			
		}
		
	}
	public static void sortingArr(){
		
	}
}


	