public class Array_as_a_function_argument_4 {
    public static void update_array(int marks[], int nonchangeable){
        nonchangeable = 10;
        // marks[0] = 78;
        // marks[1] = 79;
        // marks [2] = 80;
        for (int i = 0;i<marks.length;i++){
            marks[i] = marks[i]+1; // adding 1 

        }
        System.out.println("the value of nonchangeable varaible is in the scope of the function is: "+ nonchangeable);
    }
   
    public static void main(String[] args) {
        // passing array as a argument 
        // call by value
        // call by reference 
        // Array are passing in function as call by reference very very important ..........
        int marks[]={96,97,98};
        for (int i = 0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println("passing array in update array function by reference ");
        int nonchangeable = 5;
        update_array(marks,nonchangeable); // calling the function 
        System.out.println("value of nonchangeable remain same as it pass by value not reference "+nonchangeable);
        for (int i = 0;i<marks.length;i++){ 
            System.out.print(marks[i]+" "); 
        }
        System.out.println(); 
    }
}
// nonchangeable is the variable that is pass in a function by value .
// array always pass by reference in an array  means if there is any changes in an array then you see them in original array but in nonchangeable variable the changes done by the function to the nonchangeable variable is not reflection when you print the value of nonchangeable in main function 