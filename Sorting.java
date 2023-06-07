public class Sorting {
    public static void main(String[] args){
        int a[]={2,9,3,7,10,8,3,5,-4};
        int n= a.length;

        for(int i=0; i<n-1;i++){
            boolean sort = true;
            for(int j=0; j<n-1-i;j++){
                if(a[j+1]<a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    sort = false;
                }
            }
            if(sort) break;
        }
        for(int item:a)
        System.out.print( item+" ");
    }
    
}
