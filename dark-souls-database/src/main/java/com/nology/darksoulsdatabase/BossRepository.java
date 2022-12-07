package com.nology.darksoulsdatabase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BossRepository extends JpaRepository<Boss,Long> {
    void deleteBossById(long id);
    List<Boss> getAllByGameAppearance(int gameAppearance);

}
