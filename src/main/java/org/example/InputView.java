package org.example;

import camp.nextstep.edu.missionutils.Console;
import org.example.domain.ParsedString;


public class InputView {
    private static InputView INSTANCE = null;

    public static InputView getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InputView();
        }
        return INSTANCE;
    }

    public String readInput() {
        return Console.readLine();
    }

    public ParsedString inputParseString() {
        System.out.println("계산할 문자열을 입력해주세요.");
        String parsedStringInfo = readInput();
        return ParsedString.of(parsedStringInfo);
    }
}
