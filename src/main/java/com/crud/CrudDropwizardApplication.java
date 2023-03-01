package com.crud;






import com.crud.api.Employee;
import com.crud.db.generic.EmployeeDao;
import com.crud.api.User;
import com.crud.db.generic.UserDao;
import com.crud.providers.ConfigurationProvider;
import com.crud.providers.ObjectMapperProvider;
import com.crud.resources.UserResource;
import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class CrudDropwizardApplication extends Application<CrudDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
//        new CrudDropwizardApplication().run(args);

        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/homestead?useSSL=false", "root", "root");
        EmployeeDao empDao=new EmployeeDao(jdbi);
        empDao.create(new Employee(129,"keshav-rajput","mailid@gmail.com",10.00));
        Employee emp=empDao.getById(100);
        System.out.println("::::::::"+emp+"::::::");

        UserDao user = new UserDao(jdbi);
        user.create(new User(232,"keshav", "Rajput -----test"));
        User foundUser = user.getById(1);
        System.out.println("::::::::"+foundUser+"::::::");
        List<User> userList=user.getAll();
        System.out.println("::::::::"+userList+"::::::");

    }
    @Override
    public String getName() {
        return "CrudDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<CrudDropwizardConfiguration> bootstrap) {
//        // TODO: application initialization
        bootstrap.addBundle(new MigrationsBundle<CrudDropwizardConfiguration >() {
            @Override
            public PooledDataSourceFactory getDataSourceFactory(CrudDropwizardConfiguration  crudDropwizardConfiguration ) {
                return crudDropwizardConfiguration.getDataSourceFactory();
            }
        });
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(
                        bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor())
        );
    }

    @Override
    public void run(final CrudDropwizardConfiguration configuration,
                    final Environment environment) {
        /* Configuration*/
        ConfigurationProvider configurationProvider = ConfigurationProvider.getInstance();
        configurationProvider.init(configuration, environment);
        ObjectMapperProvider.init();
//        final HelloWorldResource resource = new HelloWorldResource(
//                configuration.getTemplate(),
//                configuration.getDefaultName()
//        );
//        environment.jersey().register(resource);
        environment.jersey().register(new UserResource());
//        environment.jersey().register(new EmployeeResource());
//        UserDao userDao = new UserDao();
//        environment.jersey().register(new UserResourceJooq(userDao));
    }
}
