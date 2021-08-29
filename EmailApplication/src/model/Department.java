package model;

public class Department 
{
	private String DeptName;
	
	public Department()
	{
		
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [DeptName=" + DeptName + "]";
	}
	

	
}
