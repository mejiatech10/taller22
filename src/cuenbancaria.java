public class cuenbancaria {

    private String numecuenta;
    private String dni;
    private double saldo;

    public cuenbancaria() {
    }

    public cuenbancaria(String numecuenta, String dni, Double saldo) {
        this.numecuenta = numecuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public String getNumecuenta() {
        return numecuenta;
    }

    public void setNumecuenta(String numecuenta) {
        this.numecuenta = numecuenta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }



    public double ingresar (double ingreso){

        var a = this.saldo+=ingreso;
        System.out.println();
        return a;

        //this.saldo+ingreso
    }
    public double retirar (double retirar ){

        if(this.saldo<retirar){
          this.saldo=0;

        }
        return this.saldo-=retirar;

    }
    public double extraccionrapida (){
        double saldo1 ;
        saldo1 = saldo * 0,20;

        if(saldo < saldo1 ){
            System.out.println("saldo insuficiente ");

        }
        return this.saldo;


    }
    public double consultarsaldo(){
        return saldo;

    }
    public double consultardatos(){

        return;
    }
}
