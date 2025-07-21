package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {// removes duplicate entries from an arraylist using set

    // takes generic arraylist and removes any duplicates
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> inputList) {
        // linkedhashset used to remove duplicates which keeps same order as original list
        Set<T> uniqueSet = new LinkedHashSet<>(inputList);

        // convert set back to arraylist
        return new ArrayList<>(uniqueSet);
    }
}
