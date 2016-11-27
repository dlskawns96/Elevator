import java.util.*;
public class Elevator_Controller {

	final static int personNumber =10;
	static Person[] person;
	Elevator_Operation odd = new Elevator_Operation();
	Elevator_Operation even = new Elevator_Operation();
	Elevator_Operation total = new Elevator_Operation();

	public static void main(String[] args) {
		person = new Person[10];

		int time =0;
		for(int i=0; i<personNumber; i++){
			person[i] = new Person();
			System.out.println(person[i].getWeight());
		}
	}
	

}
