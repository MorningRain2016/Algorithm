package stackAndQueue;

import java.util.ArrayDeque;

/*
 * �õݹ�ߵ�һ��ջ��
 * ˼·���ݹ鷽ʽ˼��ջ����ʣ�²��ֵĹ�ϵ��
 * 1.����ջ��Ԫ��
 * 2.�ߵ����µ�ջ
 * 3.��������ջ��Ԫ�طŵ�ջ��
 */
public class ReversedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void reverseStack(ArrayDeque<Object> stack) {
		if (!stack.isEmpty()) {
			Object e = stack.pop();
			reverseStack(stack);
			addToStackBottom(stack , e);
		}
	}
	
	public void addToStackBottom(ArrayDeque<Object> stack, Object obj) {
		if (stack.isEmpty()) {
			stack.push(obj);
		} else {
			Object top = stack.pop();
			addToStackBottom(stack, obj); //����ע�⣬�����Ǵ����뵽ջ�׵�Ԫ����Ȼ��obj
			stack.push(top);
		}
	}

}
