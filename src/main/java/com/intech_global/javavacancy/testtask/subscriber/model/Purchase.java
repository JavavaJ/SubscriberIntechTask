package com.intech_global.javavacancy.testtask.subscriber.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "T_PURCHASE")
@NoArgsConstructor
@Getter
@Setter
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "msisdn")
    private String msisdn;


    @Column(name = "issued_at", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime issuedAt;

    @Override
    public String toString() {
        return "Purchase{" +
            "id=" + id +
            ", msisdn='" + msisdn + '\'' +
            ", issuedAt=" + issuedAt +
            '}';
    }
}
