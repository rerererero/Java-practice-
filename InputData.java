import java.util.*;
public class InputData {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入数量：");
		double amout=reader.nextDouble();
		System.out.println("请输入价格：");
		double prince=reader.nextDouble();
		double sum=amout*prince;
		System.out.println("总数价格为："+sum);
	}

}
