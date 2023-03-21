package factorymethod;

public class CertidaoNascimentoService implements IService{

    public String registrarCertidao() {
        return "Certidão de Nascimento registrada";
    }

    @Override
    public String emitirCertidao() {
        return "Certidão de Nascimento emitida";
    }
}