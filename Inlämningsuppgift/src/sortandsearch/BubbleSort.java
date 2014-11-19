package sortandsearch;

/**
 *
 * @author Patrik
 */

public class BubbleSort {

	private static int []a;
	public static void main(String[] args) {
		a = getArray();
		printArray();
		sort();
                //Får en slumpmässig array,
                //Skriver ut den,
                //Sorterar.
                
		System.out.println();
		printArray();
	}       //Skriver ut arrayen.

	public static void sort(){
		int left = 0;
		int right = a.length-1;

		bubbleSort(left,right);
	}       //Anropar bubbleSort.

	private static void bubbleSort(int left,int right){
		for(int i=right;i>1;i--){
			for(int j=left;j<i;j++){
				if(a[j] > a[j+1]){
					swap(j, j+1);
				}
			}
		}
	}
//Går från vänster till höger, om det vänstra föremålet är större än det högra=byt plats.
        
	public static void swap(int left,int right){
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}

	public static void printArray(){
		for(int i : a){
			System.out.print(i+" ");
		}
	}

	public static int[] getArray(){
		int size=100000;
		int []array = new int[size];
		int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100); 
			array[i] = item;
		}
		return array;
	}//size definerar antalet tal, (Math.random()*x) x definerar vilka tal som används.

}