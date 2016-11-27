import java.util.*;
public class Elevator_Controller {

	final static int personNumber =10;
	Person[] person;
	Elevator_Operation odd = new Elevator_Operation();
	Elevator_Operation even = new Elevator_Operation();
	Elevator_Operation total = new Elevator_Operation();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public Elevator_Controller(){
		for(int i=0; i<personNumber; i++){
			person[i] = new Person();
		}
	}

}
