package hexlet.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberSchemaTest {
    @Test
    public void testNumberSchema() {
        NumberSchema ns = new NumberSchema();

        assertTrue(ns.isValid(5));
        assertTrue(ns.isValid(null));
        assertTrue(ns.positive().isValid(null));

        ns.required();

        assertFalse(ns.isValid(null));
        assertTrue(ns.isValid(10));
        assertFalse(ns.isValid(-10));
        assertFalse(ns.isValid(0));

        ns.range(5, 10);

        assertTrue(ns.isValid(5));
        assertTrue(ns.isValid(10));
        assertFalse(ns.isValid(4));
        assertFalse(ns.isValid(11));
    }
}
