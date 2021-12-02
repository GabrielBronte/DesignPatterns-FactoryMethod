import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLoginPJTest {

    @Test
    public void deveLogarPessoaJuridica() {
        IService servico = ServiceFactory.getService("LoginPJ");
        assertEquals("Pessoa jurídica logada no sistema com sucesso", servico.login());
    }
    @Test
    public void deveDeslogarPessoaJuridica() {
        IService servico = ServiceFactory.getService("LoginPJ");
        assertEquals("Pessoa jurídica deslogada no sistema com sucesso", servico.logout());
    }
}