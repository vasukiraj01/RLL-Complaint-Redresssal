//package com.entity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
//import org.springframework.stereotype.Component;
//import javax.sql.DataSource;
//
//@Component
//public class sqlcalling {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void loadData() {
//            ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator(false, false, "UTF-8", new FileSystemResource("D:\\SpringBootProject-master\\src\\main\\java\\com\\sql\\index.sql"));
//        resourceDatabasePopulator.execute(dataSource);
//    }
//}