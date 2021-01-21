package com.kalyan.kafka.publisher;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String name;
    private String designation;
    private String company;
}
