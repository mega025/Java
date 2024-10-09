public class CuentaCorriente extends CuentaBancaria {
    
private int envios;

    public CuentaCorriente(double saldo ,int envios){
        super(saldo);
    this.envios = envios;
    }   

    public int getEnvios() {
        return envios;
    }


    public void setEnvios(int envios) {
        this.envios = envios;
    }
    
   
    public void depositar(int deposita){
        saldo += deposita;
        System.out.println("se ha depositado " + deposita);

    }
    public void retirar(int retira){
        if (this.saldo >= retira) {
            this.saldo -= retira;
            System.out.println("se ha retirado  " + retira);
        }
         System.out.println("saldo insuficiente");
         
    }
   @Override
   public String toString() {
       
       return "cuentaCorriente " + "envios " + envios + "saldo " + saldo ;
   }


   
}
