package org.ramya.bean;

import org.ramya.bean.exam.Answer;
import org.ramya.bean.exam.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor @AllArgsConstructor @Data
public class User { 
	
	@Autowired
	private Question question;
	
	@Autowired
	private Answer answer;
}
