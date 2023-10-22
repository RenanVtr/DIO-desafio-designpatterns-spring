package renan.DIOdesafiodesignpatternsspring.service.impl;

import renan.DIOdesafiodesignpatternsspring.model.Cliente;
import renan.DIOdesafiodesignpatternsspring.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{
    


@Override
public Iterable<Cliente> buscarTodos(){
    //TODO: buscar todos os clientes
    return null;
}

@Override
public Cliente buscarPorId(Long id){
    //TODO: buscar cliente por id
    return null;
}

@Override
public void inserir(Cliente cliente){
    //TODO: inserir cliente
}

@Override
public void atualizar(Long id, Cliente cliente){
    //TODO: atualizar cliente
}

@Override
public void deletar(Long id){
    //TODO: deletar cliente
}
}
