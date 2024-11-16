import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        concatenation();

    }


    public static void concatenation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n= sc.nextInt();
        int[] arr=fillArray(n);
        int[] arr2=new int[arr.length*2];

        for(int i=0;i< arr.length;i++){
            arr2[i]=arr[i];
            arr2[i+ arr.length]=arr[i];
        }

        for(int j=0;j< arr2.length;j++){
            System.out.println(arr2[j]);
        }

        sc.close();
    }

    public static int[] fillArray(int n){
        Scanner sc=new Scanner(System.in);
        int[] array=new int[n];
        System.out.println("insert array elements:");
        for (int i=0;i<n;i++){

            array[i]= sc.nextInt();

        }
        return array;
    }
}

//LeetCode in istediyi formada

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        return result;
    }
}
