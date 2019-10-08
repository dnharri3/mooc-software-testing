package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest{
    @ParameterizedTest(name = "phrase={0}, result={1}")
    @CsvSource({"xxggxx, true","xxgxx, false","xxggyygxx, false"})
    public void back2BackG(String item){
        boolean result = new GHappy().gHappy(item);
        Assertions.assertTrue(result);
    }

}
