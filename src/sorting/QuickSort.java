package sorting;

import java.util.Arrays;

/**
 * ��������
 * ����˼�룺ͨ��һ�����򽫴��ż�¼�ָ��ɶ����������֣�
 * ʹ��һ���ּ�¼�Ĺؼ��־�����һ����¼�Ĺؼ���С��
 * Ȼ�󣬷ֱ���������ּ�¼��������
 *
 */
public class QuickSort {

	
	/*
	 * ���������һ�˻���
	 */
	public static int partition(int[] arr, int low, int high){
		int pivot = arr[low]; //ѡȡ����ε�һ��Ԫ����Ϊ��Ԫ
		while(low < high){ //�ӱ�����˽�������м�ɨ��
			while(low < high && arr[high] >= pivot){
				--high;
			}
			arr[low] = arr[high]; //������ԪС��Ԫ���ƶ����Ͷ�
			while(low < high && arr[low] <= pivot){
				++low;
			}
			arr[high] = arr[low]; //������Ԫ���Ԫ���ƶ����߶�
		}
		arr[low] = pivot; //��Ԫ���õ�ȷ��������λ��
		System.out.println(Arrays.toString(arr));
		return low; //������Ԫλ�ã�һ�λ������
	}
	/*
	 *
	 */
	public static void quickSort(int[] arr, int low, int high){
		if(low > high){
			return;
		}
		int pivotLoc = partition(arr, low , high); //����һ�λ���,������Ԫ��λ��
		quickSort(arr, low, pivotLoc - 1); //�Ե��ӱ�ݹ�����
		quickSort(arr, pivotLoc + 1, high); //�Ը��ӱ�ݹ�����
	}
	
	public static void main(String[] args) {
		int[] originArr = {5, 6, 7, 4, 2, 1, 3};
		quickSort(originArr, 0, originArr.length - 1);
	}

}
