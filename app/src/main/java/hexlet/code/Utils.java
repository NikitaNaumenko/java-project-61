package hexlet.code;

import java.util.Random;

public final class Utils {
    private static final int LIMIT = 100;

    public static int getRandom(final int limit) {
        Random r = new Random();
        return r.nextInt(limit);
    }

    public static int getRandom() {
        return getRandom(Utils.LIMIT);
    }
    private Utils() { }
}
