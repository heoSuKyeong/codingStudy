package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO_10952 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
//		int A, B;
		
		//방법 1
//		do {
//			st = new StringTokenizer(br.readLine());
//			A = Integer.parseInt(st.nextToken());
//			B = Integer.parseInt(st.nextToken());
//			if (A>0 && B>0) sb.append(A+B).append("\n");
//			
//		} while (A!=0 && B!=0);
		
		//방법 2
		while (true) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) break;
			sb.append(A+B).append("\n");
		}
		
		System.out.println(sb);

	}

}
