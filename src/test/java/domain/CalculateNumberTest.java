package domain;

import org.example.domain.CalculateNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculateNumberTest {

    @Test
    void 숫자를_통해_도메인을_생성한다(){
        //Given
        Long value = 1000L;

        //When
        CalculateNumber calculateNumber = new CalculateNumber(value);

        //Then
        Assertions.assertEquals(calculateNumber.getValue(),value);
    }
    @Test
    void 정수를_통해_도메인을_생성한다(){
        //Given
        Integer value = 1000;

        //When
        CalculateNumber calculateNumber = new CalculateNumber(value);

        //Then
        Assertions.assertInstanceOf(CalculateNumber.class,calculateNumber);
    }
    @Test
    void 계산숫자_두개를_통해_계산된_계산숫자를_반환한다(){
        CalculateNumber calculateNumber1 = new CalculateNumber(100);
        CalculateNumber calculateNumber2 = new CalculateNumber(200);

        CalculateNumber calculatedNumber = calculateNumber1.add(calculateNumber2);

        Assertions.assertEquals(calculatedNumber.getValue(),300);
    }


}
