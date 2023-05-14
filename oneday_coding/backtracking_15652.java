package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//1부터 N까지 자연수 중에서 M개를 고른 수열
//같은 수를 여러 번 골라도 된다.
//고른 수열은 비내림차순이어야 한다.
//길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.
//입력 예시 : 4 2

public class backtracking_15652 {
	static int node, line;
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	static boolean visited[];
	
	public static void dfs(int depth) {
		if(depth>=line) {
			for (int i: arr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i=0; i<node; i++) {
			if(!visited[i]) {
				arr[depth]=i+1;
				dfs(depth+1);
				visited[arr[0]-1]=true;
			}
			
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		arr = new int[line];
		visited = new boolean[node];
		
		dfs(0);
		System.out.println(sb);
	}

}
