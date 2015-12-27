package org.ramya.bean.exam;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data @NoArgsConstructor @AllArgsConstructor
public class Question {
	private int id;  
	private String name;
}
