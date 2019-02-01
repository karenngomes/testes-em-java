package com.karenngomes.sistema;

import com.karenngomes.sistema.PrimeiroElementoMatcher;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.*;


import java.util.ArrayList;
import java.util.Collections;

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
	
	@Test
	public void trazlistaOrdenadaComTodosOsElementos_02() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(3);
		lista.add(2);
		lista.add(7);
		
		Collections.sort(lista);	
		
		assertThat(lista, Matchers.contains(2,3,5,7));
						
	}
	
	@Test
	public void trazlistaOrdenadaComTodosOsElementos_03() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(3);
		lista.add(2);
		lista.add(7);
		
		Collections.sort(lista);	
		
		assertThat(lista, comecaComDois());
						
	}
	
	private PrimeiroElementoMatcher comecaComDois() {
		return new PrimeiroElementoMatcher();
	}
	
	@Test
	public void variaveisComValoresIguais() {
		boolean a = true;
		boolean b = true;
		
		// all statements test the same
		// assertThat(a,is(not(equalTo(b))));
		assertThat(a, is(b));
		assertThat(a, is(equalTo(b)));
		assertThat(a, equalTo(b));
		
	}
	
	@Test
	public void testesComString() {
		assertThat("test", anyOf(is("testing"), containsString("test")));
	}
	
	@Test
	public void saberTipoVariavel() {
		assertThat(Long.valueOf(1), instanceOf(Long.class));
		// shortcut for instanceOf
		assertThat(Long.valueOf(1), isA(Long.class));
	}

	@Test
    public void listShouldInitiallyBeEmpty() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        
        assertThat(list, hasSize(3));
        
        // ensure the order is correct
        assertThat(list, contains(5, 2, 4));
        
        assertThat(list, containsInAnyOrder(2, 4, 5));
        
        assertThat(list, everyItem(greaterThan(1)));
        
    }
	
	@Test
	public void listChecker() {
		List<String> fellowship = Arrays.asList("bla","buh", "race");
		
		assertThat(fellowship, hasItem("race"));
		
	}
	
}
