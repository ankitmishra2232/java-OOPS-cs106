package exercise_02;

public class SelectionSort {

	public int[] sort(int array[]){  
        for (int i = 0; i < array.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < array.length; j++){  
                if (array[j] < array[index]){  
                    index = j;                            //searching for lowest index  
                }  
            }  
            int smallerNumber = array[index];   
            array[index] = array[i];  
            array[i] = smallerNumber;  
        }  
        System.out.println("\natfer Sort");
		print(array);
		return array;

	}
	public void print(int array[]) {
		//System.out.println("After Insertion Sort");    
        for(int i:array){    
            System.out.print(i+"|");
	
        }
}
}