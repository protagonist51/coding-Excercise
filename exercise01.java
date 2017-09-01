import java.util.Scanner;
 
public class Odometer {

  public static void main(String args[])
  {
    Scanner get=new Scanner(System.in);
    int inputNum=get.nextInt();
    int resultingNumber = 0;
    while(inputNum--!=0)
    {
      int n=get.nextInt();
      int x=n,c=0;
      while(x!=0)
      {
        c++;
        x/=10;
      }
      resultingNumber = calculate(n,c);
    }
    System.out.println(resultingNumber);
  }
  
  //Method to calculate the actual reading
  public static int  calculate(int n,int length)
  {
    if(n==0)
      return 0;
    if(length==1)
    {
      if(n<4)
        return n;
      else
        return n-1;
    }
    int temp=(int) (n/Math.pow(10,length-1));
    if(temp==0)
      return (int) ((temp)*Math.pow(9,length-1))+rec(n,length-1);
    else if(temp>3)
      return (int) ((temp-1)*Math.pow(9,length-1))+rec(n%(int)(temp*Math.pow(10,length-1)),length-1);
    else
      return (int) ((temp)*Math.pow(9,length-1))+rec(n%(int)(temp*Math.pow(10,length-1)),length-1);
  }
}
