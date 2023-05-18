package backjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//Hello World!를 출력하시오.
public class IO_2557 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//방법 1
		System.out.println("Hello World!");
		
		//방법 2
		StringBuilder sb = new StringBuilder();
		sb.append("Hello World!");
		System.out.println(sb);
		
		//방법 3 > main 뒤에 'throws IOException' 써주는거 잊지말기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello World!");
		bw.flush();
		bw.close();
		

	}

}
