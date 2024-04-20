package hexlet.code;

public class NumberSchema {
    private boolean isRequired;
    private boolean isPositive;
    private Integer minRange;
    private Integer maxRange;

    public NumberSchema() {
        this.isRequired = false;
        this.isPositive = false;
        this.minRange = null;
        this.maxRange = null;
    }

    public void required() {
        this.isRequired = true;
    }

    public NumberSchema positive() {
        this.isPositive = true;
        return this;
    }

    public void range(int min, int max) {
        this.minRange = min;
        this.maxRange = max;
    }

    public boolean isValid(Integer num) {
        return checkRequired(num) && checkPositive(num) && checkRange(num);
    }

    private boolean checkRequired(Integer num) {
        if (!this.isRequired) {
            return true;
        }
        return !(num == null);
    }

    private boolean checkPositive(Integer num) {
        if (!this.isPositive || num == null) {
            return true;
        }
        return num > 0;
    }

    private boolean checkRange(Integer num) {
        if (this.minRange == null) {
            return true;
        }
        return num >= this.minRange && num <= this.maxRange;
    }
}
