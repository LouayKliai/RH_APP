package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
@Entity
@MappedSuperclass
public abstract class AuditModel  implements Serializable{
	@Id
	private int id;

}
