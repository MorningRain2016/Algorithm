package sorting;

import java.util.Arrays;

/**
 * ��ѡ������
 * ����˼�룺
 * ÿһ����n-i+1��Ԫ����ѡ��ѡȡ��Сֵ����Ϊ�������еĵ�i��Ԫ��
 *
 */
public class SelectSort {
	
	public static void simpleSelectSort(int[] arr){
		if(arr == null || arr.length <= 1){
			return;
		}
		for(int i = 0; i < arr.length; i++){
			int k = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[k]){
					k = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
			System.out.println(Arrays.toString(arr));
		}
		
	}

	public static void main(String[] args) {
		int[] originArr = {5, 6, 7, 4, 2, 1, 3};
		simpleSelectSort(originArr);
	}

}
