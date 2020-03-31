
public class E {
	public static void main(String[] args) {
		int x=10;
		int y=5;
		int z=100;
		int result=0;
		if(x>y) {
			x=z;
		}
		else {
			y=x;
		}
            z=y;
		result=x+y+z;
		System.out.println(result);
	}

}
