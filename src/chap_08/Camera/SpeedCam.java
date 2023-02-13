package chap_08.Camera;

import chap_08.detector.AccidntDetector;
import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable  {

    private Detectable detectable;
    private Reportable reportable;

    public void setDetectable(Detectable detectable) {
        this.detectable = detectable;
    }

    public void setReportable(Reportable reportable) {
        this.reportable = reportable;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정 , 번호 인식");
    }

    public void detect(){
        this.detectable.detect();
    }

    public void report(){
        this.reportable.report();
    }
}
