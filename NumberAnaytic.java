public class NumericAnalytic {
    public boolean isEven(int num){
        return num%2==0;
    }
    public int findNumDigits(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;   
    }
    public int sumDigit(int num){
        int sum=0;
        int digit ;
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }
    public boolean isPrime(int num){
        
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }
}
