public class array_creation_2 {
    public static void main(String[] args) {
        int marks [] = new int [50]; // size of the array is static in nature . (Very important)  all the elements are equal to 0 
        int number[] = {1,2,3,4,5,6,7,8,9,10}; 
        int morenumber[]={11,12,13};
        String fruit[]={"apple","mango","orange"};
        String aman [] = new String [5];
        // output of marks array 
        for (int i = 0;i<50;i++){
            System.out.print(marks[i]+" ");
        }
  System.out.println();


        // output of number array 
        for (int i = 0; i < 10; i++) {
            System.out.print(number[i]+" ");
        }
   System.out.println();

        // output of morenumber array 
        for (int i = 0;i<3;i++){
            System.out.print(morenumber[i]+" ");
        }
System.out.println();
        //output of fruit array 
        for (int i = 0;i<3;i++){
            System.out.print(fruit[i]+" ");
        }
System.out.println();
    

    // output of aman array 
    for(int i = 0;i<5;i++){
      System.out.print(aman[i]+" ");
}
System.out.println();
}
}
//operation in array 
// create 
// input 
// output 
// update 

// creating an array 
// data type arrayName [] = new datatype [size of the array ];
// int marks[] = new int[50] // 50 is the length of the array .  like Scanner sc = new Scanner (System.in);
// if we made a array of length 50 then indexing is from  0 to 49 but if we do not declare the elements of the array then at each position element is equal to 0 .......................