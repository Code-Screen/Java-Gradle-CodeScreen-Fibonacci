/*
 * Hidden test cases for FibonacciCalculator.
 */
package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciCalculatorHiddenTest {

    @Test void testHidden1() {
        assertEquals(377, FibonacciCalculator.calculate(14));
    }

    @Test void testHidden2() {
        assertEquals(610, FibonacciCalculator.calculate(15));
    }

    @Test void testHidden3() {
        assertEquals(2584, FibonacciCalculator.calculate(18));
    }

    @Test void testHidden4() {
        assertEquals(4181, FibonacciCalculator.calculate(19));
    }

}
