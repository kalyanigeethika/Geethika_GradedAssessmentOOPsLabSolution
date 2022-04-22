package com.greatlearning.departments;


public class HrDepartment extends SuperDepartment{

	//@override
		public String departmentName()
		{
			return "Hr Department";
		}
		//@override
		public String getTodaysWork()
		{
			return "Fill today’s worksheet and mark your attendance";
		}
		//@override
		public String getWorkDeadline()
		{
			return "Complete by EOD";
		}
		public String doActivity()
		{
			return "Team Lunch";
		}

}
