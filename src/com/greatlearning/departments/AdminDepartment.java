package com.greatlearning.departments;

public class AdminDepartment extends SuperDepartment{
	
	//@override
		public String departmentName()
		{
			return "Admin Department";
		}
		//@override
		public String getTodaysWork()
		{
			return "Complete your documents Submission";
		}
		//@override
		public String getWorkDeadline()
		{
			return "Complete by EOD";
		}
}
