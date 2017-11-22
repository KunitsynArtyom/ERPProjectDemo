package main.net.cracker.project.model;

import java.math.BigInteger;
import java.util.Collection;
import main.net.cracker.project.model.entity.Vacation;

public interface VacationDAO {

  Boolean createVacation(Vacation vacation);

  Boolean updateVacation(BigInteger id, Vacation vacation);

  Boolean findVacationByUserId(BigInteger id);

  Boolean findVacationByProjectId(BigInteger id);

  Collection<Vacation> findVacationByUserIdAndPmStatus(BigInteger id,
      Boolean status);
//todo check Status
  Collection<Vacation> findVacationByUserIdAndLmStatus(BigInteger id,
      Boolean status);
}
