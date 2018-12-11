import java.util.Random;

public class Sorts{
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
      int index = i;
      for (int j = i; j < ary.length; j++) {
        if (ary[j] < ary[index]) {
          index = j; //replaces when int checked is less than int stored
        }
      }
      int hold = ary[i];
      ary[i] = ary[index];
      ary[index] = hold; //swaps the indexes
      //toString(ary);
      //print statement to check for intended results
    }
  }

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int index = data.length - 1; index > 0; index-=1) {
      boolean swap = true;
      for (int i = 0; i < index; i++) {
        if (data[i] > data[i+1]) {
          int hold = data[i];
          data[i] = data[i+1];
          data[i+1] = hold;
          swap = false;
        }
        //toString(data); //code checker
      }
      if (swap) {
        index = 0;
      }
    }
  }

  public static void insertionSort(int[] data) {
    for (int i = 1; i < data.length; i++) {
      int hold = data[i];
      int index = i-1;
      while (index >= 0 && data[index] > hold) {
        data[index+1] = data[index];
        index-=1;
      }
      data[index+1] = hold;
    }
  }

  public static void main(String[] args) {
    Random rand = new Random(); //makes random int array with size determined by input
    int[] array = new int[Integer.parseInt(args[0])];
    for (int i = 0; i < array.length; i++) {
      array[i] = Math.abs(rand.nextInt() % 100);
    }
    //toString(array);
    Sorts.insertionSort(array);
    //toString(array);
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
