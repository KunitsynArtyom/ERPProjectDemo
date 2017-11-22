package main.net.cracker.project.model;

import java.math.BigInteger;
import java.util.Date;
import main.net.cracker.project.model.entity.Project;

public interface ProjectDAO {

  Boolean createProject(Project project);

  Project findProjectByProjectId(BigInteger id);

  Project findProjectByName(String name);

  Project findProjectByDate(Date startDate);

  Boolean deleteUserByUserId(BigInteger userId, BigInteger projectID);

  Boolean updateProject(BigInteger id, Project project);

  Boolean addUser(BigInteger userId, BigInteger projectId);

  class Sprint {

    BigInteger sprintId;
    String name;
    Date startDate;
    Date endDate;

    Sprint(BigInteger sprintId, String name, Date startDate,
        Date endDate) {
    }

  }
}
