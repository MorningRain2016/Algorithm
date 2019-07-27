package sorting;

import java.util.Arrays;
/**
 * 冒泡排序
 * 冒泡排序基于“交换”进行排序，
 * 每一趟有一块最大的“石头”沉入水底
 *
 */
public class BubbleSort {
	
	private static void bubbleSort(int arr[]){
		if(arr == null || arr.length <= 1){
			return;
		}
		for(int i = arr.length -1; i > 0; i --){
			for(int j = 0; j < i ; j++){
				if(arr[j + 1] < arr[j]){
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

	public static void main(String[] args) {
		int[] originArr = {7, 6, 5, 4, 3, 2, 1};
		bubbleSort(originArr);
	}

}
