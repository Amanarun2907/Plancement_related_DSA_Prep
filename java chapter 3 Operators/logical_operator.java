public class logical_operator {
    public static void main(String[] args) {
     System.out.println((3>2) && (5>0)); // true
     System.out.println((3>2) && (5<0)); // false
     System.out.println((3<2) && (5>0)); // false
     System.out.println((3<2) && (5<0)); // false
     System.out.println();
     System.out.println((3>2) || (5>0)); // true
     System.out.println((3<2) || (5>0)); // true
     System.out.println((3>2) || (5<0)); // true
     System.out.println((3<2) || (5<0)); // false
     System.out.println();
     System.out.println(!(3>2)); // false
     System.out.println(!(3<2)); //true

    }
}
// && (LOGICAL AND)
// || (logical or)
// !(logical not )