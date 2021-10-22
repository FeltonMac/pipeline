package com.revature.models;

import java.sql.Blob;
import java.time.LocalDateTime;

public class Reimbursement {
private	int re_id;
double amount;//could change to int 
LocalDateTime  submitted;
LocalDateTime  resolved;
String description;
Blob reciept;
// Author?
// resolver?
String status;
String type;
public Reimbursement(int re_id, double amount, LocalDateTime submitted, LocalDateTime resolved, String description,
		Blob reciept, String status, String type) {
	super();
	this.re_id = re_id;
	this.amount = amount;
	this.submitted = submitted;
	this.resolved = resolved;
	this.description = description;
	this.reciept = reciept;
	this.status = status;
	this.type = type;
}
public Reimbursement(double amount, LocalDateTime submitted, LocalDateTime resolved, String description, Blob reciept,
		String status, String type) {
	super();
	this.amount = amount;
	this.submitted = submitted;
	this.resolved = resolved;
	this.description = description;
	this.reciept = reciept;
	this.status = status;
	this.type = type;
}
public Reimbursement() {
	super();
}
public int getRe_id() {
	return re_id;
}
public double getAmount() {
	return amount;
}
public LocalDateTime getSubmitted() {
	return submitted;
}
public LocalDateTime getResolved() {
	return resolved;
}
public String getDescription() {
	return description;
}
public Blob getReciept() {
	return reciept;
}
public String getStatus() {
	return status;
}
public String getType() {
	return type;
}
public void setRe_id(int re_id) {
	this.re_id = re_id;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public void setSubmitted(LocalDateTime submitted) {
	this.submitted = submitted;
}
public void setResolved(LocalDateTime resolved) {
	this.resolved = resolved;
}
public void setDescription(String description) {
	this.description = description;
}
public void setReciept(Blob reciept) {
	this.reciept = reciept;
}
public void setStatus(String status) {
	this.status = status;
}
public void setType(String type) {
	this.type = type;
}
// equals hash with no blob?
@Override
public String toString() {
	return "Reimbursement [re_id=" + re_id + ", amount=" + amount + ", submitted=" + submitted + ", resolved="
			+ resolved + ", description=" + description + ", reciept=" + reciept + ", status=" + status + ", type="
			+ type + "]";
}


}
