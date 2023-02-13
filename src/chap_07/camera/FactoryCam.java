package chap_07.camera;

// FactoryCam is a Camera
public class FactoryCam extends Camera { // 자식 클래스
    public FactoryCam(){
        //this.name = "공장카메라";
        super("공장카메라");
    }
    public void detectFire(){
        // 화채를 감지
        System.out.println("화재를 감지합니다.");
    }

    @Override
    public void recordVide(){
        super.recordVide(); // 부모클래스의 recordVide 를 가져옴
        detectFire();
    }
    @Override
    public void showMainFeautre(){
        System.out.println(this.name + "의 주요기능 : 화재 감지");
    }
}
