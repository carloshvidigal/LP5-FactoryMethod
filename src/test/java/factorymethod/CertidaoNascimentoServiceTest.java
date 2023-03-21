package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CertidaoNascimentoServiceTest {

    @Test
    void deveRegistrarCertidao() {
        IService service = ServiceFactory.getService("CertidaoNascimentoService");
        assertEquals("Certidão de Nascimento registrada", service.registrarCertidao());
    }

    @Test
    void deveEmitirCertidao() {
        IService service = ServiceFactory.getService("CertidaoNascimentoService");
        assertEquals("Certidão de Nascimento emitida", service.emitirCertidao());
    }
}
