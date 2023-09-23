// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    static int[][] pascalTriangle(int n){
        int[][] a= new int[n][];
        
        for(int i=0;i<n;i++){
            a[i]= new int[i+1];
            a[i][0]= a[i][i]=1;
            for(int j = 1 ; j<i;j++){
                a[i][j]=a[i-1][j]+ a[i-1][j-1];
            }
        }
        
        return a;
    }
    public static void main(String[] args) {
        int n=6;
        int[][] res=pascalTriangle(n);
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}
