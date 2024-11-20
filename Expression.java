package Test;

public class Expression {
	private String[] expression = new String[100];
	private int count = 0;
	private int[] num;
	private int nc = 0;
	private String[] operators = new String[100];
	private int oc = 0;
	
	public int Calculate() {
		int result = 0;
		//°è»êÇÏ±â(°ö¼Á³ª´°¼À ¸ÕÀú, 0À¸·Î ³ª´©´Â °Ç ºÒ°¡)
		return result;
	}
	
	public String get_expression() {return this.expression[count];}
	public int get_num() {return this.num[nc];}
	public int get_nc() {return this.nc;}
	public String get_operators() {return this.operators[oc];}
	public int get_oc() {return this.oc;}
	
	public void set_expression(String n) {this.expression[count] = n;}
	public void set_num(int n) {this.num[nc] = n;}
	public void set_nc() {this.nc++;}
	public void set_operators(String n) { this.operators[oc] = n;}
	public void set_oc() { this.oc++;}
	
}
