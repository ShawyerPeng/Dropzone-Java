package po;

import java.util.ArrayList;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInameIsNull() {
            addCriterion("iname is null");
            return (Criteria) this;
        }

        public Criteria andInameIsNotNull() {
            addCriterion("iname is not null");
            return (Criteria) this;
        }

        public Criteria andInameEqualTo(String value) {
            addCriterion("iname =", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotEqualTo(String value) {
            addCriterion("iname <>", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThan(String value) {
            addCriterion("iname >", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThanOrEqualTo(String value) {
            addCriterion("iname >=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThan(String value) {
            addCriterion("iname <", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThanOrEqualTo(String value) {
            addCriterion("iname <=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLike(String value) {
            addCriterion("iname like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotLike(String value) {
            addCriterion("iname not like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameIn(List<String> values) {
            addCriterion("iname in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotIn(List<String> values) {
            addCriterion("iname not in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameBetween(String value1, String value2) {
            addCriterion("iname between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotBetween(String value1, String value2) {
            addCriterion("iname not between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andIurlIsNull() {
            addCriterion("iurl is null");
            return (Criteria) this;
        }

        public Criteria andIurlIsNotNull() {
            addCriterion("iurl is not null");
            return (Criteria) this;
        }

        public Criteria andIurlEqualTo(String value) {
            addCriterion("iurl =", value, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlNotEqualTo(String value) {
            addCriterion("iurl <>", value, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlGreaterThan(String value) {
            addCriterion("iurl >", value, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlGreaterThanOrEqualTo(String value) {
            addCriterion("iurl >=", value, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlLessThan(String value) {
            addCriterion("iurl <", value, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlLessThanOrEqualTo(String value) {
            addCriterion("iurl <=", value, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlLike(String value) {
            addCriterion("iurl like", value, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlNotLike(String value) {
            addCriterion("iurl not like", value, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlIn(List<String> values) {
            addCriterion("iurl in", values, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlNotIn(List<String> values) {
            addCriterion("iurl not in", values, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlBetween(String value1, String value2) {
            addCriterion("iurl between", value1, value2, "iurl");
            return (Criteria) this;
        }

        public Criteria andIurlNotBetween(String value1, String value2) {
            addCriterion("iurl not between", value1, value2, "iurl");
            return (Criteria) this;
        }

        public Criteria andIsizeIsNull() {
            addCriterion("isize is null");
            return (Criteria) this;
        }

        public Criteria andIsizeIsNotNull() {
            addCriterion("isize is not null");
            return (Criteria) this;
        }

        public Criteria andIsizeEqualTo(Long value) {
            addCriterion("isize =", value, "isize");
            return (Criteria) this;
        }

        public Criteria andIsizeNotEqualTo(Long value) {
            addCriterion("isize <>", value, "isize");
            return (Criteria) this;
        }

        public Criteria andIsizeGreaterThan(Long value) {
            addCriterion("isize >", value, "isize");
            return (Criteria) this;
        }

        public Criteria andIsizeGreaterThanOrEqualTo(Long value) {
            addCriterion("isize >=", value, "isize");
            return (Criteria) this;
        }

        public Criteria andIsizeLessThan(Long value) {
            addCriterion("isize <", value, "isize");
            return (Criteria) this;
        }

        public Criteria andIsizeLessThanOrEqualTo(Long value) {
            addCriterion("isize <=", value, "isize");
            return (Criteria) this;
        }

        public Criteria andIsizeIn(List<Long> values) {
            addCriterion("isize in", values, "isize");
            return (Criteria) this;
        }

        public Criteria andIsizeNotIn(List<Long> values) {
            addCriterion("isize not in", values, "isize");
            return (Criteria) this;
        }

        public Criteria andIsizeBetween(Long value1, Long value2) {
            addCriterion("isize between", value1, value2, "isize");
            return (Criteria) this;
        }

        public Criteria andIsizeNotBetween(Long value1, Long value2) {
            addCriterion("isize not between", value1, value2, "isize");
            return (Criteria) this;
        }

        public Criteria andItypeIsNull() {
            addCriterion("itype is null");
            return (Criteria) this;
        }

        public Criteria andItypeIsNotNull() {
            addCriterion("itype is not null");
            return (Criteria) this;
        }

        public Criteria andItypeEqualTo(String value) {
            addCriterion("itype =", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotEqualTo(String value) {
            addCriterion("itype <>", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeGreaterThan(String value) {
            addCriterion("itype >", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeGreaterThanOrEqualTo(String value) {
            addCriterion("itype >=", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeLessThan(String value) {
            addCriterion("itype <", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeLessThanOrEqualTo(String value) {
            addCriterion("itype <=", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeLike(String value) {
            addCriterion("itype like", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotLike(String value) {
            addCriterion("itype not like", value, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeIn(List<String> values) {
            addCriterion("itype in", values, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotIn(List<String> values) {
            addCriterion("itype not in", values, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeBetween(String value1, String value2) {
            addCriterion("itype between", value1, value2, "itype");
            return (Criteria) this;
        }

        public Criteria andItypeNotBetween(String value1, String value2) {
            addCriterion("itype not between", value1, value2, "itype");
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