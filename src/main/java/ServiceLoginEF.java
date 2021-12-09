public class ServiceLoginEF implements IService{
    public String login() {
        return "Token de acesso a usuário Entidade Filantrópica validado no sistema com sucesso";
    }
    public String logout() {
        return "Token de acesso a usuário Entidade Filantrópica revogado no sistema com sucesso";
    }
}
