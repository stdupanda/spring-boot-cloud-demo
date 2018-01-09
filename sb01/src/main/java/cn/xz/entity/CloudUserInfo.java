package cn.xz.entity;

import java.io.Serializable;

public class CloudUserInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userId;
    private String imei;
    private String onlineMoney;
    private String consumeKey;
    private String tacKey;
    private Integer type;
    private String addTime;
    private String modTime;
    private String cardSeq;
    private String cardNo;
    private Short status;
    private String file15;
    private String file17;
    private Short istest;
    private String phonemodel;
    private Short credit;
    private Short phonetype;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getOnlineMoney() {
        return onlineMoney;
    }

    public void setOnlineMoney(String onlineMoney) {
        this.onlineMoney = onlineMoney == null ? null : onlineMoney.trim();
    }

    public String getConsumeKey() {
        return consumeKey;
    }

    public void setConsumeKey(String consumeKey) {
        this.consumeKey = consumeKey == null ? null : consumeKey.trim();
    }

    public String getTacKey() {
        return tacKey;
    }

    public void setTacKey(String tacKey) {
        this.tacKey = tacKey == null ? null : tacKey.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime == null ? null : modTime.trim();
    }

    public String getCardSeq() {
        return cardSeq;
    }

    public void setCardSeq(String cardSeq) {
        this.cardSeq = cardSeq == null ? null : cardSeq.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getFile15() {
        return file15;
    }

    public void setFile15(String file15) {
        this.file15 = file15 == null ? null : file15.trim();
    }

    public String getFile17() {
        return file17;
    }

    public void setFile17(String file17) {
        this.file17 = file17 == null ? null : file17.trim();
    }

    public Short getIstest() {
        return istest;
    }

    public void setIstest(Short istest) {
        this.istest = istest;
    }

    public String getPhonemodel() {
        return phonemodel;
    }

    public void setPhonemodel(String phonemodel) {
        this.phonemodel = phonemodel == null ? null : phonemodel.trim();
    }

    public Short getCredit() {
        return credit;
    }

    public void setCredit(Short credit) {
        this.credit = credit;
    }

    public Short getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(Short phonetype) {
        this.phonetype = phonetype;
    }
}
