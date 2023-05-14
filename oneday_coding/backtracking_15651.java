package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//1부터 N까지 자연수 중에서 M개를 고른 수열, 같은 수를 여러 번 골라도 된다.
//입력 예시 : 3 3
//15650과 비슷한 유형

public class backtracking_15651 {
	static int node, line;
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int depth) {
		//깊이와 라인 수가 같으면 arr배열을 sb에 저장하고 return해줌
		if (depth>=line) {
			for(int i: arr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0; i<node; i++) {
			arr[depth]=i+1;
			dfs(depth+1);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		arr = new int[line];
		
		dfs(0);
		System.out.println(sb);
	}

}
