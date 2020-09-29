package codeSignal;

public class AdjacentElementsProduct {
	private static int adjacentElementsProduct(int[] inputArray) {
		int i=0;
		int[] producto;
		    producto=new int[inputArray.length-1];
		int mayor=-10000;
		    for(i=0;i<inputArray.length-1;i++){
		        producto[i]= inputArray[i] * inputArray[i+1];
		    }
		    for(i=0;i<producto.length;i++){
		        if(producto[i]>mayor){
		            mayor=producto[i];
		        }
		    }
		    return mayor;
		}

	public static void main(String[] args) {
		int[] producto= new int[] {3, 6, -2, -5, 7, 3};
    System.out.println(adjacentElementsProduct(producto));
	}

}
