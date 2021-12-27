package ru.ssau.tk.kmaster.practice.Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.ssau.tk.kmaster.practice.Tasks.MyArrays.*;

public class MyArraysTest {

    public static final double DELTA = 0.0001;

    @Test
    public static void testSize() {
        Assert.assertEquals(size(13).length, 13);
        Assert.assertEquals(size(1).length, 1);
        Assert.assertEquals(size(0).length, 0);
    }

    @Test
    public static void testGenerator() {
        Assert.assertEquals(generator(4)[0], 2);
        Assert.assertEquals(generator(4)[1], 1);
        Assert.assertEquals(generator(4)[2], 1);
        Assert.assertEquals(generator(4)[3], 2);
    }

    @Test
    public static void testOddArray() {
        Assert.assertEquals(oddArray(7)[0], 1);
        Assert.assertEquals(oddArray(7)[1], 3);
        Assert.assertEquals(oddArray(7)[2], 5);
        Assert.assertEquals(oddArray(7)[3], 7);
        Assert.assertEquals(oddArray(7)[4], 9);
        Assert.assertEquals(oddArray(7)[5], 11);
        Assert.assertEquals(oddArray(7)[6], 13);
    }

    @Test
    public static void testEvenArray() {
        Assert.assertEquals(evenArray(7)[0], 2);
        Assert.assertEquals(evenArray(7)[1], 4);
        Assert.assertEquals(evenArray(7)[2], 6);
        Assert.assertEquals(evenArray(7)[3], 8);
        Assert.assertEquals(evenArray(7)[4], 10);
        Assert.assertEquals(evenArray(7)[5], 12);
        Assert.assertEquals(evenArray(7)[6], 14);
    }

    @Test
    public static void testFibonacciNumbers() {
        Assert.assertEquals(fibonacciNumbers(8)[0], 0);
        Assert.assertEquals(fibonacciNumbers(8)[1], 1);
        Assert.assertEquals(fibonacciNumbers(8)[2], 1);
        Assert.assertEquals(fibonacciNumbers(8)[3], 2);
        Assert.assertEquals(fibonacciNumbers(8)[4], 3);
        Assert.assertEquals(fibonacciNumbers(8)[5], 5);
        Assert.assertEquals(fibonacciNumbers(8)[6], 8);
        Assert.assertEquals(fibonacciNumbers(8)[7], 13);
    }

    @Test
    public static void testSquareOfNumbers() {
        Assert.assertEquals(squareOfNumbers(10)[0], 0);
        Assert.assertEquals(squareOfNumbers(10)[1], 1);
        Assert.assertEquals(squareOfNumbers(10)[2], 4);
        Assert.assertEquals(squareOfNumbers(10)[3], 9);
        Assert.assertEquals(squareOfNumbers(10)[4], 16);
        Assert.assertEquals(squareOfNumbers(10)[5], 25);
        Assert.assertEquals(squareOfNumbers(10)[6], 36);
        Assert.assertEquals(squareOfNumbers(10)[7], 49);
        Assert.assertEquals(squareOfNumbers(10)[8], 64);
        Assert.assertEquals(squareOfNumbers(10)[9], 81);
    }

    @Test
    public static void testQuadraticEquation() {
        double[] emptyArray = {};
        Assert.assertEquals(quadraticEquation(2, 3, 4), new double[0]);
        Assert.assertEquals(quadraticEquation(0, 3, 4)[0], -1.3333, DELTA);
        Assert.assertEquals(quadraticEquation(2, 8, 2)[0], -0.2679, DELTA);
        Assert.assertEquals(quadraticEquation(2, 8, 2)[1], -3.7320, DELTA);
        Assert.assertEquals(quadraticEquation(0, 0, 0)[0], Double.NaN);
    }

    @Test
    public static void testArrayWithoutTriples() {
        Assert.assertEquals(arrayWithoutTriples(7)[0], 1);
        Assert.assertEquals(arrayWithoutTriples(7)[1], 2);
        Assert.assertEquals(arrayWithoutTriples(7)[2], 4);
        Assert.assertEquals(arrayWithoutTriples(7)[3], 5);
        Assert.assertEquals(arrayWithoutTriples(7)[4], 7);
        Assert.assertEquals(arrayWithoutTriples(7)[5], 8);
        Assert.assertEquals(arrayWithoutTriples(7)[6], 10);
    }

    @Test
    public static void testArithmeticProgression() {
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[0], 1);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[1], 4);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[2], 7);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[3], 10);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[4], 13);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[5], 16);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[6], 19);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[7], 22);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[8], 25);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[9], 28);
    }

    @Test
    public static void testGeometricProgression() {
        Assert.assertEquals(geometricProgression(1, 4, 5)[0], 1);
        Assert.assertEquals(geometricProgression(1, 4, 5)[1], 4);
        Assert.assertEquals(geometricProgression(1, 4, 5)[2], 16);
        Assert.assertEquals(geometricProgression(1, 4, 5)[3], 64);
        Assert.assertEquals(geometricProgression(1, 4, 5)[4], 256);
    }

    @Test
    public static void testDivisorOfNumber() {
        Assert.assertEquals(divisorOfNumber(36).get(0), Integer.valueOf(1));
        Assert.assertEquals(divisorOfNumber(36).get(1), Integer.valueOf(2));
        Assert.assertEquals(divisorOfNumber(36).get(2), Integer.valueOf(3));
        Assert.assertEquals(divisorOfNumber(36).get(3), Integer.valueOf(4));
        Assert.assertEquals(divisorOfNumber(36).get(4), Integer.valueOf(6));
    }

    @Test
    public static void testIsItSimple() {
        Assert.assertTrue(isItSimple(11));
        Assert.assertFalse(isItSimple(4));
        Assert.assertTrue(isItSimple(13));
        Assert.assertTrue(isItSimple(17));
        Assert.assertFalse(isItSimple(12));
        Assert.assertFalse(isItSimple(9));
    }

    @Test
    public static void testPrimeNumbers() {
        Assert.assertEquals(primeNumbers(18).get(0), Integer.valueOf(2));
        Assert.assertEquals(primeNumbers(18).get(1), Integer.valueOf(3));
        Assert.assertEquals(primeNumbers(18).get(2), Integer.valueOf(5));
        Assert.assertEquals(primeNumbers(18).get(3), Integer.valueOf(7));
        Assert.assertEquals(primeNumbers(18).get(4), Integer.valueOf(11));
    }

    @Test
    public static void testSymmetry() {
        Assert.assertEquals(symmetry(7)[0], 1);
        Assert.assertEquals(symmetry(7)[1], 2);
        Assert.assertEquals(symmetry(7)[2], 3);
        Assert.assertEquals(symmetry(7)[3], 4);
        Assert.assertEquals(symmetry(7)[4], 3);
        Assert.assertEquals(symmetry(7)[5], 2);
        Assert.assertEquals(symmetry(7)[6], 1);

        Assert.assertEquals(symmetry(5)[0], 1);
        Assert.assertEquals(symmetry(5)[1], 2);
        Assert.assertEquals(symmetry(5)[2], 3);
        Assert.assertEquals(symmetry(5)[3], 2);
        Assert.assertEquals(symmetry(5)[4], 1);
    }

    @Test
    public static void testOppositeSign() {
        double[] array = new double[]{1.7, -3, 4, -21.3, 2};
        oppositeSign(array);
        Assert.assertEquals(array, new double[]{-1.7, 3, -4, 21.3, -2});
    }
}
