package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

public class backtracking_15649 {
	static int n, m;
	static int arr[];
	static boolean visited[];
	static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int depth) {
		if (depth==m) {
			for (int i: arr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
		}
		for (int i=0; i<n ;i++) {
			if(!visited[i]) {
				visited[i]=true;
				arr[depth]=i+1;
				dfs(depth+1);
				visited[i]=false;
			}
		}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visited = new boolean[n];
		
		dfs(0);
		System.out.println(sb);
		
	}

}
