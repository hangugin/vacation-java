package com.study._34_Builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class MemberLombok {
    private String name;
    private int age;
    private String email;

}
