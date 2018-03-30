package cn.azuray.entity;

public enum RedisTokenEnum {
    LOGIN("Login:","用户登陆");
    public String value;
    public String name;

    RedisTokenEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
