package com.ultraon.testing;

import com.sun.istack.internal.NotNull;

/**
 * Created by vitaliypopov on 19/11/16.
 */
public class Reversal {
    public String reverse(final @NotNull String input) {
        final char[] chars = input.toCharArray();
        final StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0 ; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
