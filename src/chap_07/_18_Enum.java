package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : Jan , Feb , Mar ...
        // 옷사이즈 : S M L XL
        // OS 종류 : Window , Linux
        // 해상도 HD , FHD , QHD, UHD

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution){
            case HD://
                System.out.println("일반 화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초 고화질");
                break;
        }
        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);
        System.out.println("==============================");
        for (Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : "+myRes.ordinal());
        }
        System.out.println("==============================");
        for (Resolution myRes: Resolution.values()
             ) {
            System.out.println(myRes.name()+":"+myRes.getWidth());
        }
    }
}

enum Resolution{
    HD(1280),FHD(1920),UHD(2840);

    private final int width;
    Resolution(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }
}
