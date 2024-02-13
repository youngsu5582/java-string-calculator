package domain;

import org.example.domain.ParsedString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParseStringTest {
    @Test
    public void 문자열을_통해_ParseString_을_만든다() {
        String originalString = "1;2;3;";

        ParsedString parsedString = ParsedString.of(originalString);

        Assertions.assertEquals(parsedString.calculateString(), originalString);
    }

    @Test
    public void 구분자를_포함하는_문자열을_통해_ParseString_을_만든다() {
        String originalString = "//!\n1;2;3";

        ParsedString parsedString = ParsedString.of(originalString);

        Assertions.assertEquals(parsedString.delimiterString(), "!");
        Assertions.assertEquals(parsedString.calculateString(), "1;2;3");
    }
    @Test
    public void 문자열에_구분자_확인후_있으면_참을_반환한다(){
        String originalString = "//!\n1;2;3";
        ParsedString parsedString = ParsedString.of(originalString);

        Boolean isHasDelimiter = parsedString.hasDelimiter();

        Assertions.assertTrue(isHasDelimiter);
    }
    @Test
    public void 문자열에_구분자_확인후_없으면_거짓을_반환한다(){
        String originalString = "1;2;3;4";
        ParsedString parsedString = ParsedString.of(originalString);

        Boolean isHasDelimiter = parsedString.hasDelimiter();

        Assertions.assertFalse(isHasDelimiter);
    }
}
