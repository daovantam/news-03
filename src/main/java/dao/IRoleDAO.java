package dao;

import model.RoleModel;

public interface IRoleDAO extends IGenericDAO<RoleModel> {
    RoleModel findRoleById(Long id);
}
