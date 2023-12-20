package com.surver.builder;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.surver.services.MemberService;
import com.surver.services.ParticipationService;
import com.surver.services.StatusService;
import com.surver.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class BuilderModuleImp implements BuilderModule {
    MemberService memberService;
    ParticipationService participationService;
    StatusService statusService;
    SurveyService surveyService;

    @Autowired
    public BuilderModuleImp(MemberService memberService,
                            ParticipationService participationService,
                            StatusService statusService,
                            SurveyService surveyService) {
        this.memberService = memberService;
        this.participationService = participationService;
        this.statusService = statusService;
        this.surveyService = surveyService;
    }

    @Override
    public  void loadEntriesFromCSVToDB() throws URISyntaxException {
        List<List<String>> records = new ArrayList<List<String>>();
        Path path = Path.of(URI.create("/resources/Members.csv"));
        System.out.println(path.toString() + "valami");

        System.out.println("Can I put smtg here?");
    }

    public static List<String[]> readLineByLine(Path filePath) throws Exception {
        List<String[]> list = new ArrayList<>();
        try (Reader reader = Files.newBufferedReader(filePath)) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                String[] line;
                while ((line = csvReader.readNext()) != null) {
                    list.add(line);
                }
            }
        }
        return list;
    }
}
