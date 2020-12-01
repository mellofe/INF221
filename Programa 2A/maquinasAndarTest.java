import static org.junit.Assert.*;

import org.junit.Test;

public class maquinasAndarTest {
	@Test
	public void primeiroTeste() {
		maquinasAndar<Integer> min = new maquinasAndar<Integer>(3);
		min.push(10);
		min.push(20);
		min.push(30);
		assertEquals(80, min.getMinutos());
		assertEquals(2, (int)min.getAndaresSel().get(0));
		assertEquals(3, (int)min.getAndaresSel().get(1));
	}

	@Test
	public void segundoTeste() {
		maquinasAndar<Integer> min = new maquinasAndar<Integer>(3);
		min.push(10);
		min.push(30);
		min.push(20);
		assertEquals(60, min.getMinutos());
		assertEquals(2, (int)min.getAndaresSel().get(0));
	}
	
	@Test
	public void terceiroTeste() {
		maquinasAndar<Integer> min = new maquinasAndar<Integer>(3);
		min.push(30);
		min.push(10);
		min.push(20);
		assertEquals(100, min.getMinutos());
		assertEquals(1, (int)min.getAndaresSel().get(0));
		assertEquals(2, (int)min.getAndaresSel().get(1));
	}
	
	@Test
	public void quartoTeste() {
		maquinasAndar<Integer> min = new maquinasAndar<Integer>(5);
		min.push(80);
		min.push(50);
		min.push(10);
		min.push(5);
		min.push(15);
		assertEquals(290, min.getMinutos());
		assertEquals(1, (int)min.getAndaresSel().get(0));
		assertEquals(2, (int)min.getAndaresSel().get(1));
	}
}
