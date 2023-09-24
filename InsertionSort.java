
class HelloWorld {
    static void InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]=temp;
                 j--;
            }
           
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,9,4,3,2,0};
        InsertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
