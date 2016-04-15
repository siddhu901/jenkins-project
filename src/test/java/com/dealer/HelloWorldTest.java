package com.dealer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by siddhartha.kakarla on 4/15/16.
 */
public class HelloWorldTest {

    @Test
    public void testCreateMessage() throws Exception {
        assertEquals("Hello World!",HelloWorld.CreateMessage());
    }
}