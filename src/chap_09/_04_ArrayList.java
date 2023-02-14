package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임 워크 list set map
        ArrayList<String> list = new ArrayList<>(); // list 이름의 String 형태의 데이터 리스트

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println("================================");

        // 삭제
        System.out.println("신청 학생수 (이사 전) : " + list.size()); // 5
        list.remove("박명수");

        System.out.println("신청 학생수 (이사 후) : " + list.size()); // 4
        System.out.println(list.get(3));

        System.out.println("================================");

        System.out.println("남은 학생수 (제외 전) :"+ list.size()); // 4
        list.remove(list.size()-1); // 리스트의 마지막 list 제거
        System.out.println("남은 학생수 (제외 후) : " + list.size()); // 3

        // 순회
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " : " + i);
        }

        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("================================");

        //변경 수강권 양도
        System.out.println("수강권 양도 전 : "+ list.get(0));
        list.set(0,"이수근");
        System.out.println("수강권 양도 후 : "+ list.get(0));

        // 확인
        System.out.println(list.indexOf("김종국")); // index 값 반환
        // 선착순 5명 내에 포함되어 있는가
        System.out.println(list.contains("김종국"));
        if(list.contains("김종국")){
            System.out.println("수강 신청 성공");
        }else{
            System.out.println("수강 신청 실패");
        }
        System.out.println("================================");
        //전체 삭제
        list.clear();
        if(list.isEmpty()){
            System.out.println("학생수 : "+ list.size());
            System.out.println("리스트가 클리어 되었습니다.");
        }
        System.out.println("================================");

        // 다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬
        Collections.sort(list);
        for (String s: list) {
            System.out.println(s);
        }


    }
}
