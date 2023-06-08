public class Selection {
    public static void main(String[] args) {
        int a[]={9,2,-1,4,7,};
        int n=a.length;

        for(int i=0;i<n-1;i++){
            int min=i;//first index is 0
            for(int j=i;j<n;j++){
                if(a[j]<a[min]){
                    min=j;//copying the index of the smallest element
                }

            }
            int temp =a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
