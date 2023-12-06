package tn.esprit.foyerzainebkhlifi.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerzainebkhlifi.DAO.Entities.Reservation;
import tn.esprit.foyerzainebkhlifi.Services.IReservationService;
import tn.esprit.foyerzainebkhlifi.Services.ReservationService;

import java.util.List;

public class ReservationRestController {
    ReservationService reservationService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Reservation>> getAllReservations(){
        List<Reservation> reservations = reservationService.getAllReservations();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation){
        Reservation addedReservation = reservationService.addReservation(reservation);
        return new ResponseEntity<>(addedReservation, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable String id){
        reservationService.removeReservation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Reservation> modifyReservation(@RequestBody Reservation reservation, @PathVariable String id){
        Reservation modifiedReservation = reservationService.modifyReservation(reservation, id);
        return new ResponseEntity<>(modifiedReservation, HttpStatus.ACCEPTED);
    }


}
