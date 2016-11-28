import java.util.*;
public class Elevator_Controller {

	final static int personNumber =10;
	static Person[] person;
	Elevator_Operation odd = new Elevator_Operation();// 홀수층 전용 엘리베이터 
	Elevator_Operation even = new Elevator_Operation();// 짝수층 전용 엘리베이터
	Elevator_Operation total = new Elevator_Operation(); // 전체층 엘리베이터
	
	
	public static void main(String[] args) {
		person = new Person[personNumber];

		int time =0;
		for(int i=0; i<personNumber; i++){
			person[i] = new Person();// 사람들 10명 먼저 생성
			System.out.println(person[i].getWeight());
		}
		while(true){
			
			
			
			time++;// 시간에 따른 생성
			
			
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
			if(time ==person[i].getTime()){// 사람이 버튼을 누른다고 인식
				
			}
		}
	}
	
	
}


	