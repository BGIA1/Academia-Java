package x;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNIT {
    @Test
    public void Test1() {
    	GeneraCargo(new Cuenta("GAEL345678901234567890", 1000.0),500);
    }
    
    @Test
    public void Test2() {
    	GeneraCargo(new Cuenta("GAEL345678901234567890", 1000.0),5000);
    }
    
    @Test
    public void Test3() {
    	GeneraCargo(new Cuenta("OtraCuenta12345678901234", 500.0),80);
    }
    
    @Test
    public void Test4() {
    	GeneraCargo(new Cuenta("OtraCuenta12345678901234", 500.0),800);
    }

    private void GeneraCargo(Cuenta cuenta, double monto) {
        assertEquals("00", cuenta.EstatusCuenta(), "La cuenta no es valida");
        assertTrue(cuenta.Retiro(monto), "No se pudo realizar el retiro de "+monto+" fondos insuficientes");
    }
    
}
