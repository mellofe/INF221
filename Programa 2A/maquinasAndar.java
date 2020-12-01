import java.util.ArrayList;
public class maquinasAndar<T> {
	  private ArrayList<Integer> funcionarios = new ArrayList<Integer>();
	  private int nandares;
	  private int minutos;
	  private ArrayList<Integer> andaresSel = new ArrayList<Integer>();
	  public maquinasAndar(int nandares) {
		  this.nandares = nandares;
	  }
	  public void push(Integer elem) {
		  funcionarios.add(elem);
	  }
	  private void calcAndaresMinutos() { //metodo que calcula o numero minimo de minutos e os andares possiveis para a maquina
		  int min = 0;
		  int menormin = -1;
		  int i;
		  for(i=0; i<nandares; i++) {
			  for(int j = 0; j<nandares; j++) {
				  int dif = j-i;
				  if(dif<0) dif = dif*-1;
				  min = min + funcionarios.get(j)*dif*2;
			  }
			  if(menormin == -1) {
				  menormin = min;
				  andaresSel.add(i+1);
				  
			  }
			  else if(min<menormin) {
				  menormin = min;
				  andaresSel.clear();
				  andaresSel.add(i+1);
			  }
			  else if(min == menormin)
				  andaresSel.add(i+1);
			  min = 0;
		  }
		  minutos = menormin;
	  }
	  public int getMinutos() {
		  calcAndaresMinutos();
		  return minutos;
	  }
	  public ArrayList<Integer> getAndaresSel(){
		  return andaresSel;
	  }
}