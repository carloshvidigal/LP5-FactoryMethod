package factorymethod;

public class CertidaoImovelService implements IService{

    public String registrarCertidao() {
        return "Certidão de imóvel registrada";
    }

    @Override
    public String emitirCertidao() {
        return "Certidão de imóvel emitida";
    }
}