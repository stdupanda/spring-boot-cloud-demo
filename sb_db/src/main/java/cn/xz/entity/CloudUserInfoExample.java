package cn.xz.entity;

import java.util.ArrayList;
import java.util.List;

public class CloudUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CloudUserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyIsNull() {
            addCriterion("online_money is null");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyIsNotNull() {
            addCriterion("online_money is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyEqualTo(String value) {
            addCriterion("online_money =", value, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyNotEqualTo(String value) {
            addCriterion("online_money <>", value, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyGreaterThan(String value) {
            addCriterion("online_money >", value, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("online_money >=", value, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyLessThan(String value) {
            addCriterion("online_money <", value, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyLessThanOrEqualTo(String value) {
            addCriterion("online_money <=", value, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyLike(String value) {
            addCriterion("online_money like", value, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyNotLike(String value) {
            addCriterion("online_money not like", value, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyIn(List<String> values) {
            addCriterion("online_money in", values, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyNotIn(List<String> values) {
            addCriterion("online_money not in", values, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyBetween(String value1, String value2) {
            addCriterion("online_money between", value1, value2, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andOnlineMoneyNotBetween(String value1, String value2) {
            addCriterion("online_money not between", value1, value2, "onlineMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyIsNull() {
            addCriterion("consume_key is null");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyIsNotNull() {
            addCriterion("consume_key is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyEqualTo(String value) {
            addCriterion("consume_key =", value, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyNotEqualTo(String value) {
            addCriterion("consume_key <>", value, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyGreaterThan(String value) {
            addCriterion("consume_key >", value, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("consume_key >=", value, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyLessThan(String value) {
            addCriterion("consume_key <", value, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyLessThanOrEqualTo(String value) {
            addCriterion("consume_key <=", value, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyLike(String value) {
            addCriterion("consume_key like", value, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyNotLike(String value) {
            addCriterion("consume_key not like", value, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyIn(List<String> values) {
            addCriterion("consume_key in", values, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyNotIn(List<String> values) {
            addCriterion("consume_key not in", values, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyBetween(String value1, String value2) {
            addCriterion("consume_key between", value1, value2, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andConsumeKeyNotBetween(String value1, String value2) {
            addCriterion("consume_key not between", value1, value2, "consumeKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyIsNull() {
            addCriterion("tac_key is null");
            return (Criteria) this;
        }

        public Criteria andTacKeyIsNotNull() {
            addCriterion("tac_key is not null");
            return (Criteria) this;
        }

        public Criteria andTacKeyEqualTo(String value) {
            addCriterion("tac_key =", value, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyNotEqualTo(String value) {
            addCriterion("tac_key <>", value, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyGreaterThan(String value) {
            addCriterion("tac_key >", value, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyGreaterThanOrEqualTo(String value) {
            addCriterion("tac_key >=", value, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyLessThan(String value) {
            addCriterion("tac_key <", value, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyLessThanOrEqualTo(String value) {
            addCriterion("tac_key <=", value, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyLike(String value) {
            addCriterion("tac_key like", value, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyNotLike(String value) {
            addCriterion("tac_key not like", value, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyIn(List<String> values) {
            addCriterion("tac_key in", values, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyNotIn(List<String> values) {
            addCriterion("tac_key not in", values, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyBetween(String value1, String value2) {
            addCriterion("tac_key between", value1, value2, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTacKeyNotBetween(String value1, String value2) {
            addCriterion("tac_key not between", value1, value2, "tacKey");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("add_time like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("add_time not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("mod_time is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(String value) {
            addCriterion("mod_time =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(String value) {
            addCriterion("mod_time <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(String value) {
            addCriterion("mod_time >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mod_time >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(String value) {
            addCriterion("mod_time <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(String value) {
            addCriterion("mod_time <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLike(String value) {
            addCriterion("mod_time like", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotLike(String value) {
            addCriterion("mod_time not like", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<String> values) {
            addCriterion("mod_time in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<String> values) {
            addCriterion("mod_time not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(String value1, String value2) {
            addCriterion("mod_time between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(String value1, String value2) {
            addCriterion("mod_time not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andCardSeqIsNull() {
            addCriterion("card_seq is null");
            return (Criteria) this;
        }

        public Criteria andCardSeqIsNotNull() {
            addCriterion("card_seq is not null");
            return (Criteria) this;
        }

        public Criteria andCardSeqEqualTo(String value) {
            addCriterion("card_seq =", value, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqNotEqualTo(String value) {
            addCriterion("card_seq <>", value, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqGreaterThan(String value) {
            addCriterion("card_seq >", value, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqGreaterThanOrEqualTo(String value) {
            addCriterion("card_seq >=", value, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqLessThan(String value) {
            addCriterion("card_seq <", value, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqLessThanOrEqualTo(String value) {
            addCriterion("card_seq <=", value, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqLike(String value) {
            addCriterion("card_seq like", value, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqNotLike(String value) {
            addCriterion("card_seq not like", value, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqIn(List<String> values) {
            addCriterion("card_seq in", values, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqNotIn(List<String> values) {
            addCriterion("card_seq not in", values, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqBetween(String value1, String value2) {
            addCriterion("card_seq between", value1, value2, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardSeqNotBetween(String value1, String value2) {
            addCriterion("card_seq not between", value1, value2, "cardSeq");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFile15IsNull() {
            addCriterion("file15 is null");
            return (Criteria) this;
        }

        public Criteria andFile15IsNotNull() {
            addCriterion("file15 is not null");
            return (Criteria) this;
        }

        public Criteria andFile15EqualTo(String value) {
            addCriterion("file15 =", value, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15NotEqualTo(String value) {
            addCriterion("file15 <>", value, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15GreaterThan(String value) {
            addCriterion("file15 >", value, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15GreaterThanOrEqualTo(String value) {
            addCriterion("file15 >=", value, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15LessThan(String value) {
            addCriterion("file15 <", value, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15LessThanOrEqualTo(String value) {
            addCriterion("file15 <=", value, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15Like(String value) {
            addCriterion("file15 like", value, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15NotLike(String value) {
            addCriterion("file15 not like", value, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15In(List<String> values) {
            addCriterion("file15 in", values, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15NotIn(List<String> values) {
            addCriterion("file15 not in", values, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15Between(String value1, String value2) {
            addCriterion("file15 between", value1, value2, "file15");
            return (Criteria) this;
        }

        public Criteria andFile15NotBetween(String value1, String value2) {
            addCriterion("file15 not between", value1, value2, "file15");
            return (Criteria) this;
        }

        public Criteria andFile17IsNull() {
            addCriterion("file17 is null");
            return (Criteria) this;
        }

        public Criteria andFile17IsNotNull() {
            addCriterion("file17 is not null");
            return (Criteria) this;
        }

        public Criteria andFile17EqualTo(String value) {
            addCriterion("file17 =", value, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17NotEqualTo(String value) {
            addCriterion("file17 <>", value, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17GreaterThan(String value) {
            addCriterion("file17 >", value, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17GreaterThanOrEqualTo(String value) {
            addCriterion("file17 >=", value, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17LessThan(String value) {
            addCriterion("file17 <", value, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17LessThanOrEqualTo(String value) {
            addCriterion("file17 <=", value, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17Like(String value) {
            addCriterion("file17 like", value, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17NotLike(String value) {
            addCriterion("file17 not like", value, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17In(List<String> values) {
            addCriterion("file17 in", values, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17NotIn(List<String> values) {
            addCriterion("file17 not in", values, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17Between(String value1, String value2) {
            addCriterion("file17 between", value1, value2, "file17");
            return (Criteria) this;
        }

        public Criteria andFile17NotBetween(String value1, String value2) {
            addCriterion("file17 not between", value1, value2, "file17");
            return (Criteria) this;
        }

        public Criteria andIstestIsNull() {
            addCriterion("istest is null");
            return (Criteria) this;
        }

        public Criteria andIstestIsNotNull() {
            addCriterion("istest is not null");
            return (Criteria) this;
        }

        public Criteria andIstestEqualTo(Short value) {
            addCriterion("istest =", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestNotEqualTo(Short value) {
            addCriterion("istest <>", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestGreaterThan(Short value) {
            addCriterion("istest >", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestGreaterThanOrEqualTo(Short value) {
            addCriterion("istest >=", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestLessThan(Short value) {
            addCriterion("istest <", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestLessThanOrEqualTo(Short value) {
            addCriterion("istest <=", value, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestIn(List<Short> values) {
            addCriterion("istest in", values, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestNotIn(List<Short> values) {
            addCriterion("istest not in", values, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestBetween(Short value1, Short value2) {
            addCriterion("istest between", value1, value2, "istest");
            return (Criteria) this;
        }

        public Criteria andIstestNotBetween(Short value1, Short value2) {
            addCriterion("istest not between", value1, value2, "istest");
            return (Criteria) this;
        }

        public Criteria andPhonemodelIsNull() {
            addCriterion("phonemodel is null");
            return (Criteria) this;
        }

        public Criteria andPhonemodelIsNotNull() {
            addCriterion("phonemodel is not null");
            return (Criteria) this;
        }

        public Criteria andPhonemodelEqualTo(String value) {
            addCriterion("phonemodel =", value, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelNotEqualTo(String value) {
            addCriterion("phonemodel <>", value, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelGreaterThan(String value) {
            addCriterion("phonemodel >", value, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelGreaterThanOrEqualTo(String value) {
            addCriterion("phonemodel >=", value, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelLessThan(String value) {
            addCriterion("phonemodel <", value, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelLessThanOrEqualTo(String value) {
            addCriterion("phonemodel <=", value, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelLike(String value) {
            addCriterion("phonemodel like", value, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelNotLike(String value) {
            addCriterion("phonemodel not like", value, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelIn(List<String> values) {
            addCriterion("phonemodel in", values, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelNotIn(List<String> values) {
            addCriterion("phonemodel not in", values, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelBetween(String value1, String value2) {
            addCriterion("phonemodel between", value1, value2, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andPhonemodelNotBetween(String value1, String value2) {
            addCriterion("phonemodel not between", value1, value2, "phonemodel");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Short value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Short value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Short value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Short value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Short value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Short value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Short> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Short> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Short value1, Short value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Short value1, Short value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andPhonetypeIsNull() {
            addCriterion("phoneType is null");
            return (Criteria) this;
        }

        public Criteria andPhonetypeIsNotNull() {
            addCriterion("phoneType is not null");
            return (Criteria) this;
        }

        public Criteria andPhonetypeEqualTo(Short value) {
            addCriterion("phoneType =", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeNotEqualTo(Short value) {
            addCriterion("phoneType <>", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeGreaterThan(Short value) {
            addCriterion("phoneType >", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeGreaterThanOrEqualTo(Short value) {
            addCriterion("phoneType >=", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeLessThan(Short value) {
            addCriterion("phoneType <", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeLessThanOrEqualTo(Short value) {
            addCriterion("phoneType <=", value, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeIn(List<Short> values) {
            addCriterion("phoneType in", values, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeNotIn(List<Short> values) {
            addCriterion("phoneType not in", values, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeBetween(Short value1, Short value2) {
            addCriterion("phoneType between", value1, value2, "phonetype");
            return (Criteria) this;
        }

        public Criteria andPhonetypeNotBetween(Short value1, Short value2) {
            addCriterion("phoneType not between", value1, value2, "phonetype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }
    }
}
