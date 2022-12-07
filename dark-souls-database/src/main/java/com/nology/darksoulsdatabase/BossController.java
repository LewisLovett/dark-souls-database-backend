package com.nology.darksoulsdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8080"})

public class BossController {

    @Autowired
    BossService bossService;

    @PostMapping("/boss")
    public ResponseEntity<Boss> createBoss(@RequestBody Boss boss){
        bossService.addBoss(boss);
        return ResponseEntity.status(HttpStatus.CREATED).body(boss);
    }

    @GetMapping("/bosses")
    public ResponseEntity<List<Boss>> getBosses(@RequestParam(required=false) String gameAppearance, @RequestParam(defaultValue = "10") int limit){
        if(gameAppearance!=null){
            return ResponseEntity.status(HttpStatus.OK).body(bossService.getBossesByGameAppearance(Integer.parseInt(gameAppearance),limit));
       }
        return ResponseEntity.status(HttpStatus.OK).body(bossService.getAllBosses(limit));
    }

    @GetMapping("/boss/{id}")
    public ResponseEntity<Boss> getBossById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK).body(bossService.getBossById(id));
    }

    @PutMapping("/boss/{id}")
    public ResponseEntity<Boss> updateBoss(@RequestBody Boss updatedBoss, @PathVariable long id){
        updatedBoss.setId(id);
        bossService.updateBoss(updatedBoss,id);
        return ResponseEntity.status(HttpStatus.OK).body(updatedBoss);
    }

    @DeleteMapping("/boss/{id}")
    public ResponseEntity<Void> deleteBossById(@PathVariable long id){
        bossService.deleteBossById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

