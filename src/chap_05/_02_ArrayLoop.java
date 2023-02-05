package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffess = {"아메리카노","카메모카" ,"라떼","카푸치노"};
        for(int i =0 ; i <coffess.length;i++){
            System.out.println(coffess[i]+" 하나");
        }
        System.out.println("주세요");
        System.out.println("=================================");
        // enhanced for (for each) 반복문
        for(String coffee : coffess ){
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
