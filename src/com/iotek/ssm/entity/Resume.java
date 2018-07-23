package com.iotek.ssm.entity;
//简历表
public class Resume {

	private int rid;
	private String name;
	private int age;
	private int tel;
	private Deprecated dept;//部门
	private Position posi;//职位
	private String lastjob;//上份工作
	private int salary;//工资
	private  String sex;//性别
	private  String educal;//性别
	private  String emil;//邮箱
	private  String poitics;//政治面貌
	private  String expe;//工作经验
	private   String hobby;//爱好
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Deprecated getDept() {
		return dept;
	}
	public void setDept(Deprecated dept) {
		this.dept = dept;
	}
	public Position getPosi() {
		return posi;
	}
	public void setPosi(Position posi) {
		this.posi = posi;
	}
	public String getLastjob() {
		return lastjob;
	}
	public void setLastjob(String lastjob) {
		this.lastjob = lastjob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEducal() {
		return educal;
	}
	public void setEducal(String educal) {
		this.educal = educal;
	}
	public String getEmil() {
		return emil;
	}
	public void setEmil(String emil) {
		this.emil = emil;
	}
	public String getPoitics() {
		return poitics;
	}
	public void setPoitics(String poitics) {
		this.poitics = poitics;
	}
	public String getExpe() {
		return expe;
	}
	public void setExpe(String expe) {
		this.expe = expe;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Resume [rid=" + rid + ", name=" + name + ", age=" + age + ", tel=" + tel + ", dept=" + dept + ", posi="
				+ posi + ", lastjob=" + lastjob + ", salary=" + salary + ", sex=" + sex + ", educal=" + educal
				+ ", emil=" + emil + ", poitics=" + poitics + ", expe=" + expe + ", hobby=" + hobby + "]";
	}
	public Resume(int rid, String name, int age, int tel, Deprecated dept, Position posi, String lastjob, int salary,
			String sex, String educal, String emil, String poitics, String expe, String hobby) {
		super();
		this.rid = rid;
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.dept = dept;
		this.posi = posi;
		this.lastjob = lastjob;
		this.salary = salary;
		this.sex = sex;
		this.educal = educal;
		this.emil = emil;
		this.poitics = poitics;
		this.expe = expe;
		this.hobby = hobby;
	}
	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
