package chap_13;

import java.io.File;
import java.io.IOException;

public class _03_File {
    public static void main(String[] args) {
        // 파일 생성 + 정보 가져오기
        String fileName = "test.txt";
        File file = new File(fileName);
        try {
            file.createNewFile();
            if(file.exists()){
                System.out.println("파일이름 : "+file.getName());
                System.out.println("파일 경로 : "+file.getAbsolutePath());
                System.out.println("파일 크기 : "+file.length());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
