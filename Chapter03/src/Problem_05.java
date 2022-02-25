import java.util.Scanner;

public class Problem_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int type, data = 0;
		String str;

		System.out.printf("입력 진수 결정 <1>10 <2>16 <3>8 : ");
		type = s.nextInt();

		System.out.printf("값 입력 : ");

		if (type == 1) {
			str = s.next();
			data = Integer.parseInt(str, 10);
		}

		if (type == 2) {
			str = s.next();
			data = Integer.parseInt(str, 16);
		}

		if (type == 3) {
			str = s.next();
			data = Integer.parseInt(str, 8);
		}

		System.out.printf("10잔수 ==> %d \n", data);
		System.out.printf("16잔수 ==> %X \n", data);
		System.out.printf("8잔수 ==> %o \n", data);
	}
}