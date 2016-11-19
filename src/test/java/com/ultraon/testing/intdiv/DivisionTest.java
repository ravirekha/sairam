package com.ultraon.testing.intdiv;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;


/**
 * Unit tetst for {@link Division}.
 */
public class DivisionTest {
    private static final int DIVIDEND = 10;
    private static final int DIVIDER = 2;

    @Test
    public void testComposeDivisionOutput() throws Exception {
        final Division sut = new Division(DIVIDEND, DIVIDER);
        assertThat(sut.composeDivisionOutput()).isEqualTo(OUTPUT_10_2);
    }

    @Test(expected = ArithmeticException.class)
    public void testComposeDivisionNullDivider() throws Exception {
        final Division sut = new Division(DIVIDEND, 0);
        sut.composeDivisionOutput();
    }

    @Test
    public void testComposeDivisionOutputWithReminder() throws Exception {
        final Division sut = new Division(10, 3);
        assertThat(sut.composeDivisionOutput()).isEqualTo(OUTPUT_10_3);
    }


    @Test
    public void testComposeDivisionOutputNullDividend() throws Exception {
        final Division sut = new Division(0, DIVIDER);
        assertThat(sut.composeDivisionOutput()).isEqualTo(OUTPUT_0_2);
    }

    @Test
    public void testComposeDivisionOutputMaxDivider() throws Exception {
        final Division sut = new Division(DIVIDEND, Integer.MAX_VALUE);
        assertThat(sut.composeDivisionOutput()).isEqualTo(OUTPUT_10_MAX);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testComposeDivisionOutputMaxDividend() throws Exception {
        final Division sut = new Division(Integer.MAX_VALUE, DIVIDER);
        assertThat(sut.composeDivisionOutput()).isEqualTo(OUTPUT_10_MAX_2);
    }

    @Test
    public void testComposeDivisionOutputMinDivider() throws Exception {
        final Division sut = new Division(DIVIDEND, Integer.MIN_VALUE);
        assertThat(sut.composeDivisionOutput()).isEqualTo(OUTPUT_10_MIN_2);
    }

    @Test
    public void testComposeDivisionOutputMinDividend() throws Exception {
        final Division sut = new Division(Integer.MIN_VALUE, DIVIDER);
        assertThat(sut.composeDivisionOutput()).isEqualTo(OUTPUT_10_MIN);
    }


    @Test
    public void testGetDividend() throws Exception {
        final Division sut = new Division(DIVIDEND, DIVIDER);
        assertThat(sut.getDividend()).isEqualTo(DIVIDEND);
    }

    @Test
    public void testGetDivider() throws Exception {
        final Division sut = new Division(DIVIDEND, DIVIDER);
        assertThat(sut.getDivider()).isEqualTo(DIVIDER);
    }


    private static final String OUTPUT_10_2 = " 10 |2\n" +
            "-   -----\n" +
            " 10 |5\n" +
            " __\n" +
            "  0\n";

    private static final String OUTPUT_0_2 = " 0 |2\n" +
            "-  -----\n" +
            " 0 |0\n" +
            " _\n" +
            " 0\n";

    private static final String OUTPUT_10_MAX = " 10 |2147483647\n" +
            "-   -----\n" +
            " 0  |0.0000000000\n" +
            "          _\n" +
            " 1215752192\n";

    private static final String OUTPUT_10_MAX_2 = "  10 |-2147483648\n" +
            "-   -----\n" +
            " 0  |0.0000000000\n" +
            "          _\n" +
            " 1215752192\n";

    private static final String OUTPUT_10_3 =" 10 |3\n"+
            "-   -----\n"+
            " 9  |3.(3)\n"+
            "  _\n"+
            "  10\n"+
            " -\n"+
            "   9\n"+
            "  __\n"+
            "   1\n";

    private static final String OUTPUT_10_MIN = "--2147483648 |2\n" +
            "-           -----\n" +
            " -8         |-1073741824\n" +
            " _\n" +
            " 0\n";

    private static final String OUTPUT_10_MIN_2 = " 10 |-2147483648\n"+
            "-   -----\n"+
            " 0  |0.0000000000\n"+
            "          _\n"+
            " 1215752192\n";
}