import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import redmopag.leetcode.solutions.FizzBuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionsTest {
    @ParameterizedTest
    @MethodSource("fizzBuzzGenerateData")
    public void fizzBuzzTest(int n, List<String> answer){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(answer, fizzBuzz.fizzBuzz(n));
    }
    static Stream<Arguments> fizzBuzzGenerateData(){
        return Stream.of(
                Arguments.of(3, Arrays.asList("1","2","Fizz")),
                Arguments.of(5, Arrays.asList("1","2","Fizz","4","Buzz")),
                Arguments.of(15, Arrays.asList("1","2","Fizz","4","Buzz",
                        "Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"))
        );
    }


}
