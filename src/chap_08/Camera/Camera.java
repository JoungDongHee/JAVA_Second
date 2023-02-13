package chap_08.Camera;

public abstract class Camera {
    public void takePicture(){
        System.out.println("사진 을 촬영합니다.");
    }
    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }
    public abstract void showMainFeature(); // 구현 해야 하는 메소드
}
