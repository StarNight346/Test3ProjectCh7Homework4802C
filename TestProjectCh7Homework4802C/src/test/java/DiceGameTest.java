import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiceGameTest {

    @Test
    public void dieNumber() {
        Die test = new Die();
        DiceGame testGame = new DiceGame();
        Assertions.assertTrue(0 <= test.GetRoll() && test.GetRoll() <= 6);
    }

    @Test
    public void newDieNumber() {
        Die test = new Die();
        DiceGame testGame = new DiceGame();
        test.Roll();
        Assertions.assertTrue(0 <= test.GetRoll() && test.GetRoll() <= 6);
    }


}
