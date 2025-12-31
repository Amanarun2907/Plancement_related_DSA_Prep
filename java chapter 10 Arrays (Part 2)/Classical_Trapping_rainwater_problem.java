//Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
public class Classical_Trapping_rainwater_problem {
    // function creation that will return the amount of water hold by the bars 
    public static int trappedRainwater(int height[]){ // aray containing the height of each bar 
        int n = height.length;
    // calculate left max boundary-array (concept of Auxilary array)
    int leftMax[]= new int[n];
    leftMax[0]=height[0];
    for(int  i = 1;i<n;i++)
    {
        leftMax[i]=Math.max(height[i],leftMax[i-1]);
    }
    // calculate the right max bounday   (concept of Auxilary array)
    int rightMax[]= new int[n];
    rightMax[n-1]=height[n-1];
    for(int  i = n-2;i>=0;i--)
    {
        rightMax[i]= Math.max(height[i],rightMax[i+1]);
    }
    int trappedWater = 0;
    // loop 
    for(int i = 0;i<n;i++)
    {
        int waterLevel=Math.min(rightMax[i],leftMax[i]);
        trappedWater+=waterLevel-height[i];
    }
    return trappedWater;
    // waterlevel= Min(Left max boundary,Right max boundary)
    // (Water level-hight of each bar )*width of each bar 
    // height of each bar (given)
    // width of each bar (given )
    // prime focus is to calculate water level 

    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
       int answer = trappedRainwater(arr);
       System.out.println("answer is: "+answer);   
    }
}
// class Solution {
//     public int maxWater(int arr[]) {
//         int n = arr.length;
//         int lm[]=new int[n]; // left max
//         int rm[]=new int[n]; // right max 
//         // code here
//         // left max height
//         lm[0]=arr[0]; // start fillling from left to right 
//         for ( int i = 1;i<n;i++ )
//         {
//             lm[i] = Math.max(arr[i],lm[i-1]);
//         }
//         // right max height
//         rm[n-1]=arr[n-1];
//         for(int i = n-2;i>=0;i--)
//         {
//           rm[i]= Math.max(arr[i],rm[i+1]);  
//         }
//         // main code 
//         int trappedwater =0;
//         for(int i = 0;i<n;i++){
//             int Minwaterlevel = Math.min(lm[i],rm[i]);
//             trappedwater+=Minwaterlevel-arr[i];
//         }
//         return trappedwater;
//     }
// }



//Dry run 
// arr[] = {4,2,0,6,3,2,5};
// part1
// leftmax arr int lm[] = new int[arr.height];
// lm[0] = arr[0] = 4 
// lm[1] = Math.max(arr[1],lm[0]) = Math.max(2,4) = 4
// lm[2] = Math.max(arr[2],lm[1]) = Math.max(0,4) = 4
// lm[3] = Math.max(arr[3],lm[2]) = Math.max(6,4) = 6
// lm[4] = Math.max(arr[4],lm[3]) = Math.max(3,6) = 6
// lm[5] = Math.max(arr[5],lm[4]) = Math.max(2,6) = 6
// lm[6] = Math.max(arr[6],lm[5]) = Math.max(5,6) = 6
// lm[]={4,4,4,6,6,6,6}
// lm.height=arr.height


// part 2 
// int rm[] = new int[arr.length]
// rm[6]=arr[6]=5
// rm[5] = Math.max(arr[5],rm[6]) = Math.max(2,5) = 5
// rm[4] = Math.max(arr[4],rm[5]) = Math.max(3,5) = 5
// rm[3] = Math.max(arr[3],rm[4]) = Math.max(6,5) = 6
// rm[2] = Math.max(arr[2],rm[3]) = Math.max(0,6) = 6
// rm[1] = Math.max(arr[1],rm[2]) = Math.max(2,6) = 6
// rm[0] = Math.max(arr[0],rm[1]) = Math.max(4,6) = 6
// rm[]= {6,6,6,6,5,5,5}
// rm.height=arr.height

// rm[]= {6,6,6,6,5,5,5}
// lm[]={4,4,4,6,6,6,6}
// arr[] = {4,2,0,6,3,2,5};
// int trappedwater= 0;
//1st 
// int waterlevel = Math.min(rm[0],lm[0]) = Math.min(4,6) = 4
// trappedwater = 0+(4-4)  =0

//2nd 
// int waterlevel = Math.min(rm[1],lm[1]) = Math.min(4,6) = 4
// trappedwater = 0+(4-2)  =2



//3rd 
// int waterlevel = Math.min(rm[2],lm[2]) = Math.min(6,4) = 4
// trappedwater = 2+(4-0)  =6

//4th 
// int waterlevel = Math.min(rm[3],lm[3]) = Math.min(6,6) = 6
// trappedwater = 6+(6-6)  =6

//5th 
// int waterlevel = Math.min(rm[4],lm[4]) = Math.min(6,5) = 5
// trappedwater = 6+(5-3)  =8


//6th 
// int waterlevel = Math.min(rm[5],lm[5]) = Math.min(6,5) = 5
// trappedwater = 8+(5-2)  =11

//7th 
// int waterlevel = Math.min(rm[6],lm[6]) = Math.min(6,5) = 5
// trappedwater = 11+(5-5)  =11



// answer 11








