package nju.edu.IoT.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "T_HUMID")
@NoArgsConstructor
public class Humid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "F_ID")
    private int id;
    @Column(name = "F_TOPIC")
    private String topic;
    @Column(name = "F_HUMID")
    private String humid;
    @Column(name = "F_RECV_TIME")
    private Timestamp createTime;
}
