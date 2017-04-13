package tpjava;

public class Avion extends Vehicule {
	 public Avion()
     {
         super();
     }

	 public void rouler() throws Exception
     {
         int altitude=4;
		if (altitude>0)
            throw new Exception("L'avion en vol ne peut rouler");
         else super.rouler();
     }
}
