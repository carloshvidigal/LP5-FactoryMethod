package factorymethod;

public class CertidaoObitoService implements IService{

    public String registrarCertidao() {
        return "Certidão de óbito registrada";
    }

    @Override
    public String emitirCertidao() {
        return "Certidão de óbito emitida";
    }
}
