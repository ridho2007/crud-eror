package com.toko.online.toko.online.auditing;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable {

    @JsonFormat(pattern ="yyy-MM-dd")
    @CreationTimestamp
    @Column(name ="dibuat", updatable = false)
private Date dibuat;

//    @JsonFormat(pattern ="yyy-MM-dd")
//    @LastModifiedDate
//    @Column(name="updated_at")
//    private Date updatedAt;


    public Date getDibuat() {
        return dibuat;
    }

    public void setDibuat(Date dibuat) {
        this.dibuat = dibuat;
    }
}
