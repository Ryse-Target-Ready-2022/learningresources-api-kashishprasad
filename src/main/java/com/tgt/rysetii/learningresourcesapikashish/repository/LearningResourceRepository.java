package com.tgt.rysetii.learningresourcesapikashish.repository;

import com.tgt.rysetii.learningresourcesapikashish.entity.LearningResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningResourceRepository extends JpaRepository<LearningResource, Integer> {
}
