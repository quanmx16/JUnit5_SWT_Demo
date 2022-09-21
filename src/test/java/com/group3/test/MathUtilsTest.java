package com.group3.test;

import com.group3.InvalidValueException;
import com.group3.Utils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    // True argument test
//    @Test
//    public void testRightArgumentAndReturnsGoodResult() {
//        assertEquals(1, Utils.getFibonacci(1));
//    }
//
//    @Test
//    public void testRightArgumentAndReturnsGoodResult2() {
//        assertEquals(1, Utils.getFibonacci(2));
//    }
//
//    @Test
//    public void testRightArgumentAndReturnsGoodResult3() {
//        assertEquals(2, Utils.getFibonacci(3));
//    }
//
//    @Test
//    public void testRightArgumentAndReturnsGoodResult4() {
//        assertEquals(3, Utils.getFibonacci(4));
//    }

    //Data Driven Testing
//    public static Integer[][] initData() {
//        Integer[][] result = {
//                {1, 1},
//                {2, 1},
//                {3, 2},
//                {4, 3},
//                {5, 5}
//        };
//        return result;
//    }
//
//    @ParameterizedTest
//    @MethodSource(value = "initData")
//    public void testRightDriventArgumentsAndReturnGoodResult(int caseValue, int expected) {
//        assertEquals(expected, Utils.getFibonacci(caseValue));
//    }

    //Data for test wrong arguments and throwing exception
//    public static Integer[] initData() {
//        Integer[] result = {-10, -2, 0, -1000};
//        return result;
//    }
//
////    Exception test
//    @ParameterizedTest
//    @MethodSource(value = "initData")
//    public void testWrongDataAndThrowException(int testCase) {
//        assertThrows(InvalidValueException.class, () -> Utils.getFibonacci(testCase));
//    }


    //Remain original data in test
//    public static Integer[][] originalData = {
//            {1, 1}, //0
//            {2, 1}, //1
//            {3, 2}, //2
//            {4, 3}  //3
//    };
//
//    public static Integer[][] initData() {
//        return originalData;
//    }
//
//    public static void printOriginalData(String msg) {
//        Integer[][] data = originalData;
//        System.out.println(msg);
//        for (int i = 0; i < data.length; i++) {
//            System.out.println("case: " + data[i][0] + ", expected: " + data[i][1]);
//        }
//    }
//
//    public static Integer[][] backupData;
//
//    @BeforeAll
//    public static void beforeTest() {
//        printOriginalData("Before All Tests: ");
//        backupData = new Integer[originalData.length][2];
//        for (int i = 0; i < originalData.length; i++) {
//            backupData[i][0] = originalData[i][0];
//            backupData[i][1] = originalData[i][1];
//        }
//        originalData[3][0] = 5;
//        originalData[3][1] = 5;
//    }
//
//    @ParameterizedTest
//    @MethodSource(value = "initData")
//    public void testRightDriventArgumentsAndReturnGoodResult(int caseValue, int expected) {
//        System.out.println("Test data: case: " + caseValue + ", expected: " + expected);
//        System.out.println();
//        assertEquals(expected, Utils.getFibonacci(caseValue));
//    }
//
//    @AfterAll
//    public static void afterAllTest() {
//        originalData = backupData;
//        printOriginalData("After All Tests: ");
//    }


}
