package nobleinteger;

import java.util.Scanner;

public class NobleInteger {
	
	public static int nobleInteger(int array[],int size) {
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int count = 0;
		for(int i=0;i<size;i++) {
			if(array[i]==size-1-i) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int results = nobleInteger(array,n);
		System.out.println(results);
	}

}
