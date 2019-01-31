package com.karenngomes.sistema;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.*;

public class Tests {
	@Test
	public void given2Strings_whenEqual_thenCorrect() {
        String a = "foo";
        String b = "FOO";
        assertThat(a, equalToIgnoringCase(b));
    }
	
	@Test
	public void trazlistaOrdenadaComTodosOsElementos() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(3);
		lista.add(2);
		lista.add(7);
		
		Collections.sort(lista);	
		
		assertEquals(4, lista.size());
		assertEquals(new Integer(2), lista.get(0));
		assertEquals(new Integer(3), lista.get(1));
		assertEquals(new Integer(5), lista.get(2));
		assertEquals(new Integer(7), lista.get(3));
				
		
		
	}
	
}
