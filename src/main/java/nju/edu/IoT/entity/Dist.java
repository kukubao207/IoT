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
@Table(name = "dist")
@NoArgsConstructor
public class Dist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "topic")
    private String topic;
    @Column(name = "dist")
    private int dist;
    @Column(name = "create_time")
    private Timestamp createTime;
}
