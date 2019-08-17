package sorting;

import java.util.Arrays;

/**
 * �鲢����
 * 2·�鲢����ĺ��Ĳ����ǽ�һά������ǰ�����ڵ������������й鲢Ϊһ����������
 * 
 *
 */
public class MergeSort {
	
	//�����ڵ���������������ϲ�����������ռ�
	public static void merge(int[] arr, int low, int mid, int high){
		int[] temp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= high){
			if(arr[i] < arr[j]){
				temp[k++] = arr[i++];
			} else{
				temp[k++] = arr[j++];
			}
		}
		
		while(i <= mid){
			temp[k++] = arr[i++];
		}
		
		while(j <= high){
			temp[k++] = arr[j++];
		}
		
		//�����������ʱ����Ԫ�ذ��򸲸ǵ�ԭ������������
		for(k = 0; k < high - low + 1 ; k++){
			arr[low + k] = temp[k];
		}
	}
	
	public static void mergeSort(int[] arr, int low, int high){
		int mid = (low + high)/2;
		if(low < high){
			mergeSort(arr,low, mid);
			mergeSort(arr,mid + 1, high);
			merge(arr,low, mid, high);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originArr = {7, 6, 5, 4, 3, 2, 1};
		mergeSort(originArr, 0, originArr.length -1);
	}

}
