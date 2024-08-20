package ¹ÚÀ¯¹Î;

public class StudentScore_private {
	public static void main(String[] args) {
		int korSum = 0, engSum = 0, mathSum = 0;
		double totalSum = 0.0, korAvg, engAvg, mathAvg, totalAvg;
		
		Student [] students = new Student[3];
		students[0] = new Student();
		students[0].setInfo("bmkim1", 2016001, 70, 80, 90);
		students[1] = new Student();
		students[1].setInfo("bmkim2", 2016002, 60, 70, 80);
		students[2] = new Student();
		students[2].setInfo("bmkim3", 2016003, 50, 60, 70);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(students[i].getInfo());
			korSum += students[i].getKor();
			engSum += students[i].getEng();
			mathSum += students[i].getMath();
			totalSum += students[i].getAverage();
		}
		
		korAvg = korSum / 3.0;
		engAvg = engSum / 3.0;
		mathAvg = mathSum / 3.0;
		totalAvg = totalSum / 3.0;
		
		System.out.println("±¹¾î Æò±Õ : "+ korAvg);
		System.out.println("¿µ¾î Æò±Õ : "+ engAvg);
		System.out.println("¼öÇÐ Æò±Õ : "+ mathAvg);
		System.out.println("ÀüÃ¼ Æò±Õ : "+ totalAvg);
	}
}
class Student{
	private String sname;
	private int sid, kor, eng, math;
	
	public String getName() {return sname;}
	public int getSID() {return sid;}
	public int getKor() {return kor;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	
	void setInfo(String name, int id, int k, int e, int m) {
		sname = name; sid = id; kor = k; eng = e; math = m;
	}
	double getAverage() {return (kor + eng + math)/3.0;}
	String getInfo() {return sname + ", " + sid + ", " + kor + ", " + eng + ", " + math;}
}