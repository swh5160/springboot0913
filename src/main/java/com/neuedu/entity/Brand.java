package com.neuedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 施子安
 * @create
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    private Integer brandId;
    private String name;
    private String logo;
    private String descript;
}
