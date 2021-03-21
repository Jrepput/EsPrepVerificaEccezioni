import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
    String nm, matr, eta;
    int n, matrr;
    File f = new File("test.txt");
    File v = new File("eskere.txt");
    try {
      if(!f.createNewFile())
               throw new IOException("File esiste gia!");
    }
    catch (IOException e){
      System.out.println(e); 
    }
    try {
      if(!v.createNewFile())
               throw new IOException("File esiste gia!");
    }
    catch (IOException e){
      System.out.println(e); 
    }
    PrintWriter fw = new PrintWriter(f);
    PrintWriter vw = new PrintWriter(v);
	  Scanner sfile = new Scanner(f);//Scanner collegato al file
    Scanner svile = new Scanner(v);
    System.out.print("Inserisci Matricola: ");
    n = s.nextInt();
    while (sfile.hasNextLine()) { // Lettura del file
      var str = sfile.nextLine();
      fw.write(" ");
      var res = str.split(", ");
      nm = res[0];
      matr = res[1];
      eta = res[2];
      matrr = Integer.parseInt(matr);
        if(matrr!=n){
          System.out.println(nm+" "+ matrr +" "+ eta);
          vw.write(nm+", "+ matrr +", "+ eta);
        }
      while (svile.hasNextLine()){
        str = sfile.nextLine();
        res = str.split(", ");
        nm = res[0];
        matr = res[1];
        eta = res[2];
        fw.write(nm+", "+ matr +", "+ eta);
      }
    }
  }
}