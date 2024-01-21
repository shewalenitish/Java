package perfectno;
public class perfect
{
    public static void main(String args[])
    {

    }
    int k;
    public perfect(int k)
    {
       this.k=k;
    }
    public void isPerfect()
    {
        int count=0;
        for(int i=1; i<k-1; i++)
        {
            if(k%i==0)
            {
                count=count+i;
            }
        }
        if(count==k)
        {
            System.out.println("number is perfect");
        }
        else
          System.out.println("number is not perfect");
    }
}
