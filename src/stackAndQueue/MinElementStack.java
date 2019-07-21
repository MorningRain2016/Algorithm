package stackAndQueue;

import java.util.ArrayDeque;

/*
 * 设计一个有getMin功能的栈
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，在实现返回栈中最小元素的操作。
 * 要求1.pop、push、getMin操作的时间复杂度为都是O（1）2.设计的栈类型可以使用现成的栈结构。
 * 思路：使用两个栈。
 * stackData —— 保存当前栈中的元素；
 * stackMin —— 保存每一步操作后栈中的最小值
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
