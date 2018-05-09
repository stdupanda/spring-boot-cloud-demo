package cn.xz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 3272525596704112313L;
    private String name;
    private String pwd;
}
