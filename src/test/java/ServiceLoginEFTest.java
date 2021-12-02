import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLoginEFTest {

    @Test
    public void deveLogarEntidadeFilantropica() {
        IService servico = ServiceFactory.getService("LoginEF");
        assertEquals("Entidade Filantrópica logada no sistema com sucesso", servico.login());
    }
    @Test
    public void deveDeslogarEntidadeFilantropica() {
        IService servico = ServiceFactory.getService("LoginEF");
        assertEquals("Entidade Filantrópica deslogada no sistema com sucesso", servico.logout());
    }
}