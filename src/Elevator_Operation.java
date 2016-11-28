
public class Elevator_Operation {
	private static int top = 10;
    private static int bottom = 1;
	private int current_floor;
    private int current_weight;
    private int max_weight;
    private int dest;
    private boolean[] stop = new boolean[10];
    private boolean goingUp;
    
    
    public Elevator_Operation(){
    	int i;
    	current_floor = 1;
    	current_weight = 0;
    	max_weight = 1000;
    	goingUp = true;
    	dest = 1;
    	for(i = 0; i < top; i++)
    		stop[i] = false;
    }

	public int getDest() {
		return dest;
	}

	public void setDest(int dest) { // 목적지를 받아주는 Setter method
		this.dest = dest;
	}
    
    public void up(){ //엘리베이터가 올라갈 때 실행
    	if(current_floor < dest){
    		//모든 사람들은 본인의 목적지를 가지고 올라가기 시작합니다...
    		current_floor = current_floor + 1;
    	}
    	else{
    		//문을 열고 사람들이 나가기 시작합니다...
    		//또한 꼭대기에 올라왔으니....내려가야 겠지요...
    		goingUp = false;
    	}
    }
    
    public void down(){ //엘리베이터가 내려갈 때 실행
    	if(current_floor > dest){
    		//모든 사람들이 목적지를 가지고 내려가기 시작합니다.
    		current_floor = current_floor - 1;
    	}
    	else{
    		//문을 열고 사람들이 나가기 시작합니다...
    		//또한 밑바닥을 찍었으니...올라가야겠지요...
    		goingUp = true;
    	}
    }
    
    public boolean boarding(int person_weight, int person_dest){ // 사람들이 탈수있는지 보는 것 입니다.
    	if(current_weight + person_weight <= max_weight){ // 만약 몸무게가 허용가능하다면 탈 수 있겠지요...
    		current_weight = current_weight + person_weight; // 몸무게를 업데이트 해줍니다.
    		stop[person_dest - 1] = true; // 그 사람이 내릴 곳을 체크해줍니다.
    		if(goingUp == true && person_dest > dest){ // 방향이 같고 방금 탄 사람의 목적지가 제일 높으면 업데이트 해줍니다.
    			dest = person_dest;
    		}
    		else if(goingUp == false && person_dest < dest){ // 위와 같이 이건 목적지가 제일 낮으면 업데이트 하는 것.
    			dest = person_dest;
    		}
    		return true; // 탔음을 알립니다.
    	}
    	else{
    		return false; // 몸무게 때매 못탔어요.
    	}
    }
}
