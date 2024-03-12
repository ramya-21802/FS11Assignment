// 1) write a java code for sorting an array, and find number of occurrences of a particular number in java
import java.util.* ;
public class SortArray
{
  static void sort(int[] arr, int n)
  {
    int temp = 0;
    for(int i=0;i<n-1;i++)
      {
        for(int j=1;j<n-i-1;j++)
          {
            if(arr[j-1] >arr[j])
            {
              temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }
          }
       }
    }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array size : ");
    int n = sc.nextInt();
    System.out.println("Enter the array elements : ");
    int arr[] = new int[n+1];
    for(int i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
      }
    System.out.println("Enter a number : ");
    int num = sc.nextInt();
    sort(arr,n);
    System.out.println("Sorted Array is :");
    for(int i=0;i<n;i++)
      {
        System.out.println(arr[i] + " ");
      }
    System.out.println();
    int cnt = 0;
    for(int i=0;i<n;i++)
      {
        if(arr[i] > num)
        break;
        if(arr[i] == num)
        cnt += 1;
      }
        System.out.println("Number of Occurrences : " + cnt);
  }
}
