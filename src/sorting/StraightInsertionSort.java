package sorting;

import java.util.Arrays;

/**
 * 直接插入排序
 * 基本操作：
 * 	将一个记录插入到已经排好序的有序表中，从而得到一个新的、记录数增1的有序表
 * 时间复杂度：O(n^2)
 * @author chuangye
 *
 */
public class StraightInsertionSort {
	static void insertSort(int arr[]){
		if(arr == null || arr.length == 0 || arr.length == 1){
			return;
		}
		
		for(int i = 1; i < arr.length; i++){
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
