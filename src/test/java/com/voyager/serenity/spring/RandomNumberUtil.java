package com.voyager.serenity.spring;

import org.apache.commons.lang3.RandomUtils;

public class RandomNumberUtil {

    public static int randomInt() {
        return RandomUtils.nextInt(1, 10);
    }
}
