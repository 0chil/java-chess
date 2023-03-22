package chess.commandtest.hardware.abstraction;

import java.util.Arrays;

import chess.commandtest.commandtest.Command;
import chess.commandtest.commandtest.NoCommand;

public class RemoteControl {

    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
