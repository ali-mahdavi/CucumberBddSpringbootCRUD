package com.opsict.mockitobdd;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
class MathApplicationTest {
    private MathApplication mathApplication;
    private CalculatorService calculatorService;



    @BeforeEach
    void setUp() {
        mathApplication=new MathApplication();
        calculatorService=mock(CalculatorService.class);
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    void add() {
        //Given
        given(calculatorService.add(20.0,10.0)).willReturn(30.0);

        //when
        double result = calculatorService.add(20.0,10.0);

        //then
        assertEquals(result,30.0);
    }
}
