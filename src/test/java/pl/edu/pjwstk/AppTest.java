package pl.edu.pjwstk;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


public class AppTest
{
    private static App sut;

    @BeforeEach
    void setUp(){
         sut = new App();
    }

    @AfterEach
    void tearDown(){
        sut = null;
    }

    @Test
    @DisplayName("3 Should return 'Fizz'")
    public void test_Fizz_Buzz_3ShouldReturnFizz() {
        assertThat(sut.play(3), equalTo("Fizz"));
    }

    @Test
    @DisplayName("5 Should return 'Buzz'")
    public void test_Fizz_Buzz_5ShouldReturnBuzz(){
        assertThat(sut.play(5), equalTo("Buzz"));
    }

    @Test
    @DisplayName("15 Should return 'FizzBuzz'")
    public void test_Fizz_Buzz_15ShouldReturnFizzBuzz(){
        assertThat(sut.play(15), equalTo("FizzBuzz"));
    }

    @Test
    @DisplayName("30 Should return 'FizzBuzz'")
    public void test_Fizz_Buzz_30ShouldReturnFizzBuzz(){
        assertThat(sut.play(30), equalTo("FizzBuzz"));
    }

    @Test
    @DisplayName("Minus int should return exception")
    public void test_Fizz_Buzz_MinusShouldReturnException(){
        assertThatExceptionOfType(Exception.class)
                .isThrownBy(() -> sut.play(-2))
                .withCauseExactlyInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("0 should return exception")
    public void test_Fizz_Buzz_0ShouldReturnException(){
        assertThatExceptionOfType(Exception.class)
                .isThrownBy(() -> sut.play(0))
                .withCauseExactlyInstanceOf(IllegalArgumentException.class);
    }


    @Test
    @DisplayName("10 should not return 'Fizz'")
    public void test_Fizz_Buzz_10ShouldNotReturnFizz(){
        assertThat(sut.play(10), not("Fizz"));
    }

    @Test
    @DisplayName("3 should not return 'Buzz'")
    public void test_Fizz_Buzz_3ShouldNotReturnBuzz(){
        assertThat(sut.play(3), not("Buzz"));
}
    @Test
    @DisplayName("12 should not return 'FizzBuzz'")
    public void test_Fizz_Buzz_12ShouldNotReturnFizzBuzz(){
        assertThat(sut.play(12), not("FizzBuzz"));
}

}
