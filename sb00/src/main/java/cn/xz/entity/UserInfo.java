package cn.xz.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
public class UserInfo {

    private String userName;
    private String password;

    public void ok() {
        log.debug("666");
    }
}
