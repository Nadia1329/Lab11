package org.example;
import java.util.ArrayList;

public class FuzzyFinder {
    public int linearSearch(ArrayList<Fuzzy> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).color.equals("gold")) {
                return i;
            }
        }
        return -1;
}

public int binarySearch(ArrayList<Fuzzy> list) {
    int left = 0;
    int right = list.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            Fuzzy midFuzzy = list.get(mid);
            int comparison = midFuzzy.color.compareTo("gold");
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
