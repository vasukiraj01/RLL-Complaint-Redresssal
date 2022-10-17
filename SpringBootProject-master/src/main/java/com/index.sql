use database datadb;
SELECT complaint_table.name,complaint_table.email,complaint_table.phonenumber,complaint_table.complaint, manager.assignee 
FROM manager
INNER JOIN complaint_table ON complaint_table.id=manager.complaintid;

SELECT complaint_table.name,complaint_table.email,complaint_table.phonenumber,complaint_table.complaint, complaint_table.assignee,feedback.status
FROM manager
INNER JOIN complaint_table ON complaint_table.id=feedback.complaintid;


