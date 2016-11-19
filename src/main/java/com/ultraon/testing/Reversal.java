package com.ultraon.testing;

import com.sun.istack.internal.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The {@link Reversal} is responsible for reversing string with some behavior for the non letter
 * chars.
 */
public class Reversal {
    public String reverse(@NotNull final String input) {
        final char[] chars = input.toCharArray();
        final StringBuilder sb = new StringBuilder();
        final Map<Integer, Character> nonLetterPositions = new LinkedHashMap<>();

        for (int i = chars.length - 1; i >= 0 ; i--) {
            final char ch = chars[i];
            if (Character.isLetter(ch)) {
                sb.append(ch);
            } else {
                nonLetterPositions.put(i, ch);
            }
        }

        for (Map.Entry<Integer, Character> entry : nonLetterPositions.entrySet()) {
            final Integer position = entry.getKey();
            final String nonLetter = entry.getValue().toString();
            if (position > sb.length() - 1) {
                sb.append(nonLetter);
            } else {
                sb.insert(position, nonLetter);
            }
        }

        return sb.toString();
    }
}
