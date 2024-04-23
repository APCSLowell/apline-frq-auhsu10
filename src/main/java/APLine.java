public class APLine
{
  /* your code here */
  private int A;
  private int B;
  private int C;
  private double slope;
  public APLine(int a, int b, int c){
    A=a;
    B=b;
    C=c;
    slope=(double)-a/b;
  }
  public double getSlope(){
    return slope;
  }
  public boolean isOnLine(int x, int y){
    if(A*x+B*y+C==0)
      return true;
    return false;
  }
}
