package redmopag.leetcode.solutions;

import java.util.AbstractList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */

public class FizzBuzz {
    public List<String> fizzBuzz(int n){
        // Создание нового списка - создаётся автоматически
        // Нужно только переопределить метод, ответственный за создание объектов в списке
        // И метод, ответственный на настройку размера списка
        return new AbstractList<>() {
            // Метод, создающий объекты
            @Override
            public String get(int n) {
                n++;
                if (n % 3 == 0) {
                    if (n % 5 == 0) {
                        return "FizzBuzz";
                    }
                    return "Fizz";
                }
                if (n % 5 == 0) {
                    return "Buzz";
                }
                return String.valueOf(n);
            }

            // Метод, настраивающий размер списка
            @Override
            public int size() {
                return n;
            }
        };
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(3));
    }
}
