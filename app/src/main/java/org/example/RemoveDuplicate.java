package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {// duplicate entries are removed from arraylist using set

    // generic arraylist is taken and any duplicates if are removed
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> inputList) {
        // linkedhashset used to remove duplicates which keeps same order as original list
        Set<T> uniqueSet = new LinkedHashSet<>(inputList);

        // convert set back to arraylist
        return new ArrayList<>(uniqueSet);
    }
}
