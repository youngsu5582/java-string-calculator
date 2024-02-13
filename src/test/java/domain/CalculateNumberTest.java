package domain;

import org.example.domain.CalculateNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateNumberTest {

    @Test
    void 숫자를_통해_도메인을_생성한다(){
        //Given
        Long value = 1000L;

        //When
        CalculateNumber calculateNumber = new CalculateNumber(value);

        //Then
        Assertions.assertInstanceOf(CalculateNumber.class,calculateNumber);
        Assertions.assertEquals(calculateNumber.getValue(),value);
    }
}
