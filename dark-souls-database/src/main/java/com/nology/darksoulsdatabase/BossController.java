package com.nology.darksoulsdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BossController {

    @Autowired
    BossService bossService;

    @PostMapping("/boss")
    public ResponseEntity<Boss> createBoss(@RequestBody Boss boss){
        bossService.addBoss(boss);
        return ResponseEntity.status(HttpStatus.CREATED).body(boss);
    }

    @GetMapping("/bosses")
    public ResponseEntity<List<Boss>> getBosses(@RequestParam(required=false) String bossName, @RequestParam(defaultValue = "10") int limit){
        if(bossName!=null){
//            return ResponseEntity.status(HttpStatus.OK).body(bossService.getBossByName(bossName,limit));
       }
        return ResponseEntity.status(HttpStatus.OK).body(bossService.getAllBosses(limit));
    }
}

