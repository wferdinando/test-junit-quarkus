package br.com.wferdinando.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.wferdinando.util.CalcUtils;

@ApplicationScoped
public class MyUtilsService {

    @Inject
    CalcUtils calcUtils;

    public boolean isPrimeNumber(int number) {
        return calcUtils.verifyPrimeNumber(number);
    }

    public int countCharacters(String input) {
        return input.length();
    }
}
