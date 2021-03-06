package junliuzhang.com.example.projectlot.repositories;

import junliuzhang.com.example.projectlot.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String project);

    @Override
    Iterable<Project> findAll();
}
