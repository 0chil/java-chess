package chess.compositiontest;

public class FlyingCar implements Car, Aircraft {

    private final DrivingAction drivingAction;
    private final FlyingAction flyingAction;

    public FlyingCar(DrivingAction drivingAction, FlyingAction flyingAction) {
        this.drivingAction = drivingAction;
        this.flyingAction = flyingAction;
    }

    @Override
    public void fly() {
        drivingAction.drive();
    }

    @Override
    public void drive() {
        flyingAction.fly();
    }

    @Override
    public void park() {
        drivingAction.park();
    }
}
