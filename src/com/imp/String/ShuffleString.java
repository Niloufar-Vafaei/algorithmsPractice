package com.imp.String;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {

      char[] shuffled =new char[s.length()];
      for(int i=0;i<indices.length;i++){
         shuffled [indices[i]]=s.charAt(i);
      }

        return String.valueOf(shuffled);

    }
}
