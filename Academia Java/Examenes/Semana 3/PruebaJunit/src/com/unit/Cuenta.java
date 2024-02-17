package x;

public class Cuenta {
    double saldo;
    String NUMCuenta;

    public Cuenta(String NUMCuenta, double saldo) {
        this.NUMCuenta = NUMCuenta;
        this.saldo = saldo;
    }

    public boolean Valida() {
        return NUMCuenta.startsWith("GA");
    }

    public String EstatusCuenta() {
        String val = "00";

        if (!this.Valida()) {
            val = "01";  
        }

        return val;
    }
    
    public boolean Retiro(double monto) {
        return saldo <= monto;
    }

    
}
