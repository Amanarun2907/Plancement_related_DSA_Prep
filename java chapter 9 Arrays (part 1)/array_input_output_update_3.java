import java.util.*;// must to write
public class array_input_output_update_3 {
    public static void main(String[] args) {
        int marks[] = new int [100];
        Scanner sc = new Scanner (System.in);
        marks[0]= sc.nextInt(); // mathematics marks 
        marks[1] = sc.nextInt(); // physics marks 
        marks[2] = sc.nextInt();  // chemistry marks
        System.out.println("mathematics : "+marks[0]);
        System.out.println("physics: "+marks[1]);
        System.out.println("chemistry: "+marks[2]);
        int percentage = ((marks[0]+marks[1]+marks[2])/3);
        System.out.println("Percentage : "+percentage+" %");
        // System.out.println(marks[3]);
        // we are updating the values ......
        // marks[0] =100;
        // marks[1] = marks[1]+5; 
        // marks[2] = marks[2] - 2;
        // System.out.println("mathematics : "+marks[0]);
        for(int i = 0;i<100;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println("length of array is: "+marks.length);// length of the array 
    }
}
// by the help of the indexing we are doing most of the work in the array.
// creating an array 
// updating the value of elements in an array 
// input in an array 
// length of the array 
// displaying the elements of an array  