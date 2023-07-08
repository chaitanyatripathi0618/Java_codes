public class fraction{

    public static int gcd(int nume, int deno){
        int min=Math.min(nume,deno);
        for(int i=min;i>=1;i--){
            if(nume%i==0 && deno%i==0){
                return i;
            }
            
        }
        return min;
    }
    public static class NumberFraction{
        int nume;
        int deno;

        public NumberFraction(int nume, int deno){
            this.nume=nume;
            this.deno=deno;
        }

        public void simplyfy() {
            int hcf=gcd(nume,deno);
            nume/=hcf;
            deno/=hcf;

            

        }
    }
    
    public static void main(String[] args){
        NumberFraction number= new NumberFraction(3,9);
        System.out.println(number.nume+"/"+number.deno);
        number.simplyfy();
        System.out.println(number.nume+"/"+number.deno);

    }
}
