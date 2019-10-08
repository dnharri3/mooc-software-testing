package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "phrase={0}, number={1}, result={2}")
    @CsvSource({"yz{,0,invalid","ABC,5,invalid", "xyz,3,abc", "abc,3,def", "~abc,3,invalid","XYZ,10,invalid"})
    public void Algorithm1(String item, int num, String expectedResult){
        String result = new CaesarShiftCipher().CaesarShiftCipher(item,num);
        Assertions.assertEquals(expectedResult, result);
    }

}
