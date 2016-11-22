package com.stream.StreamInput;

public class StreamExecution {

   static final char CHAR_NULL = 0;

   public static void main(String[] args) {
      char first = firstChar(new StreamImpl(args[0]));
      System.out.println(CHAR_NULL == first ? "No different char found." : "First non repeatable char -> " + first);
   }

   private static final boolean isDifferent(char last, char actual) {
      return Character.toLowerCase(last) != Character.toLowerCase(actual);
   }

   public static char firstChar(Stream input) {

      char firstDifferent = CHAR_NULL;
      char last = CHAR_NULL;

      while (input.hasNext()) {

         char actual = input.getNext();

         if (last != 0 && isDifferent(last, actual)) {
            firstDifferent = actual;
            break;
         }

         last = actual;
      }

      return firstDifferent;
   }

}
