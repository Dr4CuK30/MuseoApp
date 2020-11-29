package co.com.mintic.MuseoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MuseoAppApplication {

	public static void main(String[] args) {		            
            new MainFrame().setVisible(true);                
	}

        public static void initSpring(String[] args)
        {
            SpringApplication.run(MuseoAppApplication.class, args);
        }
}
