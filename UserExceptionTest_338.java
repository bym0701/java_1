package ¹ÚÀ¯¹Î;

import java.util.LinkedList;

public class UserExceptionTest_338 {
	public static void main(String[] args) {
		LinkedList<String> stack = new LinkedList<String>();
		stack.push("aaa");
		stack.push("bbb");
		System.out.println("Stack : " + stack);
		String s = stack.pop();
		System.out.println(s + "°¡(ÀÌ) ÆË¾÷µÊ");
		System.out.println("Stack : " + stack);
		
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("ccc");
		queue.offer("ddd");
		System.out.println("Queue : " + queue);
		String ss = queue.poll();
		System.out.println(ss + "°¡(ÀÌ) ¹ÝÈ¯ ¹× Á¦°ÅµÊ");
		System.out.println("Queue : " + queue);
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("eee");
		list.add("fff");
		list.add(0, "ggg");
		System.out.println("List : " + list);
		String sss = list.remove(1);
		System.out.println(sss + "°¡(ÀÌ) Á¦°ÅµÊ");
		String t = list.get(1);
		System.out.println("ÀÎµ¦½º 1 À§Ä¡ÀÇ °ªÀº " + t);
		System.out.println("List : " + list);
	}
}
