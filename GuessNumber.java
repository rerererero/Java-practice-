//��While��if-elseʵ�ֲ����֡�6�ν�ֹ��
import java.util.*;
public class GuessNumber {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Random random=new Random();
		System.out.println("��������²����");
		int youGuess=0;int times=1;
		int realNumber=random.nextInt(100)+1;
		youGuess=reader.nextInt();
		while(youGuess!=realNumber){
			if(youGuess>realNumber) {
				System.out.println("������ִ��ˣ�������²�");
				youGuess=reader.nextInt();
				times++;
				System.out.println("�㻹��"+(6-times)+"�λ��ᣡ");
			}
			else if(youGuess<realNumber) {
				System.out.println("�������С�ˣ�������²�");
				youGuess=reader.nextInt();
				times++;
				System.out.println("�㻹��"+(6-times)+"�λ��ᣡ");
			}
		}
		System.out.println("����ˣ�");
	}

}
