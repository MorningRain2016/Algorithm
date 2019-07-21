package stackAndQueue;

import java.util.ArrayDeque;

/*
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add, poll, peek)
 * 思路：一个栈作为压入栈，另一个作为弹出栈
 * 附：Queue接口中几个常用方法
 * void add(Object e):将指定元素加入到队列的尾部
 * Object peek():获取队列头部元素，但不删除该元素。队列为空，则返回null。
 * Object poll():获取队列头部元素，并删除该元素。队列为空，则返回null。
 * 
 */
public class TwoStacksQueue {
	public ArrayDeque<Object> stackPush;
	public ArrayDeque<Object> stackPop;
	
	public TwoStacksQueue() {
		stackPush = new ArrayDeque<Object>();
		stackPop = new ArrayDeque<Object>();
	}
	
	public void add(Object e) {
		stackPush.push(e);
	}
	
	public Object peek() {
		if (stackPush.isEmpty() && stackPop.isEmpty()) {
			throw new RuntimeException("Queue is Empty!");
		} else if (stackPop.isEmpty()) {
			while (!stackPush.isEmpty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
	}
	
	public Object poll() {
		if (stackPush.isEmpty() && stackPop.isEmpty()) {
			throw new RuntimeException("Queue is Empty!");
		} else if (stackPop.isEmpty()) {
			while (!stackPush.isEmpty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
