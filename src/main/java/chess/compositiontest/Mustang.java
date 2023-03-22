package chess.compositiontest;

public class Mustang implements Car {

    private final DrivingAction drivingAction;

    public Mustang(DrivingAction drivingAction) {
        this.drivingAction = drivingAction;
    }

    @Override
    public void drive() {
        drivingAction.drive();
    }

    @Override
    public void park() {
        drivingAction.park();
    }
}
