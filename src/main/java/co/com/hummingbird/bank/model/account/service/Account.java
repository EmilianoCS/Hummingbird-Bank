package co.com.hummingbird.bank.model.account.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class Account {

    String id;
    String firstName;
    String firstSurname;
    String documentId;
    double balance;
}
