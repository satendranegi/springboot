/**
 * 
 */
package com.satendranegi.openshift.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satendranegi.openshift.model.Posts;

/**
 * @author SatendraNegi
 *
 */
public interface PostsRepository extends JpaRepository<Posts,Long>{

}
