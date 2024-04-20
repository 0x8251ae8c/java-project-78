package hexlet.code;

public class Validator {
    private final StringSchema stringSchema;
    private final NumberSchema numberSchema;

    public Validator() {
        this.stringSchema = new StringSchema();
        this.numberSchema = new NumberSchema();
    }

    public StringSchema string() {
        return stringSchema;
    }

    public NumberSchema number() {
        return numberSchema;
    }
}
