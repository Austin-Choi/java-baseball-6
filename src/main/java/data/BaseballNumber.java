package data;

import camp.nextstep.edu.missionutils.Console;
import utility.BaseballNumberChecker;

import java.util.ArrayList;
import java.util.List;

public class BaseballNumber {
    protected List<Integer> numbers = null;
    protected String input = null;
    protected final static int MAX_NUMBER_LENGTH = 3;

    public BaseballNumber() throws IllegalArgumentException{

    }
    public List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for(int number : this.numbers)
            numbers.add(number);
        return numbers;
    }

    public void print() {
        for(int number : this.numbers)
            System.out.print(number);
        System.out.println();
    }
}
