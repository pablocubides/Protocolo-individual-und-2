package taller7eje2;

public class CBancaria {
    private String NCuenta;
     double Saldo;
    public String TCuenta;

    public CBancaria(String NCuenta, double Saldo, String TCuenta) {
        this.NCuenta = NCuenta;
        this.Saldo = Saldo;
        this.TCuenta = TCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        if (Saldo >= 0) {
            this.Saldo = Saldo;
        } else {
            System.out.println("El saldo no puede ser negativo");
        }
    }

    public void MostrarDetalles() {
        System.out.println("Numero de la cuenta: " + NCuenta);
        System.out.println("Saldo: " + Saldo + " Pesos" );
        System.out.println("Tipo de cuenta: " + TCuenta);
    }
}