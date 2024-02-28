package br.com.fiap.elevador;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ElevadorTest {

    @Test
    @DisplayName("deve atualizar carga atual ao entrar no elevador")
    void entrarNoElevadorTest() {
        Elevador el = new Elevador();
        el.setCargaAtual(0);

        assertEquals(el.getCargaAtual(), 0, 0);

        el.entrarNoElevador(72.8);
        assertEquals(el.getCargaAtual(), 72.8, 8);
    }

    @Test
    @DisplayName("deve atualizar carga atual ao sair no elevador")
    void sairDoElevadorTest() {
        Elevador el = new Elevador();
        el.setCargaAtual(133.45);
        assertEquals(el.getCargaAtual(), 133.45, 0);

        el.sairDoElevador(72.8);
        assertEquals(el.getCargaAtual(), 60.65, 65);
    }

    @Test
    @DisplayName("deve ligar sinal de alerta se peso maior que carga maxima")
    void avaliarPesoTest_LigarAlerta() {
        Elevador el = new Elevador();
        el.setCargaAtual(201);
        assertEquals(el.getCargaAtual(), 201, 0);

        el.avaliarPeso(el.getCargaAtual());
        assertTrue(el.isSinalAlerta());
    }

    @Test
    @DisplayName("deve desligar sinal de alerta se peso menor que carga maxima")
    void avaliarPesoTest_DesligarAlerta() {
        Elevador el = new Elevador();
        el.setCargaMaxima(200);
        assertEquals(el.getCargaMaxima(), 200, 0);

        el.setCargaAtual(199);
        assertEquals(el.getCargaAtual(), 199, 0);

        el.avaliarPeso(el.getCargaAtual());
        assertFalse(el.isSinalAlerta());
    }
}
