package main.net.cracker.project.model;

import java.io.File;
import java.math.BigInteger;
import java.util.Date;
import main.net.cracker.project.model.entity.User;

public interface UserDAO {

  User createUser(User user);

  Boolean updateUser(BigInteger id, User user);

  User findUserByUserId(BigInteger id);

  User findUserByLogin(String login);

  Boolean updatePhoneNumber(BigInteger id, String phoneNumber);

  Boolean updateEmail(BigInteger id, String email);

  Boolean updatePassword(BigInteger id, String password);

  Boolean updatePhoto(BigInteger id, File photo);

  void updateWorkingPeriodByUserId(BigInteger userId, BigInteger projectId);

  enum JobTitle {
    PROJECT_MANAGER, LINE_MANAGER, SOFTWARE_ENGINEER;

    private Integer id;

    JobTitle(Integer id) {
      this.id = id;
    }

    JobTitle() {
      this.id = 0;
    }
  }


  class WorkPeriod {

    BigInteger userId;
    BigInteger projectId;
    Date startWorkDate;
    Date endWorkDate;

    public WorkPeriod(BigInteger userId, BigInteger projectId,
        Date startWorkDate, Date endWorkDate) {
      this.userId = userId;
      this.projectId = projectId;
      this.startWorkDate = startWorkDate;
      this.endWorkDate = endWorkDate;
    }
  }
}
