  public class  Overlodingexmple{


    Int add(int a , int b){
         return a+b;
    }
    double dd(double a , double b){
        System.out.println(a+b);
     }
    int  add (int a , int b , int c){
        System.out.println(a+b+c);
    }
    
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
       System.out.println(obj.add(12,1));
       
    }
  }