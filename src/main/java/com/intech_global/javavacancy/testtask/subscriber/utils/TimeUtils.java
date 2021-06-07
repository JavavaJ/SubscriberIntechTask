package com.intech_global.javavacancy.testtask.subscriber.utils;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class TimeUtils {

    private static final ZoneId MOSCOW_TIME_ZONE = ZoneId.of("UTC+3");

    public static OffsetDateTime unixTimeToMoscowTime(long unixTime) {
        Instant instant = Instant.ofEpochSecond(unixTime);
        return OffsetDateTime.ofInstant(instant, MOSCOW_TIME_ZONE);
    }
}
