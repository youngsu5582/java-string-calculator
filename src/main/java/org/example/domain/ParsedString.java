package org.example.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public record ParsedString(String delimiterString, String calculateString) {
    private static final Pattern delimiterRegexPattern = Pattern.compile("^//(.*)\\n(.*)");

    public static ParsedString of(String originalString) {
        Matcher matcher = delimiterRegexPattern.matcher(originalString);
        if (hasDelimiter(matcher)) {
            return new ParsedString(matcher.group(1), matcher.group(2));
        }
        return new ParsedString("", originalString);
    }

    private static final boolean hasDelimiter(Matcher matcher) {
        return matcher.find();
    }
    public boolean hasDelimiter(){
        return !(this.delimiterString.isBlank() || this.delimiterString.isEmpty());
    }

}
