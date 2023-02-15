package chap_10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성
        int[] scores = {100,95,90,85};
        IntStream scoresStream = Arrays.stream(scores);

        String[] langs = {"python","java","javascript","c","c++","c#"};
        Stream<String> stream = Arrays.stream(langs);

        List<String> langList = new ArrayList<>();
        langList = Arrays.asList(langs);
        //System.out.println(langList.size());
        Stream<String> langListstream = langList.stream();

        //Stream.of
        Stream<String> langListOfstream = Stream.of("python", "Java", "Javascript", "c", "c++", "C#");

        // 스트림 사용
        // 중간 연산 : filter map sored distinct skip
        // 최종 연산 count min mx sum forEach anyMatch

        // 90 점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x-> System.out.println(x));
        //Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("========================");

        // 90 점 이상인 사람의 수
        long count = Arrays.stream(scores).filter(x->x >=90).count();
        System.out.println(count);
        System.out.println("========================");

        // 90 점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x>=90).sum();
        System.out.println(sum);
        System.out.println("========================");

        // 90 점 이상인 점수들의 정렬
        Arrays.stream(scores).filter(x ->x>=90).sorted().forEach(System.out::println);
        System.out.println("========================");

        // "python", "Java", "Javascript", "c", "c++", "C#"
        // C 로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x ->x.startsWith("c")).forEach(System.out::println);
        System.out.println("========================");

        // java 로 시작하는 언어
        Arrays.stream(langs).filter(x ->x.contains("java")).forEach(System.out::println);
        System.out.println("========================");

        // 글자 개수가 4개 이하의 언어
        Arrays.stream(langs).filter(x ->x.length() <= 4).forEach(System.out::println);
        System.out.println("========================");
        langList.stream().filter(x -> x.length() <=4).sorted().forEach(System.out::println); // 정렬 까지
        System.out.println("========================");

        // 4글자 이하의 언어중에서 C 라는 글자를 포함하는 언어
        langList.stream()
                .filter(x ->x.length()<=4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("========================");

        // 4글자 이하의 언어중에서 c 라는 글자가 포함되어 있는지 여부
        boolean anyMatch  = langList.stream()
                .filter(x->x.length()<=4)
                .anyMatch(x ->x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("========================");

        // 4글자 이하의 언어들의 모두 c 라는 글자를 포함하는지 여부
        boolean allMatch  = langList.stream()
                .filter(x->x.length()<=3)
                .allMatch(x ->x.contains("c"));
        System.out.println(allMatch);
        System.out.println("========================");

        // 4글자 이하의 언어중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map
        langList.stream()
                .filter(x->x.length()<=4)
                .filter(x-> x.contains("c"))
                .map(x -> x+"(어려워요)")
                .forEach(System.out::println);
        System.out.println("========================");

        // c 라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x-> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("========================");

        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartwithC = langList.stream()
                .filter(x-> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        langListStartwithC.stream().forEach(System.out::println);

    }
}
