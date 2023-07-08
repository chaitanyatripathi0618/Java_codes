public class fraction{
    public static NumberFraction add(NumberFraction f1, NumberFraction f2){
        
        int nume3= f1.nume*f2.deno+ f2.nume*f1.deno;
        int deno3=f1.deno*f2.deno;
        NumberFraction f3= new NumberFraction(nume3, deno3);
        
        
        
        
        return f3;
    }

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
            simplyfy();
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
        NumberFraction number2= new NumberFraction(2,9);
        
        System.out.println(number2.nume+"/"+number2.deno);
        NumberFraction f3= add(number, number2);
        System.out.println(f3.nume+"/"+f3.deno);
       

    }
}
