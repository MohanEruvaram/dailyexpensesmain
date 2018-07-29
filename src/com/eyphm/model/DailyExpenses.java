package com.eyphm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DailyExpenses_DailyExpenses")
public class DailyExpenses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sno;

	private Date expensesdate;
	private String username;
	private String nameofproduct;
	private float cost;

	public DailyExpenses() {

	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public Date getExpensesdate() {
		return expensesdate;
	}

	public void setExpensesdate(Date expensesdate) {
		this.expensesdate = expensesdate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNameofproduct() {
		return nameofproduct;
	}

	public void setNameofproduct(String nameofproduct) {
		this.nameofproduct = nameofproduct;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
