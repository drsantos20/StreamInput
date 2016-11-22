package com.stream.StreamInput;

public class StreamExecutionTest {

   public static void main(String[] args) {

      String[] empty = { "    P" };
      StreamExecution.main(empty);

      String[] numbers = { "111111110" };
      StreamExecution.main(numbers);

      String[] equals = { "99999" };
      StreamExecution.main(equals);

      String[] cases = { "aaAAaaAAaaB" };
      StreamExecution.main(cases);
      
      String[] specialChars = { "!!!#$@^&" };
      StreamExecution.main(specialChars);

   }
}
