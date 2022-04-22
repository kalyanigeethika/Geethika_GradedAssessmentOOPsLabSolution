package com.greatlearning.departments;

public class TechDepartment extends SuperDepartment{
	//@override
		public String departmentName()
		{
			return "Tech Department";
		}
		//@override
		public String getTodaysWork()
		{
			return "Complete coding of module 1";
		}
		//@override
		public String getWorkDeadline()
		{
			return "Complete by EOD";
		}
		public String getTechStackInformation()
		{
			return "Core Java";
		}
}
