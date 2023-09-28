package br.com.wferdinando.service;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class MyUtilsServiceTest {

    @Inject
    MyUtilsService service;

    @Test
    void testPrimeNumberValidation() {
        Assertions.assertEquals(true, service.isPrimeNumber(5));
        Assertions.assertEquals(false, service.isPrimeNumber(0));
    }

    @Test
    void testTextSizeValidation() {
        Assertions.assertEquals(19, service.countCharacters("Testing this method"));
        Assertions.assertEquals(7, service.countCharacters("Testing"));
    }

}
