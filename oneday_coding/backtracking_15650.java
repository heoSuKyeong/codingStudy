package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열, 고른 수열은 오름차순이어야 한다.
//입력 예시 : 4 2

public class backtracking_15650 {
	static int node, line;
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int start, int depth) {
		//깊이와 라인 수가 같으면 arr배열을 sb에 저장하고 return해줌
		if (depth==line) {
			for (int i : arr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
			
		}
		for (int i=start; i<=node; i++) {
			//현재 깊이를 index로 하여 해당 위치에 i값을 담아줌
			arr[depth]=i;
			dfs(i+1, depth+1);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		arr = new int[line];
		
		//출발지점과 깊이를 보내줌
		dfs(1, 0);
		System.out.println(sb);
		
	}

}
