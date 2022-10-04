package dao.custom;

import dao.SuperDAO;
import entity.Program;

import java.sql.SQLException;

public interface ProgramDAO extends SuperDAO<Program,String> {

    public String getProgramIds() throws SQLException,ClassNotFoundException;
}
