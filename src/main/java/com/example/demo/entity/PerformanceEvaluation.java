package com.example.demo.entity;

import java.util.Date;

//import jakarta.persistence.Entity;
import lombok.Data;
@Data
//@Entity
public class PerformanceEvaluation {

	private Date evaluationDate;
	private String comment;
}
