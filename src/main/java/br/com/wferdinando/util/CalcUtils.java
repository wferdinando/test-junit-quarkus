package br.com.wferdinando.util;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalcUtils {

    public boolean verifyPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
