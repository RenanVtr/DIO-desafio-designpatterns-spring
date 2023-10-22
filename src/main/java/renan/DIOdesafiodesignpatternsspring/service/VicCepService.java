package renan.DIOdesafiodesignpatternsspring.service;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import renan.DIOdesafiodesignpatternsspring.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws" )
public interface VicCepService {
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Endereco consultarCEP(@PathVariable("cep") String cep);
}
