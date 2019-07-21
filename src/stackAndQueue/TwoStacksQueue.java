package stackAndQueue;

import java.util.ArrayDeque;

/*
 * ��дһ���࣬������ջʵ�ֶ��У�֧�ֶ��еĻ���������add, poll, peek)
 * ˼·��һ��ջ��Ϊѹ��ջ����һ����Ϊ����ջ
 * ����Queue�ӿ��м������÷���
 * void add(Object e):��ָ��Ԫ�ؼ��뵽���е�β��
 * Object peek():��ȡ����ͷ��Ԫ�أ�����ɾ����Ԫ�ء�����Ϊ�գ��򷵻�null��
 * Object poll():��ȡ����ͷ��Ԫ�أ���ɾ����Ԫ�ء�����Ϊ�գ��򷵻�null��
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
