package org.example.ext;

import org.example.dao.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        return 90;
    }
}
