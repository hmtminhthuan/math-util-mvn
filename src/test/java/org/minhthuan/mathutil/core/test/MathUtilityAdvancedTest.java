/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.minhthuan.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.minhthuan.mathutil.core.MathUtility;

/**
 *
 * @author Minh Thuan
 */
public class MathUtilityAdvancedTest {

    // => Chuẩn bị sẵn riếng data, lát fill vào => DDT
    // Hàm trả về mang 2 chiều, kiểu wrapper class/object
    // mảng chứa các cặp n -> expected
    public static Object[][] initTestData() {
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {5, 120}, 
                               {6, 7200}
                              };
        return testData;
    }

    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        // DDT: DATA DRIVEN TESTING
        // Tham số hóa việc đưa test data vào hàm assertE()
        // biến đổi dữ liệu thành tham số cho tổng quát
        // PARAMETERIZED
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
