package chap_08;

import chap_08.Camera.SpeedCam;
import chap_08.detector.AccidntDetector;
import chap_08.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetectable(new AccidntDetector());
        speedCam.setReportable(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
