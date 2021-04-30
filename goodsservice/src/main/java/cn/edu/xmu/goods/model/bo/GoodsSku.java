package cn.edu.xmu.goods.model.bo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author XC
 */

@Data
public class GoodsSku implements Serializable {
    private Long id;

    private String skuSn;

    private String name;

    private Long originalPrice;

    private String configuration;

    private Long weight;

    private String imageUrl;

    private Integer inventory;

    private String detail;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    private Byte disabled;

    private Long goodsSpuId;

    private Byte statecode;

    public enum State {
        WAITING(0, "未上架"),
        INVALID(4, "上架"),
        DELETED(6, "已删除");

        private static final Map<Integer, State> stateMap;

        static { //由类加载机制，静态块初始加载对应的枚举属性到map中，而不用每次取属性时，遍历一次所有枚举值
            stateMap = new HashMap();
            for (GoodsSku.State enum1 : values()) {
                stateMap.put(enum1.code, enum1);
            }
        }

        private int code;
        private String description;

        State(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public static GoodsSku.State getTypeByCode(Integer code) {
            return stateMap.get(code);
        }

        public int getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }
    }

    public GoodsSku(){}

}