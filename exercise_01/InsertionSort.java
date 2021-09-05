package exercise_01;

public class InsertionSort {

    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] array = {1,46,64,8,488,6,5,1,91,35,6};    
        System.out.println("Original Array-");    
        for(int i:array){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(array);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:array){    
            System.out.print(i+" ");    
        }    
    }    
}    