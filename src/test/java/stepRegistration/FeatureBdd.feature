Feature: ServiceNow trail Login Feature

Scenario: Free CRM Register Scenario

Given user is on ServiceNow Free trail screen

When the screen itle is Start your free trial

Then user enters First name and Last name
And user enters Company
And user enters Phone	
And user enters JobLevel, Department, Job Function
And user enters additional details
And user clicks on Contact Sales button

Then user is on Thank you for reaching out



