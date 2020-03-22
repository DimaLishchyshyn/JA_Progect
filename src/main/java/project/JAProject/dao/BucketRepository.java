package project.JAProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.JAProject.domain.Bucket;

public interface BucketRepository extends JpaRepository<Bucket, Integer>{

}
