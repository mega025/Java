public class CuentaAhorros extends CuentaBancaria {
    
    private double interesAnual;
    
        public CuentaAhorros(double saldo, double interesAnual){
            super(saldo);
            this.interesAnual = interesAnual;
        }
        public double getInteresAnual() {
            return interesAnual;
        }

        public void setInteresAnual(double interesAnual) {
            this.interesAnual = interesAnual;
        } 
        
        public void retirar(int retira){
            if (this.saldo >= retira) {
                this.saldo -= retira;
                System.out.println("se ha retirado  " + retira);
            }
             System.out.println("saldo insuficiente");
             
        }

        public void calcularInteres (){
            
        }
       @Override
       public String toString() {
           
           return "cuentaAhorro " + "interes Anual " + interesAnual + "saldo " + saldo ;
       }

       
    
}
