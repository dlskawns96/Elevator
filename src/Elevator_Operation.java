
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
}
