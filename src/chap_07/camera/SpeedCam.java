package chap_07.camera;

public class SpeedCam extends Camera { // 자식 클래스
    public SpeedCam() {
        this.name = "과속 단속 카메라";
    }
    public void checkedSpeed(){
        //속도 체크
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate(){
        //번호 인식
        System.out.println("차량 번호를 인식 합니다.");
    }
}