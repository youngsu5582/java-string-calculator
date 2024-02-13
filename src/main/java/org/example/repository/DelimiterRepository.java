package org.example.repository;

import org.example.domain.Delimiter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DelimiterRepository {
    private static final List<Delimiter> delimiters = new ArrayList<>();

    public DelimiterRepository() {
    }

    public static void addDelimiter(Delimiter delimiter) {
        delimiters.add(delimiter);
    }

    public static final List<Delimiter> getDelimiters() {
        return Collections.unmodifiableList(delimiters);
    }
}
