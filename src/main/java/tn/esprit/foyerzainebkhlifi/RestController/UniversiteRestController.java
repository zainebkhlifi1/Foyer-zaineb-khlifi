package tn.esprit.foyerzainebkhlifi.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Universite;
import tn.esprit.foyerzainebkhlifi.Services.IUniversiteService;
import tn.esprit.foyerzainebkhlifi.Services.UniversiteService;

import java.util.List;

public class UniversiteRestController {

    UniversiteService universiteService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Universite>> getAllUniversites(){
        List<Universite> universites = universiteService.getAllUniversites();
        return new ResponseEntity<>(universites, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Universite> addUniversite(@RequestBody Universite universite){
        Universite addedUniversite = universiteService.addUniversite(universite);
        return new ResponseEntity<>(addedUniversite, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUniversite(@PathVariable long id){
        universiteService.removeUniversite(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Universite> modifyUniversite(@RequestBody Universite universite, @PathVariable long id){
        Universite modifiedUniversite = universiteService.modifyUniversite(universite, id);
        return new ResponseEntity<>(modifiedUniversite, HttpStatus.ACCEPTED);
    }

}
