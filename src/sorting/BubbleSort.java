package sorting;

import java.util.Arrays;
/**
 * ð������
 * ð��������ڡ���������������
 * ÿһ����һ�����ġ�ʯͷ������ˮ��
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
