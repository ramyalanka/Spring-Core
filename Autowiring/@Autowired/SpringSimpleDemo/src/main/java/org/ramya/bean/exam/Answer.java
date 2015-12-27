package org.ramya.bean.exam;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor @Data @AllArgsConstructor
public class Answer {
	private int id;  
	private String name;
}
