package sorting;

import java.util.Arrays;

/**
 * ������
 * ��������һ������ѡ�������Ƕ�ֱ��ѡ������ĸĽ���
 * ��ʼʱ���Ѵ���������п���һ��˳��洢�Ķ�������
 * ��������˳��ʹ֮��Ϊһ���󶥶ѣ������ڵ���ѵ����һ���ڵ㽻����
 * Ȼ�󣬶�ǰ��(n-1)�������µ���ʹ֮��Ϊһ���󶥶ѡ�
 * �Դ����ƣ�ֱ��ֻ�������ڵ�Ķѣ�����������������
 * �����͵õ���n���ڵ���������С�
 */
public class HeapSort {
	public static void heapSort(int[] arr){
		if(arr == null || arr.length == 1){
			return;
		}
		buildHeap(arr); //����
		
		//��ѡȡ����Ԫ�ط���ĩβ����ѡȡ�δ��Ԫ�ط����ĩβ...
		for(int i = arr.length -1; i > 0; i--){
			swap(arr, i, 0);
			System.out.println(Arrays.toString(arr));
			heapAdjust(arr, i, 0); //��ǰ��(n-1)�������µ���ʹ֮��Ϊһ���󶥶�
		}
	}
	
	private static void buildHeap(int[] arr){
		int half = arr.length/2;
		for(int i = half; i >= 0; i--){//�����һ����Ҷ�ӽڵ㴦���Ӻ���ǰ����
			heapAdjust(arr, arr.length, i); 
		}
	}
	
	private static void heapAdjust(int[] arr, int heapSize, int index){
		int left = 2 * index + 1; //���֧
		int right = 2 * index + 2; //�ҷ�֧
		int largest = index;
		if(left < heapSize && arr[left] > arr[largest]){
			largest = left;
		}
		if(right < heapSize && arr[right] > arr[largest]){
			largest = right;
		}
		if(index != largest){
			swap(arr, index, largest);
			heapAdjust(arr, heapSize, largest); //���ŵ�ǰ�ķ�֧�ݹ�
		}
		
	}
	
	// ����
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
