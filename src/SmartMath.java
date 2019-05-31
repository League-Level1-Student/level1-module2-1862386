
public class SmartMath {
	public static void main(String[] args) {
		System.out.println(cos((float) 1.57, 5));
	}
public static float sin(float x, int n ) {
	float total = 0;
	float temp = 0;
	for(int i =0; i<n+1; i++) {
	temp= (float) (Math.pow(-1, i)*Math.pow(x, 2*i+1)/factorial(2*i+1));
	total+=temp;
	
	}
	return total;
	
	
	
	
}
public static float factorial(int n) {
	float total = 1;
	for(int i = 1; i<n+1; i++) {
	total*=i;
	
	}
	return total;
		
}
public static float cos(float x, int n ) {
	float total = 0;
	float temp = 0;
	for(int i =0; i<n+1; i++) {
	temp= (float) (Math.pow(-1, i)*Math.pow(x, 2*i)/factorial(2*i));
	total+=temp;
	
	}
	return total;
	
	
	
	
}




}
