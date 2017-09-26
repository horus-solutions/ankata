package com.horus.ankata.core.repository;

import com.horus.ankata.core.domain.common.ComCivilites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CiviliteRepository extends JpaRepository<ComCivilites, Long> {
}
