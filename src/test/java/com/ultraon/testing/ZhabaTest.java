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
        Truth.assertThat(reversal.reverse()).isNotNull();
    }

    @Test
    public void testOneLetter() {
        final Reversal reversal = new Reversal();
        
    }
}
