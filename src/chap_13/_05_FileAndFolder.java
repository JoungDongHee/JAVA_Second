package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // String folder = "C:\\Users\\Administrator\\Desktop\\JAVA_Second\\src\\chap_13"; 절대경로
        String folder = "src/chap_13"; // 상대경로
        File file = new File(folder);
        System.out.printf("현재 폴더 경로"+file.getAbsolutePath());
        for (File file1: file.listFiles()) {
            if(file1.isFile()){
                System.out.printf("파일 입니다."+file1.getName());
            }else if(file1.isDirectory()){
                System.out.printf("폴더 입니다."+file1.getName());
            }
            System.out.println(file1.getName());
        }
    }
}
