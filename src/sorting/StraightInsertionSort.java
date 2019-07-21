package sorting;

public class StraightInsertionSort {
	static void insertSort(int arr[]){
		if(arr == null || arr.length == 0 || arr.length == 1){
			return;
		}
		
		for(int i = 2; i < arr.length; i ++){
			int currValue = arr[i];
			
			for(int j = i -1; j > 0; j--){
				if(currValue < arr[j]){
					arr[j + 1] = arr[j];
				} else {
					arr[j] = currValue;
					break;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
