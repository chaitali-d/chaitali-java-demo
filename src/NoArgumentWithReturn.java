
public class NoArgumentWithReturn {
	static int i;
	
	
	public static void main(String[] args) {
		NoArgumentWithReturn.i=NoArgumentWithReturn.initialize();
		System.out.println(NoArgumentWithReturn.i);
		
	}
	
	static int initialize() {
		
		System.out.println(NoArgumentWithReturn.i);
		return 100;
		
	}

}
