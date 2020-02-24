// Reversing a string manually with customized logic!

import java.util.Scanner;

public class StringRev{
    public static void main(String[] args) {
        String s = reverse("Thony");
        System.out.println(s);

      }

    public static String reverse(String st) {



      char [] letters = new char [st.length()];

      int letterIndex = 0;

      for (int i = st.length() - 1; i  >= 0; i--){
        letters[letterIndex] = st.charAt(i);
        letterIndex ++;
      }

      String reverse = "";
      for(int i = 0; i < st.length(); i++){
        reverse = reverse + letters[i];
      }
      return reverse;
    }


}
