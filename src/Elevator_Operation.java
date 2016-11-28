
public class Elevator_Operation {
	private static int top = 10;
    private static int bottom = 1;
	private int current_floor;
    private int current_weight;
    private int max_weight;
    private int dest;
    private boolean[] stop = new boolean[10];
    private boolean goingUp;// ��ü���� ���⼺
    private boolean stopping;
    
    
    public Elevator_Operation(){
    	int i;
    	current_floor = 1;
    	current_weight = 0;
    	max_weight = 1000;
    	goingUp = true;
    	dest = 1;
    	stopping = true;
    	for(i = 0; i < top; i++)
    		stop[i] = false;
    }

	public int getDest() {
		return dest;
	}

	public void setDest(int dest) { // �������� �޾��ִ� Setter method
		this.dest = dest;
	}
	
	public boolean getStopping(){
		return stopping;
	}
	
	public boolean getGoingUp(){
		return goingUp;
	}
	
	public int getCurrentFloor(){
		return current_floor;
	}
    
    public void up(){ //���������Ͱ� �ö� �� ����
    	if(current_floor < dest && stopping == false){ // ���� ������ �������� �������� �ʰ� �����̰� �ִٸ�...����˴ϴ�...
    		//��� ������� ������ �������� ������ �ö󰡱� �����մϴ�...
    		current_floor = current_floor + 1;
    		if(stop[current_floor - 1]){ // ����� �ϴ� �������� ����߰�����...
    			stopping = true; // ��~�����
    			stop[current_floor - 1] = false;
    		}
    	}
    	else{
    		//���� ���� ������� ������ �����մϴ�...
    		//���� ����⿡ �ö������....�������� ������...
    		goingUp = false;
    	}
    }
    
    public void down(){ //���������Ͱ� ������ �� ����
    	if(current_floor > dest && stopping == false){// ���� ������ �������� �������� �ʰ� �����̰� �ִٸ�...����˴ϴ�...
    		//��� ������� �������� ������ �������� �����մϴ�.
    		current_floor = current_floor - 1;
    		if(stop[current_floor - 1]){ // ����� �ϴ� �������� ����߰�����...
    			stopping = true; // ��~�����
    			stop[current_floor - 1] = false;
    		}
    	}
    	else{
    		//���� ���� ������� ������ �����մϴ�...
    		//���� �عٴ��� �������...�ö󰡾߰�����...
    		goingUp = true;
    	}
    }
    
    public boolean boarding(int person_weight, int person_dest){ // ������� Ż���ִ��� ���� �� �Դϴ�.
    	if(current_weight + person_weight <= max_weight){ // ���� �����԰� ��밡���ϴٸ� Ż �� �ְ�����...
    		current_weight = current_weight + person_weight; // �����Ը� ������Ʈ ���ݴϴ�.
    		stop[person_dest - 1] = true; // �� ����� ���� ���� üũ���ݴϴ�.
    		if(goingUp == true && person_dest > dest){ // ������ ���� ��� ź ����� �������� ���� ������ ������Ʈ ���ݴϴ�.
    			dest = person_dest;
    		}
    		else if(goingUp == false && person_dest < dest){ // ���� ���� �̰� �������� ���� ������ ������Ʈ �ϴ� ��.
    			dest = person_dest;  
    		}
    		return true; // ������ �˸��ϴ�.
    	}
    	else{
    		return false; // ������ ���� �������.
    	}
    }
    
    public void departure(){ // isArrive�� �Ϸ���״ٸ�...�̰��� �̿��Ͽ�...�߿��!
    	stopping = false;
    }
    
    public void minum_weight(int person_weight){ // ������ ��� �����Ը� ���־�...���������Ϳ��� ������ �ϴ� ���Դϴ�...
    	current_weight = current_weight - person_weight;
    }
    
   /* public int estimate_time(in request_floor, boolean goUp){
    	int time = 0;
    	
    	if(goUp == true && goingUp == true && current_floor < request_floor){
    		time = request_floor - current_floor;
    		for(int i = current_floor; i < request_floor; i++){
    			if(stop[i - 1] == true)
    				time++;
    		}
    		return time;
    	}
    	else if(goUp == true && goingUp == true && current_floor > request_floor){
    		time = top - current_floor;
    		for(int i = current_floor; i < top; i++){
    			if(stop[i-1] == true)
    				time++;
    		}
    		time = time + top - request_floor;
    	}
    }*/
}