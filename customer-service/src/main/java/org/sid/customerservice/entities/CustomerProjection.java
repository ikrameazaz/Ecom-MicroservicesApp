package org.sid.customerservice.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(types=Customer.class ,name = "p1")
public interface CustomerProjection {
    public Long getId();
    public String getNom();
    public String getEmail();

}
