package nju.edu.IoT.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "T_TEMP")
@NoArgsConstructor
public class Temp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "F_ID")
    private int id;
    @Column(name = "F_TOPIC")
    private String topic;
    @Column(name = "F_TEMP")
    private String temp;
    @Column(name = "F_RECV_TIME")
    private Timestamp createTime;
}
