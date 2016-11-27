
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

	public void setDest(int dest) { // �������� �޾��ִ� Setter method
		this.dest = dest;
	}
    
    public void up(){ //���������Ͱ� �ö� �� ����
    	if(current_floor < dest){
    		//��� ������� ������ �������� ������ �ö󰡱� �����մϴ�...
    		current_floor = current_floor + 1;
    	}
    	else{
    		//���� ���� ������� ������ �����մϴ�...
    		//���� ����⿡ �ö������....�������� ������...
    		goingUp = false;
    	}
    }
    
    public void down(){ //���������Ͱ� ������ �� ����
    	if(current_floor > dest){
    		//��� ������� �������� ������ �������� �����մϴ�.
    		current_floor = current_floor - 1;
    	}
    	else{
    		//���� ���� ������� ������ �����մϴ�...
    		//���� �عٴ��� �������...�ö󰡾߰�����...
    		goingUp = true;
    	}
    }
    
    public boolean boarding(int person_weight, int person_dest){
    	if(current_weight + person_weight <= max_weight){
    		current_weight = current_weight + person_weight;
    		stop[person_dest - 1] = true;
    		if(goingUp == true && person_dest > dest){
    			dest = person_dest;
    		}
    		else if(goingUp == false && person_dest < dest){
    			dest = person_dest;
    		}
    		return true;
    	}
    	else{
    		return false;
    	}
    }
}
