package com.karenngomes.sistema;

import com.karenngomes.sistema.Todo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TodoTest {
	
	@Test
	public void hasASpecificProperty() {
		Todo todo = new Todo(1, "Learn Hamcrest", "This is a first todo");
		
		assertThat(todo, hasProperty("summary"));
	}
	
	@Test
	public void todoConstructedWithSpecificValue() {
		Todo todo = new Todo(1, "Learn Hamcrest", "This is a first todo");
		
		assertThat(todo, hasProperty("summary", equalTo("Learn Hamcrest")));
	}
	
	@Test
	public void objectHasSameProperties() {
		Todo todo1 = new Todo(1, "Learn Hamcrest", "This is a first todo");
		Todo todo2 = new Todo(1, "Learn Hamcrest", "This is a first todo");
		
		assertThat(todo1, samePropertyValuesAs(todo2));
	}
	
}
