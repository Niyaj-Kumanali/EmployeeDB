package entity;

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	private String edsg;
	private long ephno;
	private int eage;

	public Employee(int eid, String ename, double esal, String edsg, long ephno, int eage) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edsg = edsg;
		this.ephno = ephno;
		this.eage = eage;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public String getEdsg() {
		return edsg;
	}

	public void setEdsg(String edsg) {
		this.edsg = edsg;
	}

	public long getEphno() {
		return ephno;
	}

	public void setEphno(long ephno) {
		this.ephno = ephno;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edsg=" + edsg + ", ephno=" + ephno
				+ ", eage=" + eage + "]";
	}

}
