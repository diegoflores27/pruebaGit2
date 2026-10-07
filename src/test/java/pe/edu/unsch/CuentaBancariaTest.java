package pe.edu.unsch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaBancariaTest {

    @Test
    void depositoDebeIncrementarSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.depositar(50);
        assertEquals(150, cuenta.obtenerSaldo());
    }

    @Test
    void cobroDeMantenimientoDebeReducirSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.cobrarMantenimiento(15);
        assertEquals(85, cuenta.obtenerSaldo());
    }
}