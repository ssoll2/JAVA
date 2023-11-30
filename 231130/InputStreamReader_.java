package day231130;

import java.io.FileReader;
import java.io.Reader;

public class InputStreamReader_ {

	public static void main(String[] args) {
		
		// Reader -> InputStream/FileReader
		
		// 파일을 읽어오는 변수다.
		int read = 0;
		Reader reader = null;
		
		// 스트림 선언
		char[] buffer = new char[256];
 		try {
			reader = new FileReader("src/day231130/file_korean.txt"); // 파일을 만든 경로를 찾아서 넣는다.
			while(true) {
				// 파일 읽기
				read = reader.read(buffer);
				
				// -1이면 종료
				if (read == -1) {
					break;
				}
				System.out.print(String.valueOf(buffer,0,read));
			}
		}catch(Exception e) {
			
		}
	}

}
