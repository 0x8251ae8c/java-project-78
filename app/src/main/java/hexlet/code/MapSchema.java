package hexlet.code;

import java.util.Map;

public class MapSchema {
    private boolean isRequired;
    private int minSize;

    public MapSchema() {
        this.isRequired = false;
        this.minSize = 0;
    }

    public void required() {
        this.isRequired = true;
    }

    public void sizeof(int size) {
        this.minSize = size;
    }

    public boolean isValid(Map map) {
        return checkRequired(map) && checkSize(map);
    }

    private boolean checkRequired(Map map) {
        if (!this.isRequired) {
            return true;
        }
        return !(map == null);
    }

    private boolean checkSize(Map map) {
        if (this.minSize == 0) {
            return true;
        }

        return map.size() >= this.minSize;
    }
}
