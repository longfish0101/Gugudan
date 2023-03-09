import java.util.Arrays;
import java.util.Scanner;

public class Gugudan {
	public static void inputGugu() {
		Scanner input = new Scanner(System.in);
		System.out.println("입력");
		int num = input.nextInt();
		
		printGugu(calculate(num));
	}
	
	public static String[] calculate(int a) {
		String[] arrReturn = new String[a-1];
		int[] arrAdd = new int[a];
		for (int i=2; i<=a; i++) {
			for (int j=0; j<a; j++) {
				arrAdd[j] = i*(j+1);
			}
			arrReturn[i-2] = Arrays.toString(arrAdd);
		}	
			return arrReturn;
	}
	
	public static void printGugu(String[] a) {
		int len = a.length;
		for(int i=0; i<len; i++) {
			System.out.println((i+2)+"단 출력");
			System.out.println(a[i]);
		}
	}
}
