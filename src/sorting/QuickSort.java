package sorting;

import java.util.Arrays;

/**
 * 快速排序
 * 基本思想：通过一趟排序将待排记录分隔成独立的两部分，
 * 使得一部分记录的关键字均比另一部记录的关键字小，
 * 然后，分别对这两部分记录继续排序
 *
 */
public class QuickSort {

	
	/*
	 * 快速排序的一趟划分
	 */
	public static int partition(int[] arr, int low, int high){
		int pivot = arr[low]; //选取数组段第一个元素作为主元
		while(low < high){ //从表的两端交替地向中间扫描
			while(low < high && arr[high] >= pivot){
				--high;
			}
			arr[low] = arr[high]; //将比主元小的元素移动到低端
			while(low < high && arr[low] <= pivot){
				++low;
			}
			arr[high] = arr[low]; //将比主元大的元素移动到高端
		}
		arr[low] = pivot; //主元放置到确定下来的位置
		System.out.println(Arrays.toString(arr));
		return low; //返回主元位置，一次划分完成
	}
	/*
	 *
	 */
	public static void quickSort(int[] arr, int low, int high){
		if(low > high){
			return;
		}
		int pivotLoc = partition(arr, low , high); //进行一次划分,返回主元的位置
		quickSort(arr, low, pivotLoc - 1); //对低子表递归排序
		quickSort(arr, pivotLoc + 1, high); //对高子表递归排序
	}
	
	public static void main(String[] args) {
		int[] originArr = {5, 6, 7, 4, 2, 1, 3};
		quickSort(originArr, 0, originArr.length - 1);
	}

}
