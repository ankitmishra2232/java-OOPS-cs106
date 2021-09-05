package exercise_01;

public class SelectionSort {

	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;                            //searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] array = {79,7,81,8,9,65,1,31,39,6,54,64};  
        System.out.println("Original Array-");  
        for(int i:array){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(array);                               //sorting array using selection sort  
         
        System.out.println("After SelectionSort-");  
        for(int i:array){  
            System.out.print(i+" ");  
        }  
    }  

}
