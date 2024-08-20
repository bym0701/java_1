package 박유민;

public class MyInteger {
	int val;
	
	//this는 함수를 실행시키는 주체의 변수
	
	int add(MyInteger ob) { return this.val +ob.val;}
	int subtract(MyInteger ob) {return this.val - ob.val;}
	int multiply(MyInteger ob) {return this.val * ob.val;}
	double divide(MyInteger ob) {return ((double) this.val)/ob.val;}
}
