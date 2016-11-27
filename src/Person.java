import java.util.Random;

public class Person {
	private int startF =0;
	private int depF =0;
	private int weight =0;
	private boolean evenUp = false;// ¸ñÀûÁö ±âÁØ
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
		makeBoolean();
		
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
	
	private void makeBoolean(){
		if((depF %2)==1){ // ¸ñÀûÁö°¡ È¦¼öÃþ 
			if(depF - startF >0){// À§·Î
				oddUp = true;
			}
			else{
				oddDown = true;
			}
		}
		else{// ¸ñÀûÁö Â¦¼öÃþ
			if(depF - startF >0){// À§·Î
				evenUp = true;
			}
			else{
				evenDown = true;
			}
		}
	}
	
}
