package TaskSixPelle;
/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 * 
 */
public class Oops {
    public static void main(String[] args) {
      int a = 7, b = 42;
      int smaller = minimum(a,b);
      if (smaller == a) {
        System.out.println(smaller + " is the smallest!");
      }
    }
    public static int minimum(int a, int b) {
      int smaller;
      
      if (a < b) {
        smaller = a;
      }
      else {
        smaller = b;
      }
      return smaller;
    }
  }