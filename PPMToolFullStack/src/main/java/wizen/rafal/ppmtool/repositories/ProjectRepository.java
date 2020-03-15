package wizen.rafal.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import wizen.rafal.ppmtool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository <Project, Long> {

}
