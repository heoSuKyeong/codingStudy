package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backtracking_14889 {
	static int n, scoreA, scoreB;
	static int [][] numArr;
	static boolean [] visited;
	static int Min = Integer.MAX_VALUE;

//오늘은 스타트링크에 다니는 사람들이 모여서 축구를 해보려고 한다. 축구는 평일 오후에 하고 의무 참석도 아니다. 축구를 하기 위해 모인 사람은 총 N명이고 신기하게도 N은 짝수이다. 이제 N/2명으로 이루어진 스타트 팀과 링크 팀으로 사람들을 나눠야 한다.
//입력예시
//	6
//	0 1 2 3 4 5
//	1 0 2 3 4 5
//	1 2 0 3 4 5
//	1 2 3 0 4 5
//	1 2 3 4 0 5
//	1 2 3 4 5 0
// 참고 : https://st-lab.tistory.com/122
	
	public static void combi(int idx, int count) {
		//두 팀으로 나눠졌을 경우
		if(count == n/2) {
			diff();
			return;
			
		}
		for (int i=idx; i<n; i++) {
			if(!visited[i]) {
				visited[i]=true;
				combi(i+1, count+1);
				visited[i]=false;	//재귀 끝나면 비방문으로 변경
			}
		}
	}
	
	//두 팀의 능력치 차이를 계산하는 함수
	public static void diff() {
		int scoreA=0;
		int scoreB=0;
		
		
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				if (visited[i]==true && visited[j]==true) {
					scoreA+=numArr[i][j];
					scoreA+=numArr[j][i];
				} else if (visited[i]==false && visited[j]==false) {
					scoreB+=numArr[i][j];
					scoreB+=numArr[j][i];
				}
			}
		}
		// 두 팀의 점수 차이 (절댓값)
		int result = Math.abs(scoreA-scoreB);
		
		if (result==0) {
			System.out.println(result);
			System.exit(0);
		}
		
		Min = Math.min(Min, result);
	}
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n];
		numArr = new int[n][n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				numArr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		combi(0, 0);
		System.out.println(Min);
		
		
		
	}

}
