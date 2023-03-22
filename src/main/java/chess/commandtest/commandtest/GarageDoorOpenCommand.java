package chess.commandtest.commandtest;

import chess.commandtest.hardware.abstraction.Garage;

public class GarageDoorOpenCommand implements Command {

    private final Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.up();
    }
}
