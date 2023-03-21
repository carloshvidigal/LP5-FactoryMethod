package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CertidaoObitoServiceTest {
    @Test
    void deveRegistrarCertidao() {
        IService service = ServiceFactory.getService("CertidaoObitoService");
        assertEquals("Certidão de óbito registrada", service.registrarCertidao());
    }

    @Test
    void deveEmitirCertidao() {
        IService service = ServiceFactory.getService("CertidaoObitoService");
        assertEquals("Certidão de óbito emitida", service.emitirCertidao());
    }
}
