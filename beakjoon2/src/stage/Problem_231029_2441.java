package stage;

import java.io.*;

public class Problem_231029_2441 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 별을 몇 줄 찍을지
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				// 대칭 맞추기
				sb.append(" ");
			}
			
			// 별 찍기
			for(int j = 0; j < n - i; j++) {
				sb.append("*");
			}
			// 줄 바꿈
			sb.append("\n");
		}
		// 출력
		System.out.println(sb);
	}
}
