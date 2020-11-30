import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.Assert.*;

public class NotasCompetidores<T> {
	  private ArrayList<Integer> notas = new ArrayList<Integer>();
	  private int minclassificados;
	  private int classificados;
	  private int ncompetidores;
	  private double mediacomp;
	  private double mediaclass;
	  private double dpComp;
	  private double dpClass;
	  public NotasCompetidores(int competidores, int minclassificados) {
		  this.minclassificados = minclassificados;
		  this.ncompetidores = competidores;
	  }
	  public void push(Integer elem) {
		  notas.add(elem);
	  }
	  Comparator<Integer> comparador = new Comparator<Integer>() {
		  public int compare(Integer a1, Integer a2) {
			  if(a1>a2) return -1;
			  if(a1<a2) return 1;
			  else return 0;
		  }
	  };
	  public void encontraClassificados() {
		  classificados = minclassificados;
		  Collections.sort(notas, comparador);
		  for(int i=minclassificados; i<ncompetidores; i++) {
			  if(notas.get(i).equals(notas.get(minclassificados-1)))
				  classificados += 1;
			  else
				  break;
		  }
	  }
	  public void calcMediaClass() {
		  encontraClassificados();
		  double soma = 0;
		  for(int i=0; i<classificados; i++)
			  soma += notas.get(i);
		  mediaclass = soma/classificados;
	  }
	  public void calcDpClass() {
		  encontraClassificados();
		  calcMediaClass();
		  double total = 0;
		  for(int i=0; i<classificados; i++)
			  total += (mediaclass-notas.get(i))*(mediaclass-notas.get(i));
		  dpClass = Math.sqrt(total/classificados);
	  }
	  public void calcMediaComp() {
		  double soma = 0;
		  for(int i=0; i<notas.size(); i++)
			  soma += notas.get(i);
		  mediacomp = soma/ncompetidores;
	  }
	  public void calcDpComp() {
		  calcMediaComp();
		  double total = 0;
		  for(int i=0; i<ncompetidores; i++)
			  total += (mediacomp-notas.get(i))*(mediacomp-notas.get(i));
		  dpComp = Math.sqrt(total/ncompetidores);
	  }
	  public double getMediaComp() {
		  calcMediaComp();
		  return mediacomp;
	  }
	  public double getMediaClass() {
		  calcMediaClass();
		  return mediaclass;
	  }
	  public int getClassificados() {
		  encontraClassificados();
		  return classificados;
	  }
	  public double getDpClass() {
		  calcDpClass();
		  return dpClass;
	  }
	  public double getDpComp() {
		  calcDpComp();
		  return dpComp;
	  }
}
