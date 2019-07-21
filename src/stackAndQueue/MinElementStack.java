package stackAndQueue;

import java.util.ArrayDeque;

/*
 * ���һ����getMin���ܵ�ջ
 * ʵ��һ�������ջ����ʵ��ջ�Ļ������ܵĻ����ϣ���ʵ�ַ���ջ����СԪ�صĲ�����
 * Ҫ��1.pop��push��getMin������ʱ�临�Ӷ�Ϊ����O��1��2.��Ƶ�ջ���Ϳ���ʹ���ֳɵ�ջ�ṹ��
 * ˼·��ʹ������ջ��
 * stackData ���� ���浱ǰջ�е�Ԫ�أ�
 * stackMin ���� ����ÿһ��������ջ�е���Сֵ
 */
public class MinElementStack {

	private ArrayDeque<Integer> stackData;
	private ArrayDeque<Integer> stackMin;
	
	public MinElementStack() {
		stackData = new ArrayDeque<Integer>();
		stackMin =new ArrayDeque<Integer>();
	}
	
	public void push(Integer e) {
		this.stackData.push(e);
		if(stackMin.isEmpty()) {
			stackMin.push(e);
		} else if (e <= this.getMin()) {
			stackMin.push(e);
		} else {
			stackMin.push(this.getMin());
		}
	}
	
	public Integer pop(){
		if (stackData.isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		this.stackMin.pop();
		return this.stackData.pop();
	}
	
	public Integer getMin() {
		if (stackMin.isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		return stackMin.peek();
	}

}
