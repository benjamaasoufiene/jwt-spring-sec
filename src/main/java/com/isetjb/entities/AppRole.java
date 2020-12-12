package com.isetjb.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.OnDelete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppRole {
	@Id
	@GeneratedValue
	private Long id;
	private String roleName;
}
