package chess.commandtest.hardware.abstraction;

public class Stereo {

    private int volume;
    private String cdLabel;

    public void putCd(String cdLabel) {
        this.cdLabel = cdLabel;
        System.out.println(cdLabel + " CD를 넣었습니다");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨을 " + volume + "으로 설정했습니다");
    }

    public void on() {
        System.out.println("전원을 켰고, 볼륨 " + volume + "으로 " + cdLabel + "CD를 재생합니다");
    }

    public void off() {
        System.out.println("전원을 껐습니다");
    }
}
