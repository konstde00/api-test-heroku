package util.impl;

import java.security.SecureRandom;
import java.util.Random;
import util.RandomStringGenerator;

public class RandomStringGeneratorImpl implements RandomStringGenerator {
    private static final String letters = "abcdefghijklmnopqrstuvwxyz";
    private static final String digits = "0123456789";
    private static final String chars = letters + digits;
    private final Random random = new SecureRandom();

    public RandomStringGeneratorImpl() {
    }

    @Override
    public String getRandomString(int length) {
        if (length < 1) throw new IllegalArgumentException();
        String result = "";
        for (int index = 0; index < length; index++) {
            result += Character.toString(chars.charAt(random.nextInt(chars.length())));
        }
        return result;
    }
}
