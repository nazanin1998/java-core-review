package org.negah;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayHandler {

    public int[] defineArrayWithSpecifiedElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        return array;
    }

    public int[] getSliceOfArrayWithRange(int[] array, int startIdx, int endIdx) {

        return Arrays.copyOfRange(array, startIdx, endIdx);
    }

    public int[] copyOfArrayAndPadOrTruncateNewOne(int[] array, int newLen) {

        List<String> stringList;
        stringList.stream().sh
        return Arrays.copyOf(array, newLen);
    }
}
