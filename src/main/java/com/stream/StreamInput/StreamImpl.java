package com.stream.StreamInput;

import java.util.ArrayList;
import java.util.List;

public class StreamImpl implements Stream {

   private int lastIndex = -1;

   private String input;

   private List<Character> charRead;

   public boolean hasNext() {

      try {
         input.charAt(lastIndex + 1);
         return true;
      }
      catch (IndexOutOfBoundsException ex) {
      }

      return false;
   }

   public StreamImpl(String input) {
      this.input = input;
      charRead = new ArrayList<Character>(1);
   }

   public char getNext() {
      char next = input.charAt(++lastIndex);
      charRead.add(next);
      return next;
   }

}
