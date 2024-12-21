package hexlet.code.schemas;

import java.util.ArrayList;
import java.util.List;

public final class StringSchema {
    private boolean isRequired;
    private Integer minLength;
    private final List<String> substrings;

    public StringSchema() {
        isRequired = false;
        minLength = null;
        substrings = new ArrayList<>();
    }

    public StringSchema required() {
        isRequired = true;
        return this;
    }

    public StringSchema minLength(int length) {
        minLength = length;
        return this;
    }

    public StringSchema contains(String substring) {
        substrings.add(substring);
        return this;
    }

    public boolean isValid(String string) {
        return checkRequired(string) && checkLength(string) && checkContains(string);
    }

    private boolean checkRequired(String string) {
        if (isRequired) {
            return string != null && !string.isEmpty();
        }
        return true;
    }

    private boolean checkLength(String string) {
        if (minLength == null) {
            return true;
        }
        return string.length() >= minLength;
    }

    private boolean checkContains(String string) {
        for (var substring : substrings) {
            if (!string.contains(substring)) {
                return false;
            }
        }
        return true;
    }
}
