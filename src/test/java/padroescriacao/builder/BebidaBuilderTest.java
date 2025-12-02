package padroescriacao.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaBuilderTest {

    @Test
    void deveRetornarExcecaoParaBebidaSemNome() {
        try {
            BebidaBuilder bebidaBuilder = new BebidaBuilder();
            Bebida bebida = bebidaBuilder
                    .setTamanho("Grande")
                    .setPreco(8.50)
                    .setTipo("Café")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome da bebida inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaBebidaSemTamanho() {
        try {
            BebidaBuilder bebidaBuilder = new BebidaBuilder();
            Bebida bebida = bebidaBuilder
                    .setNome("Cappuccino")
                    .setPreco(8.50)
                    .setTipo("Café")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tamanho da bebida inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaBebidaSemPreco() {
        try {
            BebidaBuilder bebidaBuilder = new BebidaBuilder();
            Bebida bebida = bebidaBuilder
                    .setNome("Cappuccino")
                    .setTamanho("Grande")
                    .setTipo("Café")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaBebidaSemTipo() {
        try {
            BebidaBuilder bebidaBuilder = new BebidaBuilder();
            Bebida bebida = bebidaBuilder
                    .setNome("Cappuccino")
                    .setTamanho("Grande")
                    .setPreco(8.50)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo da bebida inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarBebidaValidaCompleta() {
        BebidaBuilder bebidaBuilder = new BebidaBuilder();
        Bebida bebida = bebidaBuilder
                .setNome("Cappuccino")
                .setTamanho("Grande")
                .setPreco(8.50)
                .setTipo("Café")
                .setTemperatura("Quente")
                .setDescricao("Espresso com leite vaporizado")
                .setCalorias(180)
                .setContemCafeina(true)
                .setContemLeite(true)
                .setContemChantilly(true)
                .build();

        assertNotNull(bebida);
        assertEquals("Cappuccino", bebida.getNome());
        assertEquals("Grande", bebida.getTamanho());
        assertEquals(8.50, bebida.getPreco());
        assertEquals("Café", bebida.getTipo());
        assertEquals("Quente", bebida.getTemperatura());
        assertTrue(bebida.isContemCafeina());
        assertTrue(bebida.isContemLeite());
        assertTrue(bebida.isContemChantilly());
    }

    @Test
    void deveRetornarChaGeladoValido() {
        BebidaBuilder bebidaBuilder = new BebidaBuilder();
        Bebida bebida = bebidaBuilder
                .setNome("Chá Verde")
                .setTamanho("Médio")
                .setPreco(6.00)
                .setTipo("Chá")
                .setTemperatura("Gelado")
                .setDescricao("Chá verde com gengibre")
                .setCalorias(25)
                .setContemCafeina(true)
                .build();

        assertNotNull(bebida);
        assertEquals("Chá Verde", bebida.getNome());
        assertTrue(bebida.isContemCafeina());
        assertFalse(bebida.isContemLeite());
        assertFalse(bebida.isContemChantilly());
    }

    @Test
    void deveRetornarSucoValidoGelado() {
        BebidaBuilder bebidaBuilder = new BebidaBuilder();
        Bebida bebida = bebidaBuilder
                .setNome("Suco de Laranja")
                .setTamanho("Grande")
                .setPreco(7.50)
                .setTipo("Suco")
                .setTemperatura("Gelado")
                .setDescricao("Suco natural de laranja prensada")
                .setCalorias(120)
                .setContemAcucar(false)
                .build();

        assertNotNull(bebida);
        assertEquals("Suco de Laranja", bebida.getNome());
        assertFalse(bebida.isContemCafeina());
        assertFalse(bebida.isContemAcucar());
    }

    @Test
    void deveRetornarBebidaMinimaValida() {
        BebidaBuilder bebidaBuilder = new BebidaBuilder();
        Bebida bebida = bebidaBuilder
                .setNome("Água")
                .setTamanho("Pequeno")
                .setPreco(1.50)
                .setTipo("Bebida")
                .build();

        assertNotNull(bebida);
        assertEquals("Água", bebida.getNome());
        assertEquals("Pequeno", bebida.getTamanho());
        assertEquals(1.50, bebida.getPreco());
    }

    @Test
    void deveAceitarOrdemDiferenteDeSetters() {
        BebidaBuilder bebidaBuilder = new BebidaBuilder();
        Bebida bebida = bebidaBuilder
                .setPreco(9.00)
                .setTipo("Café")
                .setNome("Mocha")
                .setTamanho("Médio")
                .setTemperatura("Quente")
                .setCalorias(200)
                .setContemCafeina(true)
                .setContemChantilly(true)
                .setContemLeite(true)
                .build();

        assertNotNull(bebida);
        assertEquals("Mocha", bebida.getNome());
        assertEquals(9.00, bebida.getPreco());
    }

    @Test
    void deveRetornarExcecaoParaPrecoNegativo() {
        try {
            BebidaBuilder bebidaBuilder = new BebidaBuilder();
            Bebida bebida = bebidaBuilder
                    .setNome("Café")
                    .setTamanho("Pequeno")
                    .setPreco(-5.00)
                    .setTipo("Café")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido", e.getMessage());
        }
    }
}
