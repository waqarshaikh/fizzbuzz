package co.incubyte;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NumberShould {


  private DbLogger dbLogger;

  @BeforeEach
  void setUp() {;
    dbLogger = Mockito.mock(DbLogger.class);
  }


  @Test
  void should_return_number_string_representation() {
    Number one = new Number(1, dbLogger);
    String resultForOne = one.convertToFizzBuzz();
    assertEquals("1", resultForOne);
    verify(dbLogger).logNumber();

    Number three = new Number(3, dbLogger);
    String resultForThree = three.convertToFizzBuzz();
    assertEquals("Fizz", resultForThree);
    verify(dbLogger).logFizz();

    Number five = new Number(5, dbLogger);
    String resultForFive = five.convertToFizzBuzz();
    assertEquals("Buzz", resultForFive);
    verify(dbLogger).logBuzz();

    Number fifteen = new Number(15, dbLogger);
    String resultForFifteen = fifteen.convertToFizzBuzz();
    assertEquals("FizzBuzz", resultForFifteen);
    verify(dbLogger).logFizzBuzz();

  }


}
