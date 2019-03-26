package nju.edu.IoT.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "temp")
@NoArgsConstructor
public class Temp {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "topic")
    private String topic;
    @Column(name = "temp")
    private String temp;
    @Column(name = "create_time")
    private Timestamp createTime;
}
