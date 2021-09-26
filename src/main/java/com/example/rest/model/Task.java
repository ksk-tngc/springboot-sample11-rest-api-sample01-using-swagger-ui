package com.example.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * タスクエンティティ。
 */
@Entity
@Data
public class Task {

	/** ID */
	@Id
	@GeneratedValue
	private Long id;

	/** タスク名 */
	@NotBlank
	@Size(max = 255)
	private String name;

	/** 完了フラグ */
	@NotNull
	private Boolean completed = false;

}
