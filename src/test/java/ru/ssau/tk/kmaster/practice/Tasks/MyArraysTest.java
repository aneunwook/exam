package ru.ssau.tk.kmaster.practice.Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.ssau.tk.kmaster.practice.Tasks.MyArrays.*;

public class MyArraysTest {

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
}
