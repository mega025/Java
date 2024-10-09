abstract class CuentaBancaria {
    
   public double saldo;
    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

        public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

     abstract void depositar();
     abstract void retirar();

   

}
