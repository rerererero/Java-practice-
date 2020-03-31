//用While、if-else实现猜数字。6次截止。
import java.util.*;
public class GuessNumber {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Random random=new Random();
		System.out.println("请输入你猜测的数");
		int youGuess=0;int times=1;
		int realNumber=random.nextInt(100)+1;
		youGuess=reader.nextInt();
		while(youGuess!=realNumber){
			if(youGuess>realNumber) {
				System.out.println("你的数字大了，请继续猜测");
				youGuess=reader.nextInt();
				times++;
				System.out.println("你还有"+(6-times)+"次机会！");
			}
			else if(youGuess<realNumber) {
				System.out.println("你的数字小了，请继续猜测");
				youGuess=reader.nextInt();
				times++;
				System.out.println("你还有"+(6-times)+"次机会！");
			}
		}
		System.out.println("答对了！");
	}

}
