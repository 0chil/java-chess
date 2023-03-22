package chess.commandtest.hardware.abstraction;

public class Garage {

    public void up() {
        System.out.println("차고 문 열림");
    }

    public void down() {
        System.out.println("차고 문 닫음");
    }

    public void stop() {
        System.out.println("차고 문 정지");
    }

    public void lightOn() {
        System.out.println("차고 불 켬");
    }

    public void lightOff() {
        System.out.println("차고 불 끔");
    }
}
