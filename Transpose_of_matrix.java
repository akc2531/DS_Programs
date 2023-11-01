public class transpose
  {
    static void main(String args[])
    {
      int arr[][]={{1,2,3},{4,5,6}};
   
      int c[][]=new int[arr[0].length][arr.length];
    
      for(int j=0;j<arr[0].length;j++)
        {
          for(int i=0;i<arr.length;i++)
          {
              c[j][i]=arr[i][j];
          }
        }
    }
  }
