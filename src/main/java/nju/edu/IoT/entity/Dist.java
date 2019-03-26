package nju.edu.IoT.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "T_DIST")
@NoArgsConstructor
public class Dist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "F_ID")
    private int id;
    @Column(name = "F_TOPIC")
    private String topic;
    @Column(name = "F_DIST")
    private int dist;
    @Column(name = "F_RECV_TIME")
    private Timestamp createTime;
}
