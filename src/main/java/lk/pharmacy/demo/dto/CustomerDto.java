package lk.pharmacy.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created By Imesh Hirushan
 * Project Name : demo
 * Package Name : lk.pharmacy.demo.dto
 * Date : Feb 3, 2024
 * Time : 9:24 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {
    private Long id;
    private String name;
    private String address;
    private double salary;
}
