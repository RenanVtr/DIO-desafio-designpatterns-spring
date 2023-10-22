package renan.DIOdesafiodesignpatternsspring.service;

import renan.DIOdesafiodesignpatternsspring.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void deletar(Long id);

    void atualizar(Long id, Cliente cliente);
}
