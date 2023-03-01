package com.crud.providers;

import com.crud.CrudDropwizardConfiguration;
import com.crud.db.EmployeeDAO;
import com.crud.db.UserDAO;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

public class DAOProvider {
    private static final DAOProvider INSTANCE = new DAOProvider();
    private Map<String, Object> daoMap;

    private Jdbi JDBI;
    private Jdbi analyticsDBI;

    private DAOProvider() {
        ConfigurationProvider configurationProvider = ConfigurationProvider.getInstance();
        Environment environment = configurationProvider.getEnvironment();
        CrudDropwizardConfiguration configuration=configurationProvider.getCrudDropwizardConfiguration();
        JdbiFactory dbiFactory = new JdbiFactory();
        JDBI = dbiFactory.build(environment, configuration.getDataSourceFactory(), "homestead");
        daoMap = new ConcurrentHashMap<>();
        init();
    }
    public static DAOProvider getInstance() {
        return INSTANCE;
    }
    private void init() {
        daoMap.put(UserDAO.class.getCanonicalName(), JDBI.onDemand(UserDAO.class));

        ;
    }
    public UserDAO getUserDAO() {
        Object result = daoMap.get(UserDAO.class.getCanonicalName());
        if (result instanceof UserDAO) {
            return (UserDAO) result;
        } else {
            throw new NoSuchElementException("Unable to get CityDAO");

        }
    }
    public EmployeeDAO getEmployeeDAO() {
        Object result = daoMap.get(EmployeeDAO.class.getCanonicalName());
        if (result instanceof EmployeeDAO) {
            return (EmployeeDAO) result;
        } else {
            throw new NoSuchElementException("Unable to get CityDAO");
        }
    }
}