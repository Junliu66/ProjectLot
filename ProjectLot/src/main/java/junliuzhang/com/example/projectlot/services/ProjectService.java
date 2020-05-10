package junliuzhang.com.example.projectlot.services;

import junliuzhang.com.example.projectlot.domain.Project;
import junliuzhang.com.example.projectlot.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        return projectRepository.save(project);
    }
}
