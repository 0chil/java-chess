package chess.domain;

import chess.domain.move.Direction;
import chess.domain.move.Move;
import chess.domain.position.File;
import chess.domain.position.Position;
import chess.domain.position.Rank;
import java.util.List;

public abstract class AbstractTestFixture {

    public static Move createMove(Direction... directions) {
        return new Move(List.of(directions));
    }

    public static Position createPosition(String position) {
        String[] split = position.split(",");
        File file = File.valueOf(split[0]);
        Rank rank = Rank.valueOf(split[1]);
        return new Position(file, rank);
    }
}
