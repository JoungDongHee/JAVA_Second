package chap_08.detector;

public class AccidntDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("교통 사고를 감지합니다.");
    }
}
