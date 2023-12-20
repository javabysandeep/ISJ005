package model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
}
