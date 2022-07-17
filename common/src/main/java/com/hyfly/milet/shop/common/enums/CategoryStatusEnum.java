package com.hyfly.milet.shop.common.enums;

public enum CategoryStatusEnum {
    AVAILABLE((byte) 1),
    UNAVAILABLE((byte) 2);

    private final byte val;

    CategoryStatusEnum(byte val) {
        this.val = val;
    }

    public byte getVal() {
        return val;
    }
}
