package domain;

import org.example.domain.Delimiter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DelimiterTest {
    @Test
    public void 문자열을_통해_구분자를_생성한다() {
        String value = ":";

        Delimiter delimiter = new Delimiter(value);

        Assertions.assertInstanceOf(Delimiter.class, delimiter);
    }
    @Test
    public void 들어온_문자열과_구분자가_일치한지_검증한다(){
        Delimiter delimiter = new Delimiter(":");
        String inputString = ":";

        Assertions.assertTrue(delimiter.match(inputString));


    }

}
