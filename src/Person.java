import java.util.Random;

public class Person {
	private int startF =0;
	private int depF =0;
	private int weight =0;
	private boolean evenUp = false;// ������ �������� ¦�� �� ��ư
	private boolean evenDown = false;// ¦�� �Ʒ� ��ư
	private boolean oddUp = false;//Ȧ�� ���� ��ư 
	private boolean oddDown = false;//Ȧ�� �Ʒ� ��ư
	private boolean useTotal = false;// ��ü������ �ؾߵǴ°�.
	
	private boolean isArrival = false;// ���ϴ����� ���°�
	private boolean isBoarding = false;// ž�»���
	
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
	
	public int makeWeight(){// weight���� ���� ������ �����.
		int tmp =0;
		tmp = random.nextInt(20)+50;// 50 ~ 70
		return tmp;
	}
	public int makeFloor(){// ��ü�������� ������ ���� �������� �����.
		int tmp =0;
		tmp = random.nextInt(10) +1;
		
		return tmp;
	}
	
	public void makeBoolean(){// ������ ��ư�� �ʱ�ȭ ���ش�.
		if((depF %2)==1){ // �������� Ȧ���� 
			if(depF - startF >0){// ����
				oddUp = true;
			}
			else{
				oddDown = true;
			}
		}
		else{// ������ ¦����
			if(depF - startF >0){// ����
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
