package diagram.agenda;

import org.springframework.orm.jpa.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.transaction.*;
import org.springframework.transaction.annotation.*;


/**
 * Classe que configura os beans para persistencia
 * 
 * @author local
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "diagram.agenda-EntityManagerFactory",
        transactionManagerRef = "diagram.agenda-TransactionManager"
)
class AgendaConfiguration {
  

    @Bean(name="diagram.agenda-EntityManagerFactory")
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("diagram.agenda");
        return factoryBean;
    }

    @Bean(name = "diagram.agenda-TransactionManager")
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager(entityManagerFactory().getObject());
    }


}


