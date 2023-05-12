package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class bfs_26146 {
	static int arr[][];
	static boolean check[];
	static int count, node, line, anwer;
	
	static void DFS(int x) {
		check[x]=true;
		count++;
		for (int i=1; i<=node; i++) {
			if (arr[x][i]==1 & !check[i]) {
				DFS(i);
				anwer++;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());
		line =  Integer.parseInt(st.nextToken());
		arr = new int[node+1][node+1];
		check = new boolean[line];
		List<Integer> list = new LinkedList<Integer>();
		List<Integer> anwerlist = new LinkedList<Integer>();
		
		for (int i=0; i<line; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y]=arr[y][x]=1;
		}
		
		for (int i=0; i<line; i++) {
			for (int j=0; j<line; j++) {
				if (arr[i][j]==1 && !check[i]) {
					count=0;
					anwer=0;
					DFS(i);
					list.add(count);
					anwerlist.add(anwer);
				}
			}
		}
		for (int i:list) {
			System.out.println(i);
		}
		for (int i:anwerlist) {
			System.out.println(i);
		}
	}

}
