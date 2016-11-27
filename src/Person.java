import java.util.Random;

public class Person {
	private int startF =0;
	private int depF =0;
	private int weight =0;
	private boolean evenUp = false;
	private boolean evenDown = false;
	private boolean oddUp = false;
	private boolean oddDown = false;
	
	private boolean isArrival = false;// ¿øÇÏ´ÂÃþ¿¡ °¬´Â°¡
	private boolean isBoarding = false;// Å¾½Â»óÅÂ
	
	final static int max =10;// 1~ 10
	
	Random random = new Random();

	public Person(){

		while(true){

			startF =makeFloor();
			depF =makeFloor();
			
			if(startF != depF)
				break;
			
		}
	
		weight = makeWeight();
		
		isArrival = false;
		isBoarding = false;
		
		evenUp = false;
		evenDown = false;
		oddUp = false;
		oddDown = false;
		
	}
	
	private int makeWeight(){
		int tmp =0;
		tmp = random.nextInt(20)+50;
		return tmp;
	}
	private int makeFloor(){
		int tmp =0;
		tmp = random.nextInt(10) +1;
		
		return tmp;
	}
	
	
	
}
