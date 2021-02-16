package tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back9372_tree {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String s = br.readLine();

			StringTokenizer st = new StringTokenizer(s);
			int country = Integer.parseInt(st.nextToken());
			int plane = Integer.parseInt(st.nextToken());
			for (int j = 0; j < plane; j++) {
				String s1 = br.readLine();

				StringTokenizer st1 = new StringTokenizer(s1);
				int a = Integer.parseInt(st1.nextToken());
				int b = Integer.parseInt(st1.nextToken());
			}
			// 스페닝 트리
			System.out.println(country - 1);
		}

		br.close();

	}

}
