package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (두줄 입력)
public class IO_2558 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(A+B);
		
		StringBuilder sb = new StringBuilder();
		sb.append(A+B);
		System.out.println(sb);

	}

}
