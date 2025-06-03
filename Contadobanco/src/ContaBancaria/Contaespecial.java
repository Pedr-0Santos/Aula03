package ContaBancaria;

public class Contaespecial extends Conta {
      private double limite;

      public Contaespecial() {
    	  super();
    	  this.limite = 0.0;
      }
      
      public Contaespecial(double limite) {
    	  super();
    	  this.limite = limite;
  
      }
      
      
      public Contaespecial(String n, int num, double v, double l) {
		super(n, num, v);
		this.limite = l;
	}

	public double getLimite() {
    	  return this.limite;
      }
      public void setLimite(double limite) {
    	  this.limite = limite;
      }
}









