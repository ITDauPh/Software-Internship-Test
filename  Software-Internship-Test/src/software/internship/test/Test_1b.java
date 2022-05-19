/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package software.internship.test;

/**
 *
 * @author blemb
 */
public class Test_1b {

    /**
     * @param args the command line arguments
     */
    
    static int maxFreq(int []arr, int n)
{
   
    // using moore's voting algorithm
    int count = 1;
    int result = 0;
    int index[] = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
        count = 1;
        for(int j = i+1; j < arr.length; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        index[i] = count;
    }
    int max = index[0];
    result = arr[0];
    for(int i = 1; i < index.length; i++){
        if(max < index[i]){
            max = index[i];
            result = arr[0];
        }
    }
    return result;
}
    static String maxFreq_String(String []arr, int n)
{
   
    // using moore's voting algorithm
    int count = 1;
    String result = "";
    int index[] = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
        count = 1;
        for(int j = i+1; j < arr.length; j++){
            if(arr[i].equals(arr[j])){
                count++;
            }
        }
        index[i] = count;
    }
    int max = index[0];
    result = arr[0];
    for(int i = 1; i < index.length; i++){
        if(max < index[i]){
            max = index[i];
            result = arr[0];
        }
    }
    return result;
}
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void printArray_String(String arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr1 = {3,7,3};
        printArray(arr1);
        int n = arr1.length;
        System.out.println(maxFreq(arr1, n));
        System.out.println("-----------------");
        String[] arr2 = {"null", "hello", "true", "null"};
        printArray_String(arr2);
        int m = arr2.length;
        System.out.println(maxFreq_String(arr2, m));
        System.out.println("-----------------");
        String[] arr3 = {"false", "up", "down", "left", "right", "false", "true"};
        printArray_String(arr3);
        int l = arr3.length;
        System.out.println(maxFreq_String(arr3, l));
        System.out.println("-----------------");
    }
    
}
