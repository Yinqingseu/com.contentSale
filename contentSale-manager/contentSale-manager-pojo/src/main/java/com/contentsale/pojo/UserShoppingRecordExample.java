package com.contentsale.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserShoppingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserShoppingRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Integer value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Integer value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Integer value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Integer value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Integer> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Integer> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Integer value1, Integer value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeIsNull() {
            addCriterion("shopping_time is null");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeIsNotNull() {
            addCriterion("shopping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeEqualTo(String value) {
            addCriterion("shopping_time =", value, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeNotEqualTo(String value) {
            addCriterion("shopping_time <>", value, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeGreaterThan(String value) {
            addCriterion("shopping_time >", value, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_time >=", value, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeLessThan(String value) {
            addCriterion("shopping_time <", value, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeLessThanOrEqualTo(String value) {
            addCriterion("shopping_time <=", value, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeLike(String value) {
            addCriterion("shopping_time like", value, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeNotLike(String value) {
            addCriterion("shopping_time not like", value, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeIn(List<String> values) {
            addCriterion("shopping_time in", values, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeNotIn(List<String> values) {
            addCriterion("shopping_time not in", values, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeBetween(String value1, String value2) {
            addCriterion("shopping_time between", value1, value2, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingTimeNotBetween(String value1, String value2) {
            addCriterion("shopping_time not between", value1, value2, "shoppingTime");
            return (Criteria) this;
        }

        public Criteria andShoppingCountIsNull() {
            addCriterion("shopping_count is null");
            return (Criteria) this;
        }

        public Criteria andShoppingCountIsNotNull() {
            addCriterion("shopping_count is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingCountEqualTo(Integer value) {
            addCriterion("shopping_count =", value, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCountNotEqualTo(Integer value) {
            addCriterion("shopping_count <>", value, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCountGreaterThan(Integer value) {
            addCriterion("shopping_count >", value, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_count >=", value, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCountLessThan(Integer value) {
            addCriterion("shopping_count <", value, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCountLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_count <=", value, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCountIn(List<Integer> values) {
            addCriterion("shopping_count in", values, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCountNotIn(List<Integer> values) {
            addCriterion("shopping_count not in", values, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCountBetween(Integer value1, Integer value2) {
            addCriterion("shopping_count between", value1, value2, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_count not between", value1, value2, "shoppingCount");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIsNull() {
            addCriterion("shopping_price is null");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIsNotNull() {
            addCriterion("shopping_price is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceEqualTo(Integer value) {
            addCriterion("shopping_price =", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotEqualTo(Integer value) {
            addCriterion("shopping_price <>", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThan(Integer value) {
            addCriterion("shopping_price >", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_price >=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThan(Integer value) {
            addCriterion("shopping_price <", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_price <=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIn(List<Integer> values) {
            addCriterion("shopping_price in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotIn(List<Integer> values) {
            addCriterion("shopping_price not in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceBetween(Integer value1, Integer value2) {
            addCriterion("shopping_price between", value1, value2, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_price not between", value1, value2, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andContentTitleIsNull() {
            addCriterion("content_title is null");
            return (Criteria) this;
        }

        public Criteria andContentTitleIsNotNull() {
            addCriterion("content_title is not null");
            return (Criteria) this;
        }

        public Criteria andContentTitleEqualTo(String value) {
            addCriterion("content_title =", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotEqualTo(String value) {
            addCriterion("content_title <>", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleGreaterThan(String value) {
            addCriterion("content_title >", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleGreaterThanOrEqualTo(String value) {
            addCriterion("content_title >=", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLessThan(String value) {
            addCriterion("content_title <", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLessThanOrEqualTo(String value) {
            addCriterion("content_title <=", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLike(String value) {
            addCriterion("content_title like", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotLike(String value) {
            addCriterion("content_title not like", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleIn(List<String> values) {
            addCriterion("content_title in", values, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotIn(List<String> values) {
            addCriterion("content_title not in", values, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleBetween(String value1, String value2) {
            addCriterion("content_title between", value1, value2, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotBetween(String value1, String value2) {
            addCriterion("content_title not between", value1, value2, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentPictureIsNull() {
            addCriterion("content_picture is null");
            return (Criteria) this;
        }

        public Criteria andContentPictureIsNotNull() {
            addCriterion("content_picture is not null");
            return (Criteria) this;
        }

        public Criteria andContentPictureEqualTo(String value) {
            addCriterion("content_picture =", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureNotEqualTo(String value) {
            addCriterion("content_picture <>", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureGreaterThan(String value) {
            addCriterion("content_picture >", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureGreaterThanOrEqualTo(String value) {
            addCriterion("content_picture >=", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureLessThan(String value) {
            addCriterion("content_picture <", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureLessThanOrEqualTo(String value) {
            addCriterion("content_picture <=", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureLike(String value) {
            addCriterion("content_picture like", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureNotLike(String value) {
            addCriterion("content_picture not like", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureIn(List<String> values) {
            addCriterion("content_picture in", values, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureNotIn(List<String> values) {
            addCriterion("content_picture not in", values, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureBetween(String value1, String value2) {
            addCriterion("content_picture between", value1, value2, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureNotBetween(String value1, String value2) {
            addCriterion("content_picture not between", value1, value2, "contentPicture");
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
    }
}