//Sara Alsaifi 
//AP CS A Period 2
//03 September 2020

public class Lab3NumOp{
  public static void main(String args[]){
    /*
    Challenge 1: predicting values from numerical operations.
    */
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;
    /*
    These are my predicitons.
    57.2 * (i1 / i2) + 1 = 1.0
    57.2 * ((double)i1 / i2) + 1 = 39.1333333
    15 – i1 (d1*3) + 4	= -1353.3999
    15 – i1 ((int)d1*3) + 4	= -1321
    15 – i1 (int)(d1*3) + 4 = -1345
    */
   System.out.println(57.2 * (i1 / i2) + 1);
   System.out.println(57.2 * ((double)i1 / i2) + 1);	
   System.out.println(15 - (i1*(d1*3) + 4));
   System.out.println(15 - (i1*((int)d1*3) + 4));	
   System.out.println(15 - (i1*(int)(d1*3) + 4));
    /*
    The output matches my prediction!
    */
   
    /*
   Challenge 2: reversing the order of four digit integers. This code prints the original number and then that same number reversed. 
   */
   int n0 = 1234;
   int n01 = n0%10; //4
   int e1 = n0%100; //34
   int e2 = n0%1000; //234
   int e3 = n0%10000; //1234
   int e4 = (e3 - e2); //1000
   int e5 = (e2 - e1); //200
   int e6 = (e1 - n01); //30
   int p1 = n01; //4
   int p2 = e6/10; //3
   int p3 = e5/100; //2
   int p4 = e4/1000; //1
   System.out.print(n0 + " ");
   System.out.print(p1);
   System.out.print(p2);
   System.out.print(p3);
   System.out.print(p4);
  }
}