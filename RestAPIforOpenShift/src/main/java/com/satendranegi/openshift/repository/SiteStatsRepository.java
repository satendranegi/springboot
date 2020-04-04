package com.satendranegi.openshift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satendranegi.openshift.model.SiteStats;

@Repository
public interface SiteStatsRepository extends JpaRepository<SiteStats, Long> {

}
