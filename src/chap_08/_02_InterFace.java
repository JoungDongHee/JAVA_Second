package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.*;

public class _02_InterFace {
    public static void main(String[] args) {
        // 인터페이스
        Reportable nomalReporter = new NomalReporter();
        nomalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("===============================");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("===============================");
        FactoryCam factoryCam = new FactoryCam();

        factoryCam.setDetectable(advancedFireDetector);
        factoryCam.setReportable(videoReporter);
        factoryCam.detect();
        factoryCam.report();
    }
}
