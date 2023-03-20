package FactoryMethod;

public class ServiceFactory {
    public static IService getService (String service) {
        Class classRef = null;
        Object object = null;

        try {
            classRef = Class.forName("FactoryMethod." + service);
            object = classRef.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(object instanceof IService)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IService) object;
    }
}
