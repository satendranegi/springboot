/**
 * 
 */
package com.satendranegi.openshift.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satendranegi.openshift.model.Contact;

/**
 * @author SatendraNegi
 *
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
