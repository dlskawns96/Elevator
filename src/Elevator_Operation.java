
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
    private boolean isWork;
    
    
    public Elevator_Operation(){
    	int i;
    	current_floor = 1;
    	current_weight = 0;
    	max_weight = 1000;
    	goingUp = true;
    	dest = 1;
    	stopping = true;
    	isWork = false;
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
	
	public boolean getisWork(){
		return isWork;
	}
    
    public void up(){ //���������Ͱ� �ö� �� ����
    	if(current_floor < dest && stopping == false){ // ���� ������ �������� �������� �ʰ� �����̰� �ִٸ�...����˴ϴ�...
    		//��� ������� ������ �������� ������ �ö󰡱� �����մϴ�...
    		current_floor = current_floor + 1;
    	}
    	else{
    		//���� ����⿡ �ö������....�������� ������...
    		goingUp = false;
    	}
    }
    
    public void down(){ //���������Ͱ� ������ �� ����
    	if(current_floor > dest && stopping == false){// ���� ������ �������� �������� �ʰ� �����̰� �ִٸ�...����˴ϴ�...
    		//��� ������� �������� ������ �������� �����մϴ�.
    		current_floor = current_floor - 1;
    	}
    	else{
       		//���� �عٴ��� �������...�ö󰡾߰�����...
    		goingUp = true;
    	}
    }
    
    public void check_arrive(){
    	if(stop[current_floor - 1]){
    		stopping = true;
    		stop[current_floor - 1] = false;
    	}
    }
    
    public void departure(){ // isArrive�� �Ϸ���״ٸ�...�̰��� �̿��Ͽ�...�߿��!
    	stopping = false;
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
    
    public void minum_weight(int person_weight){ // ������ ��� �����Ը� ���־�...���������Ϳ��� ������ �ϴ� ���Դϴ�...
    	current_weight = current_weight - person_weight;
    }
}