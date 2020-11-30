import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NotasCompetidoresTest {
	@Test
	public void testEmpateClassificados() {
		NotasCompetidores<Integer> comp = new NotasCompetidores<Integer>(6, 3);
		comp.push(1);
		comp.push(3);
		comp.push(4);
		comp.push(4);
		comp.push(5);
		comp.push(5);
		assertEquals(4, comp.getClassificados());
	}

	@Test
	public void testNaoEmpateClassificados() {
		NotasCompetidores<Integer> comp = new NotasCompetidores<Integer>(6, 3);
		comp.push(1);
		comp.push(3);
		comp.push(3);
		comp.push(4);
		comp.push(5);
		comp.push(5);
		assertEquals(3, comp.getClassificados());
	}
	@Test
	public void testTodosClassificados() {
		NotasCompetidores<Integer> comp = new NotasCompetidores<Integer>(6, 6);
		comp.push(1);
		comp.push(3);
		comp.push(3);
		comp.push(4);
		comp.push(5);
		comp.push(5);
		assertEquals(6, comp.getClassificados());
	}
	@Test
	public void testMediaClassificados() {
		NotasCompetidores<Integer> comp = new NotasCompetidores<Integer>(6, 3);
		comp.push(1);
		comp.push(3);
		comp.push(4);
		comp.push(4);
		comp.push(5);
		comp.push(5);
		assertEquals(4.5, comp.getMediaClass(), 0.009);
	}
	@Test
	public void testMediaCompetidores() {
		NotasCompetidores<Integer> comp = new NotasCompetidores<Integer>(6, 3);
		comp.push(1);
		comp.push(3);
		comp.push(4);
		comp.push(4);
		comp.push(5);
		comp.push(5);
		assertEquals(3.66, comp.getMediaComp(), 0.009);
	}
	@Test
	public void testDpClass() {
		NotasCompetidores<Integer> comp = new NotasCompetidores<Integer>(6, 3);
		comp.push(1);
		comp.push(3);
		comp.push(4);
		comp.push(4);
		comp.push(5);
		comp.push(5);
		assertEquals(0.5, comp.getDpClass(), 0.009);
	}
	@Test
	public void testDpComp() {
		NotasCompetidores<Integer> comp = new NotasCompetidores<Integer>(6, 3);
		comp.push(1);
		comp.push(3);
		comp.push(4);
		comp.push(4);
		comp.push(5);
		comp.push(5);
		assertEquals(1.37, comp.getDpComp(), 0.009);
	}
}
