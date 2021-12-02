import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLoginPFTest {

    @Test
    public void deveLogarPessoaFisica() {
        IService servico = ServiceFactory.getService("LoginPF");
        assertEquals("Pessoa física logada no sistema com sucesso", servico.login());
    }
    @Test
    public void deveDeslogarPessoaFisica() {
        IService servico = ServiceFactory.getService("LoginPF");
        assertEquals("Pessoa física deslogada no sistema com sucesso", servico.logout());
    }
}