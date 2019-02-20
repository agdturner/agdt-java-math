/**
 * Copyright 2010 Andy Turner, The University of Leeds, UK
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package uk.ac.leeds.ccg.andyt.math;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author geoagdt
 */
public class Math_intTest {

    public Math_intTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isEven method, of class Math_int.
     */
    @Test
    public void testIsEven() {
        System.out.println("isEven");
        System.out.println("isEven(x)");
        int x;
        boolean expResult;
        boolean result;
        // Test 1
        System.out.println("Test 1");
        x = 1;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 2
        System.out.println("Test 2");
        x = 2;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 3
        System.out.println("Test 3");
        x = 3;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 4
        System.out.println("Test 4");
        x = 4;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 5
        System.out.println("Test 5");
        x = 5;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 6
        System.out.println("Test 6");
        x = 6;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 7
        System.out.println("Test 7");
        x = 7;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 8
        System.out.println("Test 8");
        x = 8;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 9
        System.out.println("Test 9");
        x = 9;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 10
        System.out.println("Test 10");
        x = 0;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 11
        System.out.println("Test 11");
        x = -1;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 12
        System.out.println("Test 12");
        x = -2;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 13
        System.out.println("Test 13");
        x = -3;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 14
        System.out.println("Test 14");
        x = -4;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 15
        System.out.println("Test 15");
        x = -5;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 16
        System.out.println("Test 16");
        x = -6;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 17
        System.out.println("Test 17");
        x = -7;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 18
        System.out.println("Test 18");
        x = -8;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 19
        System.out.println("Test 19");
        x = -9;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 20
        System.out.println("Test 20");
        x = 123456789;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 21
        System.out.println("Test 21");
        x = 12345678;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 22
        System.out.println("Test 22");
        x = -123456789;
        expResult = false;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
        // Test 23
        System.out.println("Test 23");
        x = -12345678;
        expResult = true;
        result = Math_long.isEven(x);
        printTestIsEven(x, result);
        assertEquals(expResult, result);
    }

    /**
     * For printing details of testIsEven() tests
     *
     * @param x
     * @param result
     */
    private void printTestIsEven(int x, boolean result) {
        System.out.println("x " + x);
        System.out.println("result " + result);
    }

    /**
     * Test of isInt method, of class Math_int.
     */
    @Test
    public void testIsInt() {
        System.out.println("isInt");
        // Test 1
        long l = Math_long.INTEGER_MAX_VALUE + 1;
        String s = Long.toString(l);
        boolean r;
        r = Math_int.isInt(s);
        assertFalse(r);
        // Test 2
        l --;
        s = Long.toString(l);
        r = Math_int.isInt(s);
        assertTrue(r);
    }
    
    
}