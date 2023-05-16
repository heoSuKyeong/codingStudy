package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

//N개의 수로 이루어진 수열 A1, A2, ..., AN이 주어진다. 또, 수와 수 사이에 끼워넣을 수 있는 N-1개의 연산자가 주어진다. 연산자는 덧셈(+), 뺄셈(-), 곱셈(×), 나눗셈(÷)으로만 이루어져 있다.
//입력예시
//2
//5 6
//0 0 1 0
public class backtracking_14888 {
	static int [] operator = new int[4];
	static int [] numArr;
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	static int n;
	
	public static void dfs(int num, int idx) {
		if (idx==n) {
			min = Math.min(min, num);
			max = Math.max(max, num);
			return;
		}
		for (int i=0; i<4; i++) {
			if(operator[i]>0) {
				operator[i]--;
				switch (i) {
				//operator 순서는 +,-,*,/
				case 0: 
					dfs(num+numArr[idx], idx+1);
					break;
				case 1: 
					dfs(num-numArr[idx], idx+1);
					break;
				case 2: 
					dfs(num*numArr[idx], idx+1);
					break;
				case 3: 
					dfs(num/numArr[idx], idx+1);
					break;
				}
				// 재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다.
				operator[i]++;
			}
		}
		
	}

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		//연산할 숫자
		numArr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			numArr[i]=Integer.parseInt(st.nextToken());
		}
		
		//연산자 배열에 넣기
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			operator[i]=Integer.parseInt(st.nextToken());
		}
		
		dfs(numArr[0], 1);
		System.out.println(max);
		System.out.println(min);

	}

}
