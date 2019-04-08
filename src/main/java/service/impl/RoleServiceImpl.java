package service.impl;

import dao.IRoleDAO;
import dao.impl.IRoleDAOImpl;
import model.RoleModel;
import service.IRoleService;

public class RoleServiceImpl implements IRoleService {

    private IRoleDAO roleDAO;

    public RoleServiceImpl() {
        this.roleDAO = new IRoleDAOImpl();
    }

    @Override
    public RoleModel findRoleById(Long id) {
        return roleDAO.findRoleById(id);
    }
}
