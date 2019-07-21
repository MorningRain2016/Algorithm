package stackAndQueue;

import java.util.ArrayDeque;

/*
 * 用递归颠倒一个栈。
 * 思路：递归方式思考栈顶和剩下部分的关系。
 * 1.弹出栈顶元素
 * 2.颠倒余下的栈
 * 3.将弹出的栈顶元素放到栈底
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
			addToStackBottom(stack, obj); //！！注意，别忘记待插入到栈底的元素依然是obj
			stack.push(top);
		}
	}

}
