package com.contentsale.pojo;

import java.util.ArrayList;
import java.util.List;

public class ContentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentsExample() {
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

        public Criteria andContentPriceIsNull() {
            addCriterion("content_price is null");
            return (Criteria) this;
        }

        public Criteria andContentPriceIsNotNull() {
            addCriterion("content_price is not null");
            return (Criteria) this;
        }

        public Criteria andContentPriceEqualTo(Integer value) {
            addCriterion("content_price =", value, "contentPrice");
            return (Criteria) this;
        }

        public Criteria andContentPriceNotEqualTo(Integer value) {
            addCriterion("content_price <>", value, "contentPrice");
            return (Criteria) this;
        }

        public Criteria andContentPriceGreaterThan(Integer value) {
            addCriterion("content_price >", value, "contentPrice");
            return (Criteria) this;
        }

        public Criteria andContentPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_price >=", value, "contentPrice");
            return (Criteria) this;
        }

        public Criteria andContentPriceLessThan(Integer value) {
            addCriterion("content_price <", value, "contentPrice");
            return (Criteria) this;
        }

        public Criteria andContentPriceLessThanOrEqualTo(Integer value) {
            addCriterion("content_price <=", value, "contentPrice");
            return (Criteria) this;
        }

        public Criteria andContentPriceIn(List<Integer> values) {
            addCriterion("content_price in", values, "contentPrice");
            return (Criteria) this;
        }

        public Criteria andContentPriceNotIn(List<Integer> values) {
            addCriterion("content_price not in", values, "contentPrice");
            return (Criteria) this;
        }

        public Criteria andContentPriceBetween(Integer value1, Integer value2) {
            addCriterion("content_price between", value1, value2, "contentPrice");
            return (Criteria) this;
        }

        public Criteria andContentPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("content_price not between", value1, value2, "contentPrice");
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

        public Criteria andContentAbstractIsNull() {
            addCriterion("content_abstract is null");
            return (Criteria) this;
        }

        public Criteria andContentAbstractIsNotNull() {
            addCriterion("content_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andContentAbstractEqualTo(String value) {
            addCriterion("content_abstract =", value, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractNotEqualTo(String value) {
            addCriterion("content_abstract <>", value, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractGreaterThan(String value) {
            addCriterion("content_abstract >", value, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("content_abstract >=", value, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractLessThan(String value) {
            addCriterion("content_abstract <", value, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractLessThanOrEqualTo(String value) {
            addCriterion("content_abstract <=", value, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractLike(String value) {
            addCriterion("content_abstract like", value, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractNotLike(String value) {
            addCriterion("content_abstract not like", value, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractIn(List<String> values) {
            addCriterion("content_abstract in", values, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractNotIn(List<String> values) {
            addCriterion("content_abstract not in", values, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractBetween(String value1, String value2) {
            addCriterion("content_abstract between", value1, value2, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAbstractNotBetween(String value1, String value2) {
            addCriterion("content_abstract not between", value1, value2, "contentAbstract");
            return (Criteria) this;
        }

        public Criteria andContentAllIsNull() {
            addCriterion("content_all is null");
            return (Criteria) this;
        }

        public Criteria andContentAllIsNotNull() {
            addCriterion("content_all is not null");
            return (Criteria) this;
        }

        public Criteria andContentAllEqualTo(String value) {
            addCriterion("content_all =", value, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllNotEqualTo(String value) {
            addCriterion("content_all <>", value, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllGreaterThan(String value) {
            addCriterion("content_all >", value, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllGreaterThanOrEqualTo(String value) {
            addCriterion("content_all >=", value, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllLessThan(String value) {
            addCriterion("content_all <", value, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllLessThanOrEqualTo(String value) {
            addCriterion("content_all <=", value, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllLike(String value) {
            addCriterion("content_all like", value, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllNotLike(String value) {
            addCriterion("content_all not like", value, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllIn(List<String> values) {
            addCriterion("content_all in", values, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllNotIn(List<String> values) {
            addCriterion("content_all not in", values, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllBetween(String value1, String value2) {
            addCriterion("content_all between", value1, value2, "contentAll");
            return (Criteria) this;
        }

        public Criteria andContentAllNotBetween(String value1, String value2) {
            addCriterion("content_all not between", value1, value2, "contentAll");
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

        public Criteria andSaleCountIsNull() {
            addCriterion("sale_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNotNull() {
            addCriterion("sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCountEqualTo(Integer value) {
            addCriterion("sale_count =", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotEqualTo(Integer value) {
            addCriterion("sale_count <>", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThan(Integer value) {
            addCriterion("sale_count >", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_count >=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThan(Integer value) {
            addCriterion("sale_count <", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_count <=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountIn(List<Integer> values) {
            addCriterion("sale_count in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotIn(List<Integer> values) {
            addCriterion("sale_count not in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("sale_count between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_count not between", value1, value2, "saleCount");
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