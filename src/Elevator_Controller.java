import java.util.*;
public class Elevator_Controller {

	final static int personNumber =10;
	static Person[] person;
<<<<<<< HEAD
	Elevator_Operation odd = new Elevator_Operation();// Ȧ���� ���� ���������� 
	Elevator_Operation even = new Elevator_Operation();// ¦���� ���� ����������
	Elevator_Operation total = new Elevator_Operation(); // ��ü�� ����������
	
=======
	static Elevator_Operation odd = new Elevator_Operation();// Ȧ���� ���� ���������� 
	static Elevator_Operation even = new Elevator_Operation();// ¦���� ���� ����������
	static Elevator_Operation total = new Elevator_Operation(); // ��ü�� ����������
	static Person[] oddArr = new Person[personNumber];
	static Person[] evenArr = new Person[personNumber];
	static Person[] totalArr = new Person[personNumber];

	// Boarding�� ����� ���� Elevator_Opration�� �ִ� request()�� ���� Person��ü �Ѱ��ֱ�
	// Run() ����� - odd, even, total �� ��� ������������ run()�� �ҷ����� ����
>>>>>>> origin/master
	
	public static void main(String[] args) {
		person = new Person[personNumber];

		ElevatorGUI gui = new ElevatorGUI();
		gui.run();
		gui.setElevator(1, 3);
		gui.setElevator(2, 5);
		
		int time =0;
		for(int i=0; i<personNumber; i++){
			person[i] = new Person();// ����� 10�� ���� ����
<<<<<<< HEAD
=======
			oddArr[i] = null;
			evenArr[i] = null;
			totalArr[i] = null;
>>>>>>> origin/master
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
<<<<<<< HEAD
				
			}
		}
=======
				allocateElevator(person[i]);
			}
		}
	}
	public static void allocateElevator(Person man){// man���� ����ȭ�� elevator�� �Ҵ�����ش�.
		if(man.getTotal() == true){// ������ ���� ���� �ִ� ���� �޶� total elevator�� �̿��ؾ� �ϴ� ���
		}
		else if(man.getEvenDown() == true || man.getEvenUp() == true){
			// ¦�� ��
			if(man.getEvenDown() == true){
				// ¦�� �Ʒ���
				
			}
			else{
				// ¦�� ����
			}
		}
		else if(man.getOddDown() == true || man.getOddUp() == true){
			// ¦����
			if(man.getOddDown() == true){
				// Ȧ�� �Ʒ���
			}
			else{
				//Ȧ�� ����
			}
		}
		
	}
	public static void sortingArr(){
		
>>>>>>> origin/master
	}
	
	
}


	