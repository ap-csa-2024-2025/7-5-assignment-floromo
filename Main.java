import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String[] arr1 = {"forest", "apple", "willow", "lake", "trees"};
    sortAndPrintDescending(arr1);
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(6);
    list.add(4);
    list.add(7);
    selectSortDescending(list);
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
    for (int i = 0; i < list.size(); i++){
      int maxInt = i;
      Integer max = list.get(i);
      for (int j = i; j < list.size(); j++){
        if (list.get(j) > list.get(maxInt)){
          maxInt = j;
          max = list.get(j);
        }
      }
      list.remove(maxInt);
      list.add(i, max);
    }
    for (Integer n : list){
      System.out.print(n + " ");
    }
  }
}
