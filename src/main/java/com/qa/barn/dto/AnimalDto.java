package com.qa.barn.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnimalDto {
	
	private Long id;
	private String type;
	private int age;
	private String name;

}
