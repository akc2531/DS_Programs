class linear_search
{
    static int main(String args[])
    {
         int arr[]={1,2,3};//Input
   
         int key=3;//Input
         int i=0;
      for( i=0;i<arr.length;i++)
        {
          if(arr[i]==key)
          break;
        }
        return i;
}
}
