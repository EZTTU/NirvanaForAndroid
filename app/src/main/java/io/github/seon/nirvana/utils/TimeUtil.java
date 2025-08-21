package io.github.seon.nirvana.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static String getNowTimeFormat() {
        DateFormat df = SimpleDateFormat.getDateTimeInstance();
        return df.format(new Date());
    }
}
