package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calc;

    // @BeforeEach: O JUnit roda isso automaticamente ANTES de CADA @Test
    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void deveriaSomarDoisNumeros() {
        // Não preciso dar 'new' aqui, o setUp já fez!
        int resultado = calc.somar(5, 5);
        Assertions.assertEquals(10, resultado);
    }

    @Test
    void deveriaLancarErroAoDividirPorZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        });
    }

    @Test
    void deveriaVerificarSeNumeroEPar() {
        // assertTrue: O teste só passa se o resultado for TRUE
        boolean resultado = calc.ehPar(4);
        Assertions.assertTrue(resultado, "4 deveria ser par");
    }

    @Test
    void deveriaVerificarSeNumeroEImpar() {
        // assertFalse: O teste só passa se o resultado for FALSE
        boolean resultado = calc.ehPar(5);
        Assertions.assertFalse(resultado, "5 não deveria ser par");
    }

    @Test
    @DisplayName("Deve calcular juros simples corretamente")
    void deveriaCalcularJurosSimples() {
        // Cenário: Investimento de 1.000 reais
        // Taxa: 10% ao mês (0.10)
        // Tempo: 5 meses
        // Fórmula: J = C * i * t  ->  1000 * 0.10 * 5 = 500

        double juros = calc.calcularJurosSimples(1000, 0.10, 5);

        Assertions.assertEquals(500.0, juros);
    }

    @Test
    void deveCalcularJurosSimples() {
        // Cenário 1
        double juros = calc.calcularJurosSimples(1000, 0.10, 5);
        Assertions.assertEquals(500.0, juros);

        // Cenário 2 (Prova real)
        // 2000 reais, 10%, 2 meses = 400 reais
        double juros2 = calc.calcularJurosSimples(2000, 0.10, 2);
        Assertions.assertEquals(400.0, juros2);
    }
}