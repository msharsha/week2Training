package com.pack.lombokdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;


//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@EqualsAndHashCode
@AllArgsConstructor
//@NoArgsConstructor
@Value
@Data
public class Emp {
	
	final String name;
	int age;
	float salary;
	String designation;

}
