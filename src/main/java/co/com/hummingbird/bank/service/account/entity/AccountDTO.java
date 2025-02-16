package co.com.hummingbird.bank.service.account.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "ACCOUNTS")
@Entity
public class AccountDTO {

    @Id
    String id;

    @Column(name = "FIRST_NAME")
    String firstName;

    @Column(name = "FIRST_SURNAME")
    String firstSurname;

    @Column(name = "DOCUMENT_ID")
    String documentId;

    @Column(name = "BALANCE")
    double balance;
}
