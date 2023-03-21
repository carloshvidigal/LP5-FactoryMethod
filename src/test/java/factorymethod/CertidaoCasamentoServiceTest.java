package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CertidaoCasamentoServiceTest {

    @Test
    void deveRegistrarCertidao() {
        IService service = ServiceFactory.getService("CertidaoCasamentoService");
        assertEquals("Certidão de Casamento registrada", service.registrarCertidao());
    }

    @Test
    void deveEmitirCertidao() {
        IService service = ServiceFactory.getService("CertidaoCasamentoService");
        assertEquals("Certidão de Casamento emitida", service.emitirCertidao());
    }
}

















