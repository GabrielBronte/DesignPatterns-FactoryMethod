public class ServiceLoginPF implements IService{
    public String login() {
        return "Token de acesso a usuário Pessoa física validado no sistema com sucesso";
    }
    public String logout() {
        return "Token de acesso a usuário Pessoa física revogado no sistema com sucesso";
    }
}
