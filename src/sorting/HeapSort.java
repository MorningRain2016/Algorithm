package sorting;

import java.util.Arrays;

/**
 * 堆排序
 * 堆排序是一种树形选择排序，是对直接选择排序的改进。
 * 初始时，把待排序的序列看作一颗顺序存储的二叉树。
 * 调整它的顺序，使之成为一个大顶堆；将根节点与堆的最后一个节点交换。
 * 然后，对前面(n-1)个数重新调整使之成为一个大顶堆。
 * 以此类推，直到只有两个节点的堆，并对它们做交换。
 * 这样就得到了n个节点的有序序列。
 */
public class HeapSort {
	public static void heapSort(int[] arr){
		if(arr == null || arr.length == 1){
			return;
		}
		buildHeap(arr); //建堆
		
		//先选取最大的元素放入末尾，再选取次大的元素放入次末尾...
		for(int i = arr.length -1; i > 0; i--){
			swap(arr, i, 0);
			System.out.println(Arrays.toString(arr));
			heapAdjust(arr, i, 0); //对前面(n-1)个数重新调整使之成为一个大顶堆
		}
	}
	
	private static void buildHeap(int[] arr){
		int half = arr.length/2;
		for(int i = half; i >= 0; i--){//从最后一个非叶子节点处，从后往前调整
			heapAdjust(arr, arr.length, i); 
		}
	}
	
	private static void heapAdjust(int[] arr, int heapSize, int index){
		int left = 2 * index + 1; //左分支
		int right = 2 * index + 2; //右分支
		int largest = index;
		if(left < heapSize && arr[left] > arr[largest]){
			largest = left;
		}
		if(right < heapSize && arr[right] > arr[largest]){
			largest = right;
		}
		if(index != largest){
			swap(arr, index, largest);
			heapAdjust(arr, heapSize, largest); //沿着当前的分支递归
		}
		
	}
	
	// 交换
	private static void swap(int[] data, int i, int j) {
	    int tmp = data[i];
	    data[i] = data[j];
	    data[j] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArr = {5, 6, 7, 4, 2, 1, 3};
		heapSort(originArr);

	}

}
