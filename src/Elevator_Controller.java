import java.util.*;
public class Elevator_Controller {

	final static int personNumber =10;
	static Person[] person;
	static Elevator_Operation odd = new Elevator_Operation();// 홀수층 전용 엘리베이터 
	static Elevator_Operation even = new Elevator_Operation();// 짝수층 전용 엘리베이터
	static Elevator_Operation total = new Elevator_Operation(); // 전체층 엘리베이터
	static Person[] oddArr = new Person[personNumber];
	static Person[] evenArr = new Person[personNumber];
	static Person[] totalArr = new Person[personNumber];
	
	public static void main(String[] args) {
		person = new Person[personNumber];

		int time =0;
		for(int i=0; i<personNumber; i++){
			person[i] = new Person();// 사람들 10명 먼저 생성
			oddArr[i] = null;
			evenArr[i] = null;
			totalArr[i] = null;
			System.out.println(person[i].getWeight());
		}
		while(true){
			
			
			
			time++;// 시간에 따른 생성
			
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
			if(time ==person[i].getTime()){// 사람이 버튼을 누른다고 인식
				allocateElevator(person[i]);
			}
		}
	}
	public static void allocateElevator(Person man){// man에게 최적화된 elevator를 할당시켜준다.
		if(man.getTotal() == true){// 가려는 층과 현재 있는 층이 달라서 total elevator만 이용해야 하는 경우
			while(total.getCurrentFloor() != man.getStart()){
				if(total.getCurrentFloor() < man.getStart())
					total.up();
				else
					total.down();
			}
		}
		else if(man.getEvenDown() == true || man.getEvenUp() == true){
			// 짝수 층
			if(man.getEvenDown() == true){
				// 짝수 아래로
			}
			else{
				// 짝수 위로
			}
		}
		else if(man.getOddDown() == true || man.getOddUp() == true){
			// 짝수층
			if(man.getOddDown() == true){
				// 홀수 아래로
			}
			else{
				//홀수 위로
			}
		}
		
	}
	public static void sortingArr(){
		
	}
}


	