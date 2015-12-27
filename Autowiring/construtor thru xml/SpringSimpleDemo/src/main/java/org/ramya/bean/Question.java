package org.ramya.bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data @NoArgsConstructor @AllArgsConstructor
public class Question {
	private int id;  
	private String name;
}
