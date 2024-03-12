// 2)write a java code to find the maximum element in array.
import java.util.* ;
public class max_Element_in_array
  {
    static void sorting(int[] arr, int n)
    {
      int temp = 0;
      for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-i-1;j++)
            {
              if(arr[j] > arr[j+1])
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
      System.out.println("Enter Array Size : ");
      int n = sc.nextInt();
      System.out.println("Enter elements of the Array : ");
      int arr[] = new int[n+1];
      for(int i=0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
      sorting(arr,n);
      System.out.println("Maximum element in the array is : " + arr[n-1]);
    }
  }
                            
                
