package com.nology.darksoulsdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BossService {

    @Autowired
    BossRepository bossRepository;

    public void addBoss(Boss boss){
        bossRepository.save(boss);
    }

    public Boss getBossById(long id){
        Optional<Boss> boss = bossRepository.findById(id);

        if(boss.isEmpty()){
            //EXEPTION!!!!!!!
        }

        return boss.get();
    }

    public List<Boss> getAllBosses(int limit){
        return bossRepository.findAll().stream().limit(limit).collect(Collectors.toList());
    }

    public void updateBoss(Boss newBoss, long id){
        if(!bossRepository.existsById(id)){
            //EXEPTION"""""
        }

        newBoss.setId(id);

        bossRepository.save(newBoss);
    }

    @Transactional
    public void deleteBossById(long id){
        if(!bossRepository.existsById(id)){
            //EXEPTION"""""
        }
        bossRepository.deleteBossById(id);
    }

}
