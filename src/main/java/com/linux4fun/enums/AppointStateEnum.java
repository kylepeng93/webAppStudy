package com.linux4fun.enums;

/**
 * 使用枚举表述常量数据字典
 * @author pengkai
 */
public enum AppointStateEnum {
    SUCCESS(1, "ok success"), NO_NUMBER(0, "storage is not enough"), REPEAT_APPOINT(-1, "repeat book"), INNER_ERROR(-2, "system error");

    private int state;
    private String stateInfo;

    /**
     * construct a enum instance
     * @param state
     * @param stateInfo
     */
    AppointStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

}
