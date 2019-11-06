package apap.tutorial.gopud.service;

import apap.tutorial.gopud.model.RoleModel;
import org.apache.maven.lifecycle.internal.LifecycleStarter;

import java.util.List;

public interface RoleService {
    List<RoleModel> findAll();
}
