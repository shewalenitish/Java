package primeno;
public class Prime {
    public static void main(String args[])
    {  
          
    }
    int a;
    public Prime(int a)
    {
      this.a=a;
    }
    public void isPrime()
    {
        int counter=0;
            for(int i=2; i<a/2; i++)
            {
                if(a%i==0)
                {
                    counter=1;
                }
            }
            if(counter==0)
            {
                System.out.println("number is prime");
            }
            else 
            System.out.println("number is not prime");    
        }
}





