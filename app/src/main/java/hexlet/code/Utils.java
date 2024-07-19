package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandom(int limit) {
        Random r = new Random();
        return r.nextInt(limit);
    }

    public static int getRandom() {
        return getRandom(100);
    }
}
