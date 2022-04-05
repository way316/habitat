package ie.ta21.habitat.entity;

import java.util.ArrayList;
import java.util.List;

public class CleanDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CleanDataExample() {
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

        public Criteria andDataresourceuidIsNull() {
            addCriterion("dataResourceUid is null");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidIsNotNull() {
            addCriterion("dataResourceUid is not null");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidEqualTo(String value) {
            addCriterion("dataResourceUid =", value, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidNotEqualTo(String value) {
            addCriterion("dataResourceUid <>", value, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidGreaterThan(String value) {
            addCriterion("dataResourceUid >", value, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidGreaterThanOrEqualTo(String value) {
            addCriterion("dataResourceUid >=", value, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidLessThan(String value) {
            addCriterion("dataResourceUid <", value, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidLessThanOrEqualTo(String value) {
            addCriterion("dataResourceUid <=", value, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidLike(String value) {
            addCriterion("dataResourceUid like", value, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidNotLike(String value) {
            addCriterion("dataResourceUid not like", value, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidIn(List<String> values) {
            addCriterion("dataResourceUid in", values, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidNotIn(List<String> values) {
            addCriterion("dataResourceUid not in", values, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidBetween(String value1, String value2) {
            addCriterion("dataResourceUid between", value1, value2, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andDataresourceuidNotBetween(String value1, String value2) {
            addCriterion("dataResourceUid not between", value1, value2, "dataresourceuid");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldIsNull() {
            addCriterion("informationWithheld is null");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldIsNotNull() {
            addCriterion("informationWithheld is not null");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldEqualTo(String value) {
            addCriterion("informationWithheld =", value, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldNotEqualTo(String value) {
            addCriterion("informationWithheld <>", value, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldGreaterThan(String value) {
            addCriterion("informationWithheld >", value, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldGreaterThanOrEqualTo(String value) {
            addCriterion("informationWithheld >=", value, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldLessThan(String value) {
            addCriterion("informationWithheld <", value, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldLessThanOrEqualTo(String value) {
            addCriterion("informationWithheld <=", value, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldLike(String value) {
            addCriterion("informationWithheld like", value, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldNotLike(String value) {
            addCriterion("informationWithheld not like", value, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldIn(List<String> values) {
            addCriterion("informationWithheld in", values, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldNotIn(List<String> values) {
            addCriterion("informationWithheld not in", values, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldBetween(String value1, String value2) {
            addCriterion("informationWithheld between", value1, value2, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andInformationwithheldNotBetween(String value1, String value2) {
            addCriterion("informationWithheld not between", value1, value2, "informationwithheld");
            return (Criteria) this;
        }

        public Criteria andIndividualcountIsNull() {
            addCriterion("individualCount is null");
            return (Criteria) this;
        }

        public Criteria andIndividualcountIsNotNull() {
            addCriterion("individualCount is not null");
            return (Criteria) this;
        }

        public Criteria andIndividualcountEqualTo(String value) {
            addCriterion("individualCount =", value, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountNotEqualTo(String value) {
            addCriterion("individualCount <>", value, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountGreaterThan(String value) {
            addCriterion("individualCount >", value, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountGreaterThanOrEqualTo(String value) {
            addCriterion("individualCount >=", value, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountLessThan(String value) {
            addCriterion("individualCount <", value, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountLessThanOrEqualTo(String value) {
            addCriterion("individualCount <=", value, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountLike(String value) {
            addCriterion("individualCount like", value, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountNotLike(String value) {
            addCriterion("individualCount not like", value, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountIn(List<String> values) {
            addCriterion("individualCount in", values, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountNotIn(List<String> values) {
            addCriterion("individualCount not in", values, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountBetween(String value1, String value2) {
            addCriterion("individualCount between", value1, value2, "individualcount");
            return (Criteria) this;
        }

        public Criteria andIndividualcountNotBetween(String value1, String value2) {
            addCriterion("individualCount not between", value1, value2, "individualcount");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(String value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(String value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(String value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(String value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(String value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(String value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLike(String value) {
            addCriterion("day like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotLike(String value) {
            addCriterion("day not like", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<String> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<String> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(String value1, String value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(String value1, String value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIsNull() {
            addCriterion("stateProvince is null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIsNotNull() {
            addCriterion("stateProvince is not null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceEqualTo(String value) {
            addCriterion("stateProvince =", value, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNotEqualTo(String value) {
            addCriterion("stateProvince <>", value, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceGreaterThan(String value) {
            addCriterion("stateProvince >", value, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("stateProvince >=", value, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceLessThan(String value) {
            addCriterion("stateProvince <", value, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceLessThanOrEqualTo(String value) {
            addCriterion("stateProvince <=", value, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceLike(String value) {
            addCriterion("stateProvince like", value, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNotLike(String value) {
            addCriterion("stateProvince not like", value, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIn(List<String> values) {
            addCriterion("stateProvince in", values, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNotIn(List<String> values) {
            addCriterion("stateProvince not in", values, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceBetween(String value1, String value2) {
            addCriterion("stateProvince between", value1, value2, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNotBetween(String value1, String value2) {
            addCriterion("stateProvince not between", value1, value2, "stateprovince");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeIsNull() {
            addCriterion("decimalLatitude is null");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeIsNotNull() {
            addCriterion("decimalLatitude is not null");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeEqualTo(String value) {
            addCriterion("decimalLatitude =", value, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeNotEqualTo(String value) {
            addCriterion("decimalLatitude <>", value, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeGreaterThan(String value) {
            addCriterion("decimalLatitude >", value, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("decimalLatitude >=", value, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeLessThan(String value) {
            addCriterion("decimalLatitude <", value, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeLessThanOrEqualTo(String value) {
            addCriterion("decimalLatitude <=", value, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeLike(String value) {
            addCriterion("decimalLatitude like", value, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeNotLike(String value) {
            addCriterion("decimalLatitude not like", value, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeIn(List<String> values) {
            addCriterion("decimalLatitude in", values, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeNotIn(List<String> values) {
            addCriterion("decimalLatitude not in", values, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeBetween(String value1, String value2) {
            addCriterion("decimalLatitude between", value1, value2, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallatitudeNotBetween(String value1, String value2) {
            addCriterion("decimalLatitude not between", value1, value2, "decimallatitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeIsNull() {
            addCriterion("decimalLongitude is null");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeIsNotNull() {
            addCriterion("decimalLongitude is not null");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeEqualTo(String value) {
            addCriterion("decimalLongitude =", value, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeNotEqualTo(String value) {
            addCriterion("decimalLongitude <>", value, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeGreaterThan(String value) {
            addCriterion("decimalLongitude >", value, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("decimalLongitude >=", value, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeLessThan(String value) {
            addCriterion("decimalLongitude <", value, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeLessThanOrEqualTo(String value) {
            addCriterion("decimalLongitude <=", value, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeLike(String value) {
            addCriterion("decimalLongitude like", value, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeNotLike(String value) {
            addCriterion("decimalLongitude not like", value, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeIn(List<String> values) {
            addCriterion("decimalLongitude in", values, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeNotIn(List<String> values) {
            addCriterion("decimalLongitude not in", values, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeBetween(String value1, String value2) {
            addCriterion("decimalLongitude between", value1, value2, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andDecimallongitudeNotBetween(String value1, String value2) {
            addCriterion("decimalLongitude not between", value1, value2, "decimallongitude");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumIsNull() {
            addCriterion("geodeticDatum is null");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumIsNotNull() {
            addCriterion("geodeticDatum is not null");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumEqualTo(String value) {
            addCriterion("geodeticDatum =", value, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumNotEqualTo(String value) {
            addCriterion("geodeticDatum <>", value, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumGreaterThan(String value) {
            addCriterion("geodeticDatum >", value, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumGreaterThanOrEqualTo(String value) {
            addCriterion("geodeticDatum >=", value, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumLessThan(String value) {
            addCriterion("geodeticDatum <", value, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumLessThanOrEqualTo(String value) {
            addCriterion("geodeticDatum <=", value, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumLike(String value) {
            addCriterion("geodeticDatum like", value, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumNotLike(String value) {
            addCriterion("geodeticDatum not like", value, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumIn(List<String> values) {
            addCriterion("geodeticDatum in", values, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumNotIn(List<String> values) {
            addCriterion("geodeticDatum not in", values, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumBetween(String value1, String value2) {
            addCriterion("geodeticDatum between", value1, value2, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andGeodeticdatumNotBetween(String value1, String value2) {
            addCriterion("geodeticDatum not between", value1, value2, "geodeticdatum");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersIsNull() {
            addCriterion("coordinateUncertaintyInMeters is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersIsNotNull() {
            addCriterion("coordinateUncertaintyInMeters is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersEqualTo(String value) {
            addCriterion("coordinateUncertaintyInMeters =", value, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersNotEqualTo(String value) {
            addCriterion("coordinateUncertaintyInMeters <>", value, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersGreaterThan(String value) {
            addCriterion("coordinateUncertaintyInMeters >", value, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersGreaterThanOrEqualTo(String value) {
            addCriterion("coordinateUncertaintyInMeters >=", value, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersLessThan(String value) {
            addCriterion("coordinateUncertaintyInMeters <", value, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersLessThanOrEqualTo(String value) {
            addCriterion("coordinateUncertaintyInMeters <=", value, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersLike(String value) {
            addCriterion("coordinateUncertaintyInMeters like", value, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersNotLike(String value) {
            addCriterion("coordinateUncertaintyInMeters not like", value, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersIn(List<String> values) {
            addCriterion("coordinateUncertaintyInMeters in", values, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersNotIn(List<String> values) {
            addCriterion("coordinateUncertaintyInMeters not in", values, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersBetween(String value1, String value2) {
            addCriterion("coordinateUncertaintyInMeters between", value1, value2, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andCoordinateuncertaintyinmetersNotBetween(String value1, String value2) {
            addCriterion("coordinateUncertaintyInMeters not between", value1, value2, "coordinateuncertaintyinmeters");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeIsNull() {
            addCriterion("verbatimLatitude is null");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeIsNotNull() {
            addCriterion("verbatimLatitude is not null");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeEqualTo(String value) {
            addCriterion("verbatimLatitude =", value, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeNotEqualTo(String value) {
            addCriterion("verbatimLatitude <>", value, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeGreaterThan(String value) {
            addCriterion("verbatimLatitude >", value, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("verbatimLatitude >=", value, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeLessThan(String value) {
            addCriterion("verbatimLatitude <", value, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeLessThanOrEqualTo(String value) {
            addCriterion("verbatimLatitude <=", value, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeLike(String value) {
            addCriterion("verbatimLatitude like", value, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeNotLike(String value) {
            addCriterion("verbatimLatitude not like", value, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeIn(List<String> values) {
            addCriterion("verbatimLatitude in", values, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeNotIn(List<String> values) {
            addCriterion("verbatimLatitude not in", values, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeBetween(String value1, String value2) {
            addCriterion("verbatimLatitude between", value1, value2, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlatitudeNotBetween(String value1, String value2) {
            addCriterion("verbatimLatitude not between", value1, value2, "verbatimlatitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeIsNull() {
            addCriterion("verbatimLongitude is null");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeIsNotNull() {
            addCriterion("verbatimLongitude is not null");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeEqualTo(String value) {
            addCriterion("verbatimLongitude =", value, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeNotEqualTo(String value) {
            addCriterion("verbatimLongitude <>", value, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeGreaterThan(String value) {
            addCriterion("verbatimLongitude >", value, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("verbatimLongitude >=", value, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeLessThan(String value) {
            addCriterion("verbatimLongitude <", value, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeLessThanOrEqualTo(String value) {
            addCriterion("verbatimLongitude <=", value, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeLike(String value) {
            addCriterion("verbatimLongitude like", value, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeNotLike(String value) {
            addCriterion("verbatimLongitude not like", value, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeIn(List<String> values) {
            addCriterion("verbatimLongitude in", values, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeNotIn(List<String> values) {
            addCriterion("verbatimLongitude not in", values, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeBetween(String value1, String value2) {
            addCriterion("verbatimLongitude between", value1, value2, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andVerbatimlongitudeNotBetween(String value1, String value2) {
            addCriterion("verbatimLongitude not between", value1, value2, "verbatimlongitude");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidIsNull() {
            addCriterion("taxonConceptID is null");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidIsNotNull() {
            addCriterion("taxonConceptID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidEqualTo(String value) {
            addCriterion("taxonConceptID =", value, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidNotEqualTo(String value) {
            addCriterion("taxonConceptID <>", value, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidGreaterThan(String value) {
            addCriterion("taxonConceptID >", value, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidGreaterThanOrEqualTo(String value) {
            addCriterion("taxonConceptID >=", value, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidLessThan(String value) {
            addCriterion("taxonConceptID <", value, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidLessThanOrEqualTo(String value) {
            addCriterion("taxonConceptID <=", value, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidLike(String value) {
            addCriterion("taxonConceptID like", value, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidNotLike(String value) {
            addCriterion("taxonConceptID not like", value, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidIn(List<String> values) {
            addCriterion("taxonConceptID in", values, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidNotIn(List<String> values) {
            addCriterion("taxonConceptID not in", values, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidBetween(String value1, String value2) {
            addCriterion("taxonConceptID between", value1, value2, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andTaxonconceptidNotBetween(String value1, String value2) {
            addCriterion("taxonConceptID not between", value1, value2, "taxonconceptid");
            return (Criteria) this;
        }

        public Criteria andScientificnameIsNull() {
            addCriterion("scientificName is null");
            return (Criteria) this;
        }

        public Criteria andScientificnameIsNotNull() {
            addCriterion("scientificName is not null");
            return (Criteria) this;
        }

        public Criteria andScientificnameEqualTo(String value) {
            addCriterion("scientificName =", value, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameNotEqualTo(String value) {
            addCriterion("scientificName <>", value, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameGreaterThan(String value) {
            addCriterion("scientificName >", value, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameGreaterThanOrEqualTo(String value) {
            addCriterion("scientificName >=", value, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameLessThan(String value) {
            addCriterion("scientificName <", value, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameLessThanOrEqualTo(String value) {
            addCriterion("scientificName <=", value, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameLike(String value) {
            addCriterion("scientificName like", value, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameNotLike(String value) {
            addCriterion("scientificName not like", value, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameIn(List<String> values) {
            addCriterion("scientificName in", values, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameNotIn(List<String> values) {
            addCriterion("scientificName not in", values, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameBetween(String value1, String value2) {
            addCriterion("scientificName between", value1, value2, "scientificname");
            return (Criteria) this;
        }

        public Criteria andScientificnameNotBetween(String value1, String value2) {
            addCriterion("scientificName not between", value1, value2, "scientificname");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(String value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(String value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(String value) {
            addCriterion("order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(String value) {
            addCriterion("order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(String value) {
            addCriterion("order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(String value) {
            addCriterion("order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLike(String value) {
            addCriterion("order like", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotLike(String value) {
            addCriterion("order not like", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<String> values) {
            addCriterion("order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<String> values) {
            addCriterion("order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(String value1, String value2) {
            addCriterion("order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(String value1, String value2) {
            addCriterion("order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNull() {
            addCriterion("family is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNotNull() {
            addCriterion("family is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyEqualTo(String value) {
            addCriterion("family =", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotEqualTo(String value) {
            addCriterion("family <>", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThan(String value) {
            addCriterion("family >", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("family >=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThan(String value) {
            addCriterion("family <", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThanOrEqualTo(String value) {
            addCriterion("family <=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLike(String value) {
            addCriterion("family like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotLike(String value) {
            addCriterion("family not like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyIn(List<String> values) {
            addCriterion("family in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotIn(List<String> values) {
            addCriterion("family not in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyBetween(String value1, String value2) {
            addCriterion("family between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotBetween(String value1, String value2) {
            addCriterion("family not between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andGenusIsNull() {
            addCriterion("genus is null");
            return (Criteria) this;
        }

        public Criteria andGenusIsNotNull() {
            addCriterion("genus is not null");
            return (Criteria) this;
        }

        public Criteria andGenusEqualTo(String value) {
            addCriterion("genus =", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotEqualTo(String value) {
            addCriterion("genus <>", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusGreaterThan(String value) {
            addCriterion("genus >", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusGreaterThanOrEqualTo(String value) {
            addCriterion("genus >=", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLessThan(String value) {
            addCriterion("genus <", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLessThanOrEqualTo(String value) {
            addCriterion("genus <=", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLike(String value) {
            addCriterion("genus like", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotLike(String value) {
            addCriterion("genus not like", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusIn(List<String> values) {
            addCriterion("genus in", values, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotIn(List<String> values) {
            addCriterion("genus not in", values, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusBetween(String value1, String value2) {
            addCriterion("genus between", value1, value2, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotBetween(String value1, String value2) {
            addCriterion("genus not between", value1, value2, "genus");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipIsNull() {
            addCriterion("scientificNameAuthorship is null");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipIsNotNull() {
            addCriterion("scientificNameAuthorship is not null");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipEqualTo(String value) {
            addCriterion("scientificNameAuthorship =", value, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipNotEqualTo(String value) {
            addCriterion("scientificNameAuthorship <>", value, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipGreaterThan(String value) {
            addCriterion("scientificNameAuthorship >", value, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipGreaterThanOrEqualTo(String value) {
            addCriterion("scientificNameAuthorship >=", value, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipLessThan(String value) {
            addCriterion("scientificNameAuthorship <", value, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipLessThanOrEqualTo(String value) {
            addCriterion("scientificNameAuthorship <=", value, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipLike(String value) {
            addCriterion("scientificNameAuthorship like", value, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipNotLike(String value) {
            addCriterion("scientificNameAuthorship not like", value, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipIn(List<String> values) {
            addCriterion("scientificNameAuthorship in", values, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipNotIn(List<String> values) {
            addCriterion("scientificNameAuthorship not in", values, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipBetween(String value1, String value2) {
            addCriterion("scientificNameAuthorship between", value1, value2, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andScientificnameauthorshipNotBetween(String value1, String value2) {
            addCriterion("scientificNameAuthorship not between", value1, value2, "scientificnameauthorship");
            return (Criteria) this;
        }

        public Criteria andVernacularnameIsNull() {
            addCriterion("vernacularName is null");
            return (Criteria) this;
        }

        public Criteria andVernacularnameIsNotNull() {
            addCriterion("vernacularName is not null");
            return (Criteria) this;
        }

        public Criteria andVernacularnameEqualTo(String value) {
            addCriterion("vernacularName =", value, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameNotEqualTo(String value) {
            addCriterion("vernacularName <>", value, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameGreaterThan(String value) {
            addCriterion("vernacularName >", value, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameGreaterThanOrEqualTo(String value) {
            addCriterion("vernacularName >=", value, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameLessThan(String value) {
            addCriterion("vernacularName <", value, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameLessThanOrEqualTo(String value) {
            addCriterion("vernacularName <=", value, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameLike(String value) {
            addCriterion("vernacularName like", value, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameNotLike(String value) {
            addCriterion("vernacularName not like", value, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameIn(List<String> values) {
            addCriterion("vernacularName in", values, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameNotIn(List<String> values) {
            addCriterion("vernacularName not in", values, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameBetween(String value1, String value2) {
            addCriterion("vernacularName between", value1, value2, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVernacularnameNotBetween(String value1, String value2) {
            addCriterion("vernacularName not between", value1, value2, "vernacularname");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordIsNull() {
            addCriterion("verbatimBasisOfRecord is null");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordIsNotNull() {
            addCriterion("verbatimBasisOfRecord is not null");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordEqualTo(String value) {
            addCriterion("verbatimBasisOfRecord =", value, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordNotEqualTo(String value) {
            addCriterion("verbatimBasisOfRecord <>", value, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordGreaterThan(String value) {
            addCriterion("verbatimBasisOfRecord >", value, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordGreaterThanOrEqualTo(String value) {
            addCriterion("verbatimBasisOfRecord >=", value, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordLessThan(String value) {
            addCriterion("verbatimBasisOfRecord <", value, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordLessThanOrEqualTo(String value) {
            addCriterion("verbatimBasisOfRecord <=", value, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordLike(String value) {
            addCriterion("verbatimBasisOfRecord like", value, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordNotLike(String value) {
            addCriterion("verbatimBasisOfRecord not like", value, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordIn(List<String> values) {
            addCriterion("verbatimBasisOfRecord in", values, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordNotIn(List<String> values) {
            addCriterion("verbatimBasisOfRecord not in", values, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordBetween(String value1, String value2) {
            addCriterion("verbatimBasisOfRecord between", value1, value2, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andVerbatimbasisofrecordNotBetween(String value1, String value2) {
            addCriterion("verbatimBasisOfRecord not between", value1, value2, "verbatimbasisofrecord");
            return (Criteria) this;
        }

        public Criteria andSpeciesIsNull() {
            addCriterion("species is null");
            return (Criteria) this;
        }

        public Criteria andSpeciesIsNotNull() {
            addCriterion("species is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciesEqualTo(String value) {
            addCriterion("species =", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesNotEqualTo(String value) {
            addCriterion("species <>", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesGreaterThan(String value) {
            addCriterion("species >", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesGreaterThanOrEqualTo(String value) {
            addCriterion("species >=", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesLessThan(String value) {
            addCriterion("species <", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesLessThanOrEqualTo(String value) {
            addCriterion("species <=", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesLike(String value) {
            addCriterion("species like", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesNotLike(String value) {
            addCriterion("species not like", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesIn(List<String> values) {
            addCriterion("species in", values, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesNotIn(List<String> values) {
            addCriterion("species not in", values, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesBetween(String value1, String value2) {
            addCriterion("species between", value1, value2, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesNotBetween(String value1, String value2) {
            addCriterion("species not between", value1, value2, "species");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNull() {
            addCriterion("recordID is null");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNotNull() {
            addCriterion("recordID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordidEqualTo(String value) {
            addCriterion("recordID =", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotEqualTo(String value) {
            addCriterion("recordID <>", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThan(String value) {
            addCriterion("recordID >", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThanOrEqualTo(String value) {
            addCriterion("recordID >=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThan(String value) {
            addCriterion("recordID <", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThanOrEqualTo(String value) {
            addCriterion("recordID <=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLike(String value) {
            addCriterion("recordID like", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotLike(String value) {
            addCriterion("recordID not like", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidIn(List<String> values) {
            addCriterion("recordID in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotIn(List<String> values) {
            addCriterion("recordID not in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidBetween(String value1, String value2) {
            addCriterion("recordID between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotBetween(String value1, String value2) {
            addCriterion("recordID not between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameIsNull() {
            addCriterion("verbatimScientificName is null");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameIsNotNull() {
            addCriterion("verbatimScientificName is not null");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameEqualTo(String value) {
            addCriterion("verbatimScientificName =", value, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameNotEqualTo(String value) {
            addCriterion("verbatimScientificName <>", value, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameGreaterThan(String value) {
            addCriterion("verbatimScientificName >", value, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameGreaterThanOrEqualTo(String value) {
            addCriterion("verbatimScientificName >=", value, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameLessThan(String value) {
            addCriterion("verbatimScientificName <", value, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameLessThanOrEqualTo(String value) {
            addCriterion("verbatimScientificName <=", value, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameLike(String value) {
            addCriterion("verbatimScientificName like", value, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameNotLike(String value) {
            addCriterion("verbatimScientificName not like", value, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameIn(List<String> values) {
            addCriterion("verbatimScientificName in", values, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameNotIn(List<String> values) {
            addCriterion("verbatimScientificName not in", values, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameBetween(String value1, String value2) {
            addCriterion("verbatimScientificName between", value1, value2, "verbatimscientificname");
            return (Criteria) this;
        }

        public Criteria andVerbatimscientificnameNotBetween(String value1, String value2) {
            addCriterion("verbatimScientificName not between", value1, value2, "verbatimscientificname");
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