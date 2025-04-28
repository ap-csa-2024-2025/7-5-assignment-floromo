import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String[] arr1 = {"forest", "apple", "willow", "lake", "trees"};
    sortAndPrintDescending(arr1);
  }


  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void sortAndPrintDescending(String[] arr)
  {
    for (int i = 0; i < arr.length; i++){
      String temp = "";
      for (int j = i+1; j < arr.length; j++){
        if (arr[i].compareTo(arr[j])<0){
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
    for (String n : arr){
      System.out.print(n + " ");
    }
  }

  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void selectSortDescending(ArrayList<Integer> list)
  {
    System.out.println("Implement me!");
  }
}
