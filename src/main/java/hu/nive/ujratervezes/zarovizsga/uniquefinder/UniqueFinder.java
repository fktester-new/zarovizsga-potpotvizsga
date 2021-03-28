package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.*;

public class UniqueFinder {

    public List<Character> uniqueChars(String str){
        if (str == null){
            throw new IllegalArgumentException("The string is null");
        }
        Set<Character> result = new LinkedHashSet<>();
        char[] chars = str.toCharArray();
        for (char c :chars ) {
            result.add(c);
        }
        return new ArrayList<>(result);
    }
}
