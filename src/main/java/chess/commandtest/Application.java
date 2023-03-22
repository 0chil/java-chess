package chess.commandtest;

import chess.commandtest.commandtest.Command;
import chess.commandtest.commandtest.LightOffCommand;
import chess.commandtest.commandtest.LightOnCommand;
import chess.commandtest.hardware.abstraction.Light;
import chess.commandtest.hardware.abstraction.RemoteControl;
import chess.commandtest.hardware.abstraction.Stereo;

public class Application {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Garage garage = new Garage();
        // GarageDoorOpenCommand garageOpenCommand = new GarageDoorOpenCommand(garage);

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        Stereo stereo = new Stereo();
        // Command stereoOnWithCdCommand = new StereoOnWithCDCommand(stereo);
        // Command stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommand(1, () -> stereo.on(), () -> stereo.off());

        System.out.println("remoteControl = " + remoteControl);

        remoteControl.pressOnButton(0);
        remoteControl.pressOffButton(0);

        remoteControl.pressOnButton(1);
        remoteControl.pressOffButton(1);
    }
}
