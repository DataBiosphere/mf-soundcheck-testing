package bio.terra.soundchecktest.service;

import bio.terra.common.db.ReadTransaction;
import bio.terra.common.db.WriteTransaction;
import bio.terra.soundchecktest.dao.ExampleDao;
import bio.terra.soundchecktest.model.Example;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
  private final ExampleDao exampleDao;

  public ExampleService(ExampleDao exampleDao) {
    this.exampleDao = exampleDao;
  }

  // README docs/transactions.md
  @WriteTransaction
  public void saveExample(Example example) {
    exampleDao.upsertExample(example);
  }

  @ReadTransaction
  public Optional<Example> getExampleForUser(String userId) {
    return exampleDao.getExampleForUser(userId);
  }
}
