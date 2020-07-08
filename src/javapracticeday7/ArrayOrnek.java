package javapracticeday7;

import java.util.Arrays;

public class ArrayOrnek {

	public static void main(String[] args) {
		/*
		 * String array i olusturun ve sirasiyla "1,2,3,7,8"
		 * degerlerini atayiniz ve yazdirin
		 * 
		 */

		int arr[] = {1,2,3,7,8,13,5,26};
		Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	}

}
