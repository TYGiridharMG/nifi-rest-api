package com.tyss.nifirestapi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
@Table(name = "nifi")
public class NifiBean {
	public NifiBean(String json) {
		this.json = json;
	}
	public NifiBean() {
	}
	@Id
	@GeneratedValue
	private int id;
	@Type(type = "json")
	private String json;
}
