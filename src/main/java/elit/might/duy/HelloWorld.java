package elit.might.duy;

import java.util.Random;

/**
 * Created by Hothep on 2017-05-07.
 */
public class HelloWorld {

    public static void main(String[] args) {
        RandomValueGenerator random1 = new RandomValueGenerator(4);
        RandomValueGenerator random2 = new RandomValueGenerator(5);

        System.out.println(random1.getValue());
        System.out.println(random2.getValue());
    }

}
