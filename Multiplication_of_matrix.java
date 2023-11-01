public class matrix
  {
    static void main(String args[])
    {
      int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
      int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
      int c[][]=new int[arr.length][arr1[0].length];
      int sum=0;
      for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr1[0].length;j++)
            {
            for(int j1=0;j1<arr1.length;j1++)
              {
                sum+=arr[i][j1]*arr1[j1][j];
              }
            c[i][j]=sum;
            sum=0;
          }
        }
    }
  }
