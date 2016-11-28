import java.util.Random;

public class Person {
	private int startF =0;
	private int depF =0;
	private int weight =0;
	private boolean evenUp = false;// 가려는 목적지가 짝수 위 버튼
	private boolean evenDown = false;// 짝수 아래 버튼
	private boolean oddUp = false;//홀수 위로 버튼 
	private boolean oddDown = false;//홀수 아래 버튼
	private boolean useTotal = false;// 전체층수를 해야되는가.
	
	private boolean isArrival = false;// 원하는층에 갔는가
	private boolean isBoarding = false;// 탑승상태
	
	private int startTime =0;
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
		startTime =0;
		
		evenUp = false;
		evenDown = false;
		oddUp = false;
		oddDown = false;
		useTotal = false;
		makeBoolean();
		
	}
	
	public int makeWeight(){// weight값을 랜덤 값으로 만든다.
		int tmp =0;
		tmp = random.nextInt(20)+50;// 50 ~ 70
		return tmp;
	}
	public int makeFloor(){// 전체층수에서 가려는 층을 랜덤으로 만든다.
		int tmp =0;
		tmp = random.nextInt(10) +1;
		
		return tmp;
	}
	
	public void makeBoolean(){// 누르는 버튼을 초기화 ㅎ준다.
		if((depF %2)==1){ // 목적지가 홀수층 
			if(depF - startF >0){// 위로
				oddUp = true;
			}
			else{
				oddDown = true;
			}
		}
		else{// 목적지 짝수층
			if(depF - startF >0){// 위로
				evenUp = true;
			}
			else{
				evenDown = true;
			}
		}
		
		if((depF - startF)%2 == 1){
			useTotal = true;
		}
	}
	public int getTime(){
		return startTime;
	}
	public int getWeight(){
		return weight;
	}
	public int getStart(){
		return startF;
	}
	public int getDep(){
		return depF;
	}
	public int makeTime(){
		int tmp=0;
		tmp = random.nextInt(60);
		
		return tmp;
	}
	public boolean getEvenDown(){
		return evenDown;
	}
	public boolean getEvenUp(){
		return evenDown;
	}
	public boolean getOddDown(){
		return oddDown;
	}
	public boolean getOddUp(){
		return oddUp;
	}
	public boolean getTotal(){
		return useTotal;
	}
	
}
