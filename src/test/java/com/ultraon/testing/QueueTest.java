package com.ultraon.testing;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * @author Quinn Liu(quinnliu@vt.edu)
 */
public class QueueTest {
    private Queue<Integer> queue;

    @Before
    public void setUp() {
        this.queue = new Queue<>(4);
    }

    @Test
    public void test_enqueue() {
        this.queue.enqueue(101);
        assertEquals(1, this.queue.length());
        assertEquals(101, (int) this.queue.frontValue());
        this.queue.enqueue(102);
        this.queue.enqueue(103);
        this.queue.enqueue(104);
        assertEquals(4, this.queue.length());
        assertEquals(101, (int) this.queue.frontValue());

        try {
            this.queue.enqueue(105);
        } catch (Exception e) {
            assertEquals("Bounded queue is full at size = 4. Call dequeue() " +
                    "before recalling enqueue()", e.getMessage());
        }
    }

    @Test
    public void test_dequeue() {
        try {
            this.queue.dequeue();
        } catch (Exception e) {
            assertEquals("Bounded queue is currently empty. Call enqueue() " +
                    "before dequeue()", e.getMessage());
        }

        this.queue.enqueue(101);
        this.queue.enqueue(102);
        this.queue.enqueue(103);
        this.queue.enqueue(104);
        assertEquals(4, this.queue.length());
        assertEquals(101, (int) this.queue.frontValue());
        this.queue.dequeue();
        assertEquals(3, this.queue.length());
        assertEquals(102, (int) this.queue.frontValue());
        this.queue.dequeue();
        assertEquals(2, this.queue.length());
        assertEquals(103, (int) this.queue.frontValue());
        this.queue.dequeue();
        assertEquals(1, this.queue.length());
        assertEquals(104, (int) this.queue.frontValue());
        this.queue.dequeue();
        assertEquals(0, this.queue.length());
        assertNull(this.queue.frontValue());
    }

    @Test
    public void test_frontValue() {
        assertNull(this.queue.frontValue());
        this.queue.enqueue(1);
        this.queue.enqueue(2);
        assertEquals(1, (int) this.queue.frontValue());
        this.queue.dequeue();
        assertEquals(2, (int) this.queue.frontValue());
    }
}
