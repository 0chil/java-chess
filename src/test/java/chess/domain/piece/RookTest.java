package chess.domain.piece;

import static chess.domain.Direction.DOWN;
import static chess.domain.Direction.LEFT;
import static chess.domain.Direction.RIGHT;
import static chess.domain.Direction.UP;
import static org.assertj.core.api.Assertions.assertThat;

import chess.domain.AbstractTestFixture;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RookTest extends AbstractTestFixture {

    @DisplayName("가로/세로 여러 칸 움직일 수 있다.")
    @Test
    void canMove_HorizontalVertical_Infinite() {
        Rook rook = Rook.from(true);

        assertThat(rook.hasMove(createMove(LEFT, LEFT, LEFT))).isTrue();
        assertThat(rook.hasMove(createMove(RIGHT, RIGHT))).isTrue();
        assertThat(rook.hasMove(createMove(UP, UP))).isTrue();
        assertThat(rook.hasMove(createMove(DOWN))).isTrue();
    }

    @DisplayName("자신의 수가 아닌 움직임을 할 수 없다.")
    @Test
    void canNotMove() {
        Rook rook = Rook.from(true);

        assertThat(rook.hasMove(createMove(LEFT, LEFT, UP))).isFalse();
        assertThat(rook.hasMove(createMove(LEFT, UP))).isFalse();
        assertThat(rook.hasMove(createMove(RIGHT, RIGHT, DOWN, DOWN))).isFalse();
    }
}