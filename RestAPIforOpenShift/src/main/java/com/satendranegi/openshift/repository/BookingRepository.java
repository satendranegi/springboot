package com.satendranegi.openshift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satendranegi.openshift.model.BookingRequest;

@Repository
public interface BookingRepository extends JpaRepository<BookingRequest, Long> {

}
