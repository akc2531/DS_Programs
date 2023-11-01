class binary_search
{

    static int main(String args[])
    {
         int arr[]={1,2,3};
   
         int key=3;
         int right=arr.length-1,mid=0,left=0;
         while(left<=right)
         {
             mid=left+(right-1)/2;
             if(arr[mid]==key)
             return mid;
             if(arr[mid]<key)
             left=mid+1;
             if(arr[mid]>key)
             right=mid-1;
         }
          return -1;
}
}
