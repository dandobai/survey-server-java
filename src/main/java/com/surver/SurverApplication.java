package com.surver;

import com.surver.builder.BuilderModule;
import com.surver.models.Survey;
import com.surver.services.MemberService;
import com.surver.services.ParticipationService;
import com.surver.services.StatusService;
import com.surver.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SurverApplication implements CommandLineRunner {
	@Autowired
	BuilderModule builderModule;

	public static void main(String[] args) {
		SpringApplication.run(SurverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//builderModule.loadEntriesFromCSVToDB();
		System.out.println("builderModule method is under development");
	}
}
