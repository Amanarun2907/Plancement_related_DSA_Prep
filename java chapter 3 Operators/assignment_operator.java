public class assignment_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a+=10 );//20 // a=a+10
        System.out.println(a-=10 );//10 // a=a-10
        System.out.println(a+=10 ); //20 // a =a+10
        System.out.println(b-=5 ); // 0
        System.out.println(b+=10 ); // b = b+10 // 10
        System.out.println(a+=10 ); //a = a+ 10 // 30
        System.out.println();
        System.out.println(a*=10 ); // a = a*10 // a = 300
        System.out.println(a/=10 );  // a = a/10 // a =30
        System.out.println(a%=10 );  // a = a%10 // a =0
    
    
    }
}
