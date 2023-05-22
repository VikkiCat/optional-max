package com.epam.rd.autotasks.max;

import java.util.*;

public class MaxMethod {

    private static int findMax(int[] values){
        int max = values[0];
        for (int i = 1; i < values.length ; i++) {
           max = Math.max(max, values[i]);
        }
        return max;
    }

    public static OptionalInt max(int[] values) {
        OptionalInt result;

        if (values != null && values.length > 0){
            result = OptionalInt.of(findMax(values));
        }
        else {
            result = OptionalInt.empty();
        }
        return result;
    }
}
