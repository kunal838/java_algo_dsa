public class mergesort {
    public static void conquer(int arr[],int s,int mid,int e){
        int merge[] = new int[e-s+1];
        int i1 = s;
        int i2 = mid+1;
        int x = 0;
        while(i1<=mid && i2<=e){
            if (arr[i1]<=arr[i2]) {
                merge[x++] = arr[i1++];
                
            } else {
                merge[x++] = arr[i2++];
                
            }

            while(i1<=mid){
                merge[x++] = arr[i1++];
            }
            while(i2<=e){
                merge[x++] = arr[i2++];
            }

            for(int i=0,j=s; i<merge.length;i++,j++)
            {
                arr[j] = merge[i];
               

            }
        }


    }
    public static void merged(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int mid = s+(e-s)/2;
        merged(arr,s,mid);
        merged(arr,mid+1,e);
        conquer(arr,s,mid,e);


    }
    public static void main(String[] args){
        int arr[] = {8,4,3,8,2};
        int  n = arr.length;
        merged(arr, 0, n-1);
        System.out.println("sorted array -->");
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
      

      
       

    }
   
    
}
