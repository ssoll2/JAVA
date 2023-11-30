package day231130;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SubStream_ {

	public static void main(String[] args) {
		
		// 1) 성능 향상 보조 스트림
		
		// input
		FileInputStream readFile = null; // 기반 스트림
		BufferedInputStream bis = null; // 보조 스트림
		
		// output
		FileOutputStream writeFile = null; // 기반 스트림
		BufferedOutputStream bos = null; // 보조 스트림
		
		System.out.println("보조 스트림 시작");
		try {
			readFile = new FileInputStream("src/image/pikachu.jpg"); // 파일의 위치에서 스트림을 시작한다라는 경로를 만든다.(기반)
			writeFile = new FileOutputStream("src/image/pikachu_sub.jpg");// 파일의 위치에서 스트림을 시작한다라는 경로를 만든다.(기반)
			
			// 보조 스트림을 결합한다.
			bis = new BufferedInputStream(readFile);
			bos = new BufferedOutputStream(writeFile);
			
			
			while(bis.read() != -1) {
				bos.write(bis.read());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
