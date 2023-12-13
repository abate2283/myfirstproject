package org.bate.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientDetailDatabase {

    public static List<ClientDetails> getClients(){

            return Stream.of(
            new ClientDetails("James", 44, "james@com", Arrays.asList("202-212-3445", "102-456-9087")),
            new ClientDetails("Sunday", 24, "sunday@yahoo.com", Arrays.asList("190-354-7654", "909-908-8765")),
            new ClientDetails("Ames", 35, "ames@gmail.com", Arrays.asList("800-432-9000", "887-765-8976")),
            new ClientDetails("Messi", 24, "messi@email.com", Arrays.asList("561-897-0987", "918-776-4536"))).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<ClientDetails> clients = ClientDetailDatabase.getClients();
        List<String> clientsList = clients.stream()
                .map(clientDetails -> clientDetails.getEmailAddress()).collect(Collectors.toList());
        System.out.println(clientsList);
//        clientsList.forEach(System.out::println);

        System.out.println("*********USING FLATMAP BELOW*************");
        List<String> flatMapList = clients.stream()
                .flatMap(clientDetails -> clientDetails.getContact().stream()).collect(Collectors.toList());
        System.out.println(flatMapList);
//        flatMapList.forEach(System.out::println);
    }

}
