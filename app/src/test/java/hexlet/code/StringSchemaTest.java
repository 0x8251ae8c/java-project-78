package hexlet.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringSchemaTest {
    @Test
    public void testStringSchema() {
        StringSchema s = new StringSchema();
        assertTrue(s.isValid(""));
        assertTrue(s.isValid(null));

        s.required();

        assertFalse(s.isValid(""));
        assertFalse(s.isValid(null));

        assertTrue(s.isValid("what does the fox say"));
        assertTrue(s.isValid("hexlet"));

        assertFalse(s.minLength(10).isValid("hexlet"));
        assertTrue(s.minLength(4).isValid("hexlet"));

        assertTrue(s.contains("wh").isValid("what does the fox say"));
        assertTrue(s.contains("what").isValid("what does the fox say"));
        assertFalse(s.contains("whatthe").isValid("what does the fox say"));
    }
}
