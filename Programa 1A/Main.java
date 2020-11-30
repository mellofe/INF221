import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		  Scanner ler = new Scanner(System.in);
		  int n, k;
		  n = ler.nextInt();
		  k = ler.nextInt();
		  NotasCompetidores<Integer> comp = new NotasCompetidores<Integer>(n,k);
		  for(int i=0; i<n; i++) {
			  int nota = ler.nextInt();
			  comp.push(nota);
		  }
		  System.out.printf("%d\n%.2f\n%.2f\n%.2f\n%.2f\n", comp.getClassificados(), comp.getDpClass(), comp.getMediaClass(), comp.getDpComp(), comp.getMediaComp());
		  ler.close();
	  }
}
 