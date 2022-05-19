/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.internship.test;

/**
 *
 * @author blemb
 */
public class Test_1a {
    void merge(int arr[], int l, int m, int r)
    {
        // kích thước của hai mảng con
        int n1 = m - l + 1;
        int n2 = r - m;
  
        // hai mảng tạm thời
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        // chép dữ liệu vào 2 mảng tạm
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        //merge
  
        // vị trí ban đầu
        int i = 0, j = 0;
  
        
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        //Sao chép các phần tử còn lại của L
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        //Sao chép các phần tử còn lại của R
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // middle
            int m =l+ (r-l)/2;
  
            // Sort 
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge
            merge(arr, l, m, r);
        }
    }
  
   
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void print_Max5(int arr[])
    {
        
        for (int i = 0; i < 5; ++i)
            
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String args[])
    {
        
        int arr1[] = {3,4,5,3,2,3,10,11};
        int arr2[] = {14,12,38,17,10,36,12,29,45,34,48,22};
        int arr3[] = {10,11,2,30,22,6,8,9,11,12,22};
        Test_1a t1 = new Test_1a();
        
        System.out.println("Given Array");
        printArray(arr1); 
        t1.sort(arr1, 0, arr1.length - 1);
        System.out.println("\nFindMax5");
        print_Max5(arr1);
        System.out.println("--------------");
        System.out.println("Given Array");
        printArray(arr2); 
        t1.sort(arr2, 0, arr2.length - 1);
        System.out.println("\nFindMax5");
        print_Max5(arr2);
        System.out.println("--------------");
        System.out.println("Given Array");
        printArray(arr3); 
        t1.sort(arr3, 0, arr3.length - 1);
        System.out.println("\nFindMax5");
        print_Max5(arr3);
        System.out.println("--------------");
    }
}
