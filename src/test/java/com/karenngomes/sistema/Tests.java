package com.karenngomes.sistema;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;;

public class Tests {
	@Test
	public void given2Strings_whenEqual_thenCorrect() {
        String a = "foo";
        String b = "FOO";
        assertThat(a, equalToIgnoringCase(b));
    }
	
}
