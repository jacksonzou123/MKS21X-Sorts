import java.util.Random;

public class Sorts{
  public static void selectionSort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
      int index = i;
      for (int j = i; j < ary.length; j++) {
        if (ary[j] < ary[index]) {
          index = j;
        }
      }
      int hold = ary[i];
      ary[i] = ary[index];
      ary[index] = hold;
    }
  }

  public static void main(String[] args) {
    Random rand = new Random();
    int[] array = new int[Integer.parseInt(args[0])];
    for (int i = 0; i < array.length; i++) {
      array[i] = Math.abs(rand.nextInt() % 100);
    }
    toString(array);
    Sorts.selectionSort(array);
    toString(array);
  }

  public static void toString(int[] ary) {
    String f = "[";
    for (int i = 0; i < ary.length; i++) {
      f += ary[i] + ", ";
    }
    f = f.substring(0, f.length() - 2) + "]";
    System.out.println(f);
  }
}
