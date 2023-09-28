package br.com.wferdinando.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import javax.inject.Inject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.wferdinando.util.CalcUtils;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MyUtilsServiceMockTest {

    @InjectMocks
    private MyUtilsService myUtilsService;

    @Mock
    private CalcUtils calcUtilsMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testVerifyPrimeNumberWithMock(){
        when(calcUtilsMock.verifyPrimeNumber(5)).thenReturn(true);
        when(calcUtilsMock.verifyPrimeNumber(0)).thenReturn(false);

        boolean result1 = myUtilsService.isPrimeNumber(5);
        boolean result2 = myUtilsService.isPrimeNumber(0);

        assertEquals(true, result1);
        assertEquals(false, result2);

    }
}
