package sorting;

import java.util.Arrays;

/**
 * ÷±Ω”≤Â»Î≈≈–Ú
 * @author 90698
 *
 */
public class StraightInsertionSort {
	static void insertSort(int arr[]){
		if(arr == null || arr.length == 0 || arr.length == 1){
			return;
		}
		
		for(int i = 1; i < arr.length; i ++){
			int currValue = arr[i];
			int j = i -1;
			for(; j >= 0; j--){
				if(currValue < arr[j]){
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = currValue;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		int[] originArr = {7, 6, 5, 4, 3, 2, 1};
		insertSort(originArr);
	}

}
