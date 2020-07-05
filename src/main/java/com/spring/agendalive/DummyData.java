package com.spring.agendalive;

import com.spring.agendalive.document.LiveDocument;
import com.spring.agendalive.repository.LiveRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

//@Component
//public class DummyData implements CommandLineRunner {
////	private final LiveRepository liveRepository;
////	private final LiveDocument liveDocument;
////
////    DummyData(LiveRepository liveRepository, LiveDocument liveDocument) {
////        this.liveRepository = liveRepository;
////        this.liveDocument = liveDocument;
////    }
////
////    @Override
////    public void run(String... args) throws Exception {
////
////        liveRepository.deleteAll()
////                .thenMany(
////                        Flux.just(, "Deploy de uma aplicação java no IBM Cloud", "Java 8",
////                                "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
////                                .map(nome -> new LiveDocument(UUID.randomUUID().toString(), nome))
////                                .flatMap(liveRepository::save))
////                .subscribe(System.out::println);
////        liveRepository.save(new LiveDocument(UUID.randomUUID().toString(), "API REST Spring Boot", "blablabla", ));
////    }
//}
