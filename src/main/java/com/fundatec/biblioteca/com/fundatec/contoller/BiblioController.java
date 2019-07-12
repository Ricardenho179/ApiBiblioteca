package com.fundatec.biblioteca.com.fundatec.contoller;

import com.fundatec.biblioteca.com.fundatec.domain.Biblioteca;
import com.fundatec.biblioteca.com.fundatec.repositoy.BiblioRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/biblioteca")
public class BiblioController {


    @Autowired
    private BiblioRepository repository;

@RequestMapping(value = "/", method = RequestMethod.GET)
public List<Biblioteca> getBibliteca() {
    return repository.findAll();
}

@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Biblioteca getBibliotecaById(@PathVariable("id") ObjectId _id) {
        return repository.findBy_id(_id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Biblioteca inseriBiblioteca(@Valid @RequestBody Biblioteca biblio) {

    biblio.set_id(ObjectId.get());
    repository.save(biblio);
    return biblio;
    }
@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void editaBiblioteca(@PathVariable("id")ObjectId _id, @Valid @RequestBody Biblioteca biblio) {
    biblio.set_id(_id);
    repository.save(biblio);
}
@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletaBiblioteca(@PathVariable ObjectId _id) {
    repository.delete(repository.findBy_id(_id));
}

}
