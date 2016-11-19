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
        Truth.assertThat(reversal.reverseWord("")).isNotNull();
    }

    @Test
    public void testOneLetter() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverseWord("a")).isEqualTo("a");
    }

    @Test
    public void testTwoLetters() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverseWord("ab")).isEqualTo("ba");
    }

    @Test
    public void testOneNonLetter() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverseWord("1")).isEqualTo("1");
    }

    @Test
    public void testOneLetterAndOneNonLetter() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverseWord("1a")).isEqualTo("1a");
    }

    @Test
    public void testSeveralLetterAndNonLetter() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverseWord("abaj1")).isEqualTo("jaba1");
    }

    @Test
    public void testSeveralLetterAndSeveralNonLetter() {
        final Reversal reversal = new Reversal();
        Truth.assertThat(reversal.reverseWord("1abaj1")).isEqualTo("1jaba1");
    }

    @Test
    public void testSeveralWords() {
        final Reversal reversal = new Reversal();
        
    }

}
