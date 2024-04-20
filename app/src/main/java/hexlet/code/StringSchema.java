package hexlet.code;

import java.util.HashSet;
import java.util.Set;

public class StringSchema {
    private boolean isRequired;
    private int minimumLength;
    private final Set<String> substrings;

    public StringSchema() {
        this.isRequired = false;
        this.minimumLength = 0;
        this.substrings = new HashSet<>();
    }

    public void required() {
        this.isRequired = true;
    }

    public StringSchema minLength(int length) {
        this.minimumLength = length;
        return this;
    }

    public StringSchema contains(String substring) {
        this.substrings.add(substring);
        return this;
    }

    public boolean isValid(String str) {
        return checkLength(str) && checkRequired(str) && checkContains(str);
    }

    private boolean checkRequired(String str) {
        if (!this.isRequired) {
            return true;
        }
        return !(str == null || str.isEmpty());
    }

    private boolean checkLength(String str) {
        if (this.minimumLength == 0) {
            return true;
        }
        return this.minimumLength <= str.length();
    }

    private boolean checkContains(String str) {
        if (this.substrings.isEmpty()) {
            return true;
        }
        for (var substring : substrings) {
            if (!str.contains(substring)) {
                return false;
            }
        }
        return true;
    }
}
