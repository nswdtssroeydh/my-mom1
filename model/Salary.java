/**
 * 
 */package model;
/** * @author  作者 E-mail: nswdtssroeydh@163.com
 * @date 创建时间：2016-8-17 上午10:19:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  */
/**
 * @author HuangKai
 *
 */
public class Salary {

	private String id;//ID
	private String name;//姓名
	private int time;//时间
	private double salary;//职务工资
	private double other;//其他
	private double totalSalary;//合计
	private double supplement;//补款
	private double supplemant1;//补款1
	private double fees;//水电气费
	private double withHolding;//预扣款
	private double health;//卫生费
	private double medicalSecurity;//医疗保险
	private double fund;//公积金
	private double otherWithHolding;//其他扣款
	private double totalWithHolding;//扣款合计
	private double totalGain;//实发合计
	private String signature;//签名
	/**
	 * 
	 */
	public Salary() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getOther() {
		return other;
	}
	public void setOther(double other) {
		this.other = other;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	public double getSupplement() {
		return supplement;
	}
	public void setSupplement(double supplement) {
		this.supplement = supplement;
	}
	public double getSupplemant1() {
		return supplemant1;
	}
	public void setSupplemant1(double supplemant1) {
		this.supplemant1 = supplemant1;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public double getWithHolding() {
		return withHolding;
	}
	public void setWithHolding(double withHolding) {
		this.withHolding = withHolding;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public double getMedicalSecurity() {
		return medicalSecurity;
	}
	public void setMedicalSecurity(double medicalSecurity) {
		this.medicalSecurity = medicalSecurity;
	}
	public double getFund() {
		return fund;
	}
	public void setFund(double fund) {
		this.fund = fund;
	}
	public double getOtherWithHolding() {
		return otherWithHolding;
	}
	public void setOtherWithHolding(double otherWithHolding) {
		this.otherWithHolding = otherWithHolding;
	}
	public double getTotalWithHolding() {
		return totalWithHolding;
	}
	public void setTotalWithHolding(double totalWithHolding) {
		this.totalWithHolding = totalWithHolding;
	}
	public double getTotalGain() {
		return totalGain;
	}
	public void setTotalGain(double totalGain) {
		this.totalGain = totalGain;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public Salary(String id, String name, int time, double salary,
			double other, double totalSalary, double supplement,
			double supplemant1, double fees, double withHolding, double health,
			double medicalSecurity, double fund, double otherWithHolding,
			double totalWithHolding, double totalGain, String signature) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.salary = salary;
		this.other = other;
		this.totalSalary = totalSalary;
		this.supplement = supplement;
		this.supplemant1 = supplemant1;
		this.fees = fees;
		this.withHolding = withHolding;
		this.health = health;
		this.medicalSecurity = medicalSecurity;
		this.fund = fund;
		this.otherWithHolding = otherWithHolding;
		this.totalWithHolding = totalWithHolding;
		this.totalGain = totalGain;
		this.signature = signature;
	}
	
	public String toString()
	{
		return "人员编号:" + this.id + ",姓名:" + this.name + ",时间:" + this.time + ",职务工资合计:" + this.totalSalary + 
				",扣款合计:" + this.totalWithHolding + ",实发合计:" + this.totalGain;
	}

}
