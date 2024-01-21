package armstrongno;
public class Armstrong {
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the number");
    int a;
    int original;
    int rem,count=0;
    double sum=0;
    public Armstrong(int a)
    {
        this.a=a;
        this.original = a;
    }

    public void isArm()
    {
        while(a!=0)
     {
        a=a/10;
        count++;
     }
     a=original;
     while(a!=0)
     {
        rem=a%10;
        sum=sum+Math.pow(rem,count);
        a=a/10;
     }
    if(original==sum)
    {
        System.out.println("The number"+ original +"is an armstrong number");
    }
    else
    System.out.println("The number"+ original +"is not armstrong number");
    }
}


