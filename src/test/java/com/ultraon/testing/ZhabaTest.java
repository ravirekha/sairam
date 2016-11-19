package com.ultraon.testing;

import com.google.common.truth.Truth;

import org.junit.Test;

/**
 * Created by vitaliypopov on 19/11/16.
 */
public class ZhabaTest {
    @Test
    public void testEmptyString() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverse("")).isNotNull();
    }

    @Test
    public void testOneLetter() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverse("a")).isEqualTo("a");
    }

    @Test
    public void testTwoLetters() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverse("ab")).isEqualTo("ba");
    }

    @Test
    public void testOneNonLetter() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverse("1")).isEqualTo("1");
    }

    @Test
    public void testOneLetterAndOneNonLetter() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverse("1a")).isEqualTo("1a");
    }

    @Test
    public void testSeveralLetterAndNonLetter() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverse("abaj1")).isEqualTo("jaba1");
    }
}
