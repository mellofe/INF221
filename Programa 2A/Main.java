import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	  public static void main(String[] args) {
		  Scanner ler = new Scanner(System.in);
		  int n;
		  n = ler.nextInt();
		  maquinasAndar<Integer> min = new maquinasAndar<Integer>(n);
		  for(int i=0; i<n; i++) {
			  int func = ler.nextInt();
			  min.push(func);
		  }
		  System.out.printf("%d\n", min.getMinutos());
		  ArrayList<Integer> andaresSel = new ArrayList<Integer>();
		  andaresSel = min.getAndaresSel();
		  for(int i=0; i<andaresSel.size(); i++) {
			  if(i<(andaresSel.size()-1))
				  System.out.printf("%d ", andaresSel.get(i));
			  else
				  System.out.printf("%d", andaresSel.get(i));
		  }
		  System.out.printf("\n");
		  ler.close();
	  }
}