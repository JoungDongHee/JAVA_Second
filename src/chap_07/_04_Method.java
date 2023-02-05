package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BalckBox b1 = new BalckBox();
        b1.modelName = "까망이";
        b1.autoReport();

        BalckBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        //일반 영상 :1
        int filcount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일수 " +filcount);
        //이벤트 영상 (충돌감지)
        filcount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일수 "+filcount);
    }
}
