package tn.esprit.foyerzainebkhlifi.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Bloc;
import tn.esprit.foyerzainebkhlifi.Services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {

    IBlocService iBlocService;

    @GetMapping("getAll")
    public List<Bloc> getAlL() {
        return iBlocService.findAllBlocs();
    }

    @PostMapping("addAllBlocs")
    public List<Bloc> addAllBlocs(@RequestBody List<Bloc> blocs) {
        return iBlocService.addAllBlocs(blocs);
    }

    // http://localhost:8080/getById?id=1@GetMapping("getById")
    public Bloc getById(@RequestParam long id) {
        return iBlocService.findBlocById(id);
    }

    // http://localhost:8080/getById2/1@GetMapping("getById2/{id}")
    public Bloc getById2(@PathVariable long id) {
        return iBlocService.findBlocById(id);


    }
}