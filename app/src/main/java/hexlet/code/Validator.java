package hexlet.code;

public class Validator {
    private final StringSchema stringSchema;

    public Validator() {
        this.stringSchema = new StringSchema();
    }

    public StringSchema string() {
        return stringSchema;
    }
}
