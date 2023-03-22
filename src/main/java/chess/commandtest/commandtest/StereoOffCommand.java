package chess.commandtest.commandtest;

import chess.commandtest.hardware.abstraction.Stereo;

public class StereoOffCommand implements Command {

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
