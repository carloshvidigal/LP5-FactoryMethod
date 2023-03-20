package FactoryMethod;

public class CertidaoImovelService implements IService{

    public String registrarCertidao() {
        return "Certidão de Casamento registrada";
    }

    @Override
    public String emitirCertidao() {
        return "Certidão de Casamento emitida";
    }
}