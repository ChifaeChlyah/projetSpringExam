package com.example.jwtspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
/*import org.springframework.data.rest.core.config.RepositoryRestConfiguration;*/


import com.example.jwtspring.dao.CategoryRepository;
import com.example.jwtspring.dao.ProductRepository;
import com.example.jwtspring.service.AccountService;

@EnableJpaAuditing /* (auditorAwareRef ="auditorAware") */
@SpringBootApplication
public class projetExamSpring implements CommandLineRunner {

	@Autowired
	AccountService accountService;
	@Autowired
	ProductRepository productRepository ;
	@Autowired
	CategoryRepository categoryRepository;

	
	/*
	 * @Bean public AuditorAware<String> auditorAware() { return new SpringSe; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(projetExamSpring.class, args);
	}
	
	//@Bean
	/*
	 * public BCryptPasswordEncoder getBCPE() { return new BCryptPasswordEncoder();
	 * 
	 * }
	 */

	@Override
	public void run(String... args) throws Exception {
		/*
		 * accountService.saveUser(new
		 * AppUser(null,"admin@gmail.com","admin","1234",null));
		 * accountService.saveUser(new
		 * AppUser(null,"user@gmail.com","user","1234",null));
		 * accountService.saveRole(new AppRole(null,"ADMIN"));
		 * accountService.saveRole(new AppRole(null,"USER"));
		 * accountService.addRoleToUser("admin@gmail.com", "ADMIN");
		 * accountService.addRoleToUser("admin@gmail.com", "USER");
		 * accountService.addRoleToUser("user@gmail.com", "USER");
		 * Stream.of("T1","T2","T3").forEach(t->{ taskRepository.save(new Task(null,t));
		 * });
		 */
		/*
		 * accountService.saveUser(new
		 * AppUser(null,"adminuser@gmail.com","admin2","1234",null));
		 * accountService.addRoleToUser("adminuser@gmail.com", "ROLE_ADMIN_USER");
		 */
		/*
		 * taskRepository.findAll().forEach(t->{ System.out.println(t.getTaskName());
		 * });
		 */
		System.out.println("YEY");
		
		
		/*
		 * Random rdm = new Random(); categoryRepository.save(new
		 * Category(null,"category1","3-pst_categorylist.jpg","descr category1",null));
		 * categoryRepository.save(new
		 * Category(null,"category2","5-pst_categorylist.jpg","descr category2",null));
		 * categoryRepository.save(new
		 * Category(null,"category3","11-pst_categorylist.jpg","descr category3",null));
		 * categoryRepository.findAll().forEach(c->{ for(int i=0;i<7;i++) {
		 * productRepository.save(new
		 * Product(null,(rdm.nextLong(10000))+100,c.getName()+" "+RandomString.make(6),
		 * RandomString.make(24),(rdm.nextInt(10000))+100,1,
		 * rdm.nextBoolean(),rdm.nextBoolean(),rdm.nextBoolean(),c.getId()+".jpg",c));
		 * }});
		 */
		
		//System.out.println(productRepository.findById(14L).get().getCategory().getName());
		
		
	}

}
