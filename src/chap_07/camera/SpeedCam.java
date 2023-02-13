package chap_07.camera;

// Speed is a Camera
public class SpeedCam extends Camera { // 자식 클래스
    public SpeedCam() {
        //this.name = "과속 단속 카메라";
        super("과속단속 카메라");
    }
    public void checkedSpeed(){
        //속도 체크
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate(){
        //번호 인식
        System.out.println("차량 번호를 인식 합니다.");
    }

    @Override
    public void takePicture(){
        //사진 촬영
        super.takePicture();
        checkedSpeed();
        recognizeLicensePlate();
    }

    @Override
    public void showMainFeautre(){
        System.out.println(this.name + "의 주요기능 : 속도측정 , 번호 인식");
    }
}
