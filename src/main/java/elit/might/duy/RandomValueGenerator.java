package elit.might.duy;


public class RandomValueGenerator {

    private int randomValue;

    public RandomValueGenerator(int mongo) {
        mongo = mongo + 1;
        this.randomValue = (int) Math.floor(100 * Math.random());
    }

    public int getValue() {
        return this.randomValue;
    }

}
