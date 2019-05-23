import java.util.*;
public class First{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//输入姓名  会员卡号四位，分别输出各位数上的数字，并求和。如果等于随机出现的数字为中奖
		
		System.out.println("请输入用户姓名：");
		String name=input.next();
		System.out.println("四位数的会员卡号：");
		int num=input.nextInt();
		System.out.println("四位数的会员卡号："+num);

	}
}