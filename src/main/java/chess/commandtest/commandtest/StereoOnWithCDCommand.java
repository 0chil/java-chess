package chess.commandtest.commandtest;

import chess.commandtest.hardware.abstraction.Stereo;

public class StereoOnWithCDCommand implements Command {

    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.putCd("유행가");
        stereo.setVolume(11);
        stereo.on();
    }

    public void undo() {
        stereo.off();
    }
}
