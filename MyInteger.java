package ������;

public class MyInteger {
	int val;
	
	//this�� �Լ��� �����Ű�� ��ü�� ����
	
	int add(MyInteger ob) { return this.val +ob.val;}
	int subtract(MyInteger ob) {return this.val - ob.val;}
	int multiply(MyInteger ob) {return this.val * ob.val;}
	double divide(MyInteger ob) {return ((double) this.val)/ob.val;}
}
