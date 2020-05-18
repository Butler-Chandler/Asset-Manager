package ceb.assetManager.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomBaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

}