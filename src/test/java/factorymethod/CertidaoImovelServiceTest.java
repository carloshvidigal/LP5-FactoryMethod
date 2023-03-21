package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CertidaoImovelServiceTest {

    @Test
    void deveRegistrarCertidao() {
        IService service = ServiceFactory.getService("CertidaoImovelService");
        assertEquals("Certidão de imóvel registrada", service.registrarCertidao());
    }

    @Test
    void deveEmitirCertidao() {
        IService service = ServiceFactory.getService("CertidaoImovelService");
        assertEquals("Certidão de imóvel emitida", service.emitirCertidao());
    }
}
