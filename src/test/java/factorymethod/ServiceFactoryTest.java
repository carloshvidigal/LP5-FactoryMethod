package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceFactoryTest {
    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IService service = ServiceFactory.getService("Reconhecer Firma");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

        @Test
        void deveRetornarExcecaoParaServicoInvalido() {
            try {
                IService service = ServiceFactory.getService("CertidaoNegativaService");
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Serviço inválido", e.getMessage());
            }
        }
    }

