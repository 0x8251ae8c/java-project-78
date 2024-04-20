package hexlet.code;

public class Validator {
    private final StringSchema stringSchema;
    private final NumberSchema numberSchema;
    private final MapSchema mapSchema;

    public Validator() {
        this.stringSchema = new StringSchema();
        this.numberSchema = new NumberSchema();
        this.mapSchema = new MapSchema();
    }

    public StringSchema string() {
        return stringSchema;
    }

    public NumberSchema number() {
        return numberSchema;
    }

    public MapSchema map() {
        return mapSchema;
    }
}
