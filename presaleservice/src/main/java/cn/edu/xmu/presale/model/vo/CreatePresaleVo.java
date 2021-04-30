package cn.edu.xmu.presale.model.vo;

import cn.edu.xmu.presale.model.po.PresalePo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @author XC 3304
 * Created at 2020-12-06 08:47
 * Modified at 2020-12-24 14:58
 */

@Data
public class CreatePresaleVo {
    private String name;

    private Long advancePayPrice;

    private Long restPayPrice;

    private Integer quantity;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime beginTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime payTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAdvancePayPrice() {
        return advancePayPrice;
    }

    public void setAdvancePayPrice(Long advancePayPrice) {
        this.advancePayPrice = advancePayPrice;
    }

    public Long getRestPayPrice() {
        return restPayPrice;
    }

    public void setRestPayPrice(Long restPayPrice) {
        this.restPayPrice = restPayPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public PresalePo createPresale() {
        PresalePo presalePo = new PresalePo();
        presalePo.setName(name);
        presalePo.setAdvancePayPrice(advancePayPrice);
        presalePo.setRestPayPrice(restPayPrice);
        presalePo.setQuantity(quantity);
        presalePo.setBeginTime(beginTime);
        presalePo.setPayTime(payTime);
        presalePo.setEndTime(endTime);
        return presalePo;
    }
}
