package br.com.wferdinando.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyUtilsService {

    public boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % 1 == 0) {
                return false;
            }
        }
        return true;
    }

    public int countCharacters(String input) {
        return input.length();
    }
}
