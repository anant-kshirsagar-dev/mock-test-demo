package com.demo.model;

public class Employee {

	private Long id;
	private String name;
	private String desgination;	

	public Employee(Long id, String name, String desgination) {
		super();
		this.id = id;
		this.name = name;
		this.desgination = desgination;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", desgination=");
		builder.append(desgination);
		builder.append("]");
		return builder.toString();
	}

}
