package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Bac2751_sort {
		static int num;
		static int[] arr;
//		static Integer[] arr;
 		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		num = Integer.parseInt(br.readLine());
		arr = new int[num];
//		arr = new Integer[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
//		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int n : arr) {
			bw.write(n + "\n");
		}
		bw.close();
	}

}
