import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author :Sai
 */
class Set {
  //your code goes here...
  //Good luck :-
  /**
   * Declaring an integer list.
  */
  private int[] list;
  /**
   * Declarint the size of set.
   */
  private int size;
  /**
   * This is to remove the magic number error.
   */
  private static final int TEN = 10;
  /**
   * Constructs the object.
  */
  Set() {
    list = new int[TEN];
    size = 0;
  }
  /**
   * Size function.
   *
   * @return     { description_of_the_return_value }
   */
  public int size() {
    return size;
  }
  /**
   * Contains function.
   *
   * @param      item  The item
   *
   * @return     { description_of_the_return_value }
   */
  public boolean contains(final int item) {
    for (int a : list) {
      if (a == item) {
        return true;
      }
    }
    return false;
  }
  /**
   * Returns a string representation of the object.
   *
   * @return     String representation of the object.
   */
  public String toString() {
    if (size == 0) {
      return "{}";
    }
    String str = "{";
    int i = 0;
    for (i = 0; i < size - 1; i++) {
      str = str + list[i] + ", ";
    }
    str = str + list[i] + "}";
    return str;
  }
  /**
   * Add an element function.
   *
   * @param      item  The item
   */
  public void add(final int item) {
    if (size > (list.length / 2)) {
      list = resize();
    }
    if (size == 0) {
      list[size] = item;
      size += 1;
    } else {
      if (!contains(item)) {
        list[size] = item;
        size += 1;
      }
    }
  }
  /**
   * Resize function.
   *
   * @return     { description_of_the_return_value }
   */
  private int[] resize() {
    int[] list1 = new int[size * 2];
    for (int i = 0; i < size; i++) {
      list1[i] = list[i];
    }
    return list1;
  }
  /**
   * Adds an list to set.
   *
   * @param      a     { parameter_description }
   */
  public void add(final int[] a) {
    for (int b : a) {
      add(b);
    }
  }
  /**
   * Intersection function.
   *
   * @param      a     { parameter_description }
   *
   * @return     { description_of_the_return_value }
   */
  public Set intersection(final Set a) {
    // System.out.println(a.size());
    if (size == 0 || a.size() == 0) {
      Set b = new Set();
      return b;
    }
    Set b = new Set();
    for (int i = 0; i < size; i++) {
      // System.out.println(c);
      // System.out.println(contains(c));
      int c = list[i];
      if (a.contains(c)) {
        // System.out.println(c);
        b.add(c);
        // System.out.println(b.size());
      }
    }
    if (b.size() == 0) {
      Set d = new Set();
      return d;
    } else {
      return b;
    }
  }
  /**
   * Retains all.
   *
   * @param      a     { parameter_description }
   *
   * @return     { description_of_the_return_value }
   */
  public Set retainAll(final int[] a) {
    Set b = new Set();
    for (int i = 0; i < size; i++) {
      for (int i1 = 0; i1 < a.length; i1++) {
        if (list[i] == a[i1]) {
           b.add(a[i1]);
        }
      }
    }
    return b;
  }

  /**
   * Cartesian Product.
   *
   * @param      a     { parameter_description }
   *
   * @return     { description_of_the_return_value }
   */
  public int[][] cartesianProduct(final Set a) {
    if (size == 0 || a.size() == 0) {
      return null;
    } else {
      int c = size * a.size();
      // System.out.println(c);
      int[][] b = new int[c][2];
      int i = 0;
      while (i < c) {
        for (int i1 = 0; i1 < size; i1++) {
          for (int i2 = 0; i2 < a.size(); i2++) {
            for (int i3 = 0; i3 < 2; i3++) {
              if (i3 == 0) {
                b[i][i3] = list[i1];
              } else {
                b[i][i3] = a.list[i2];
              }
            }
            // System.out.println(i);
            i += 1;
          }
        }
      }
      return b;
    }

  }

}
/**
 * Solution class for code-eval.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {

  }
  /**
   * helper function to convert string input to int array.
   *
   * @param      s     { string input from test case file }
   *
   * @return     { int array from the given string }
   */
  public static int[] intArray(final String s) {
    String input = s;
    if (input.equals("[]")) {
      return new int[0];
    }
    if (s.contains("[")) {
      input = s.substring(1, s.length() - 1);
    }
    return Arrays.stream(input.split(","))
           .mapToInt(Integer::parseInt)
           .toArray();
  }
  /**
   * main function to execute test cases.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    // instantiate this set
    Set s = new Set();
    // code to read the test cases input file
    Scanner stdin = new Scanner(new BufferedInputStream(System.in));
    // check if there is one more line to process
    while (stdin.hasNext()) {
      // read the line
      String line = stdin.nextLine();
      // split the line using space
      String[] tokens = line.split(" ");
      // based on the list operation invoke the corresponding method
      switch (tokens[0]) {
      case "size":
        System.out.println(s.size());
        break;
      case "contains":
        System.out.println(s.contains(Integer.parseInt(tokens[1])));
        break;
      case "print":
        System.out.println(s);
        break;
      case "add":
        int[] intArray = intArray(tokens[1]);
        if (intArray.length == 1) {
          s.add(intArray[0]);
        } else {
          s.add(intArray);
        }
        break;
      case "intersection":
        s = new Set();
        Set t = new Set();
        intArray = intArray(tokens[1]);
        s.add(intArray);
        intArray = intArray(tokens[2]);
        t.add(intArray);
        System.out.println(s.intersection(t));
        break;
      case "retainAll":
        s = new Set();
        intArray = intArray(tokens[1]);
        s.add(intArray);
        intArray = intArray(tokens[2]);
        System.out.println(s.retainAll(intArray));
        break;
      case "cartesianProduct":
        s = new Set();
        t = new Set();
        intArray = intArray(tokens[1]);
        s.add(intArray);
        intArray = intArray(tokens[2]);
        t.add(intArray);
        System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
        break;
      default:
        break;
      }
    }
  }
}









