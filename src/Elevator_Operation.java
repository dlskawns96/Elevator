
public class Elevator_Operation {
	private static int top = 10;
    private static int bottom = 1;
	private int current_floor;
    private int current_weight;
    private int max_weight;
    private int dest;
    private boolean goingUp;
    
    public Elevator_Operation(){
    	current_floor = 1;
    	current_weight = 0;
    	max_weight = 1000;
    	goingUp = true;
    	dest = 1;
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
}
