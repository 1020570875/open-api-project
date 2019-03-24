package com.open.api.bo;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Test1BO implements Serializable {
    private static final long serialVersionUID = -1L;

    @Valid
    @NotEmpty(message = "集合不为空！")
    @Size(min = 1, message = "最小为{min}")
    private List<Item> itemList;

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class Item {
        @NotBlank(message = "username 不能为空！")
        private String username;

        @NotBlank(message = "password 不能为空！")
        private String password;

        @NotBlank(message = "realName 不能为空！")
        private String realName;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }
    }


}