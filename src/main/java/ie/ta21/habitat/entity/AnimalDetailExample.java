package ie.ta21.habitat.entity;

import java.util.ArrayList;
import java.util.List;

public class AnimalDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimalDetailExample() {
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

        public Criteria andVernacularNameIsNull() {
            addCriterion("vernacular_name is null");
            return (Criteria) this;
        }

        public Criteria andVernacularNameIsNotNull() {
            addCriterion("vernacular_name is not null");
            return (Criteria) this;
        }

        public Criteria andVernacularNameEqualTo(String value) {
            addCriterion("vernacular_name =", value, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameNotEqualTo(String value) {
            addCriterion("vernacular_name <>", value, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameGreaterThan(String value) {
            addCriterion("vernacular_name >", value, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameGreaterThanOrEqualTo(String value) {
            addCriterion("vernacular_name >=", value, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameLessThan(String value) {
            addCriterion("vernacular_name <", value, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameLessThanOrEqualTo(String value) {
            addCriterion("vernacular_name <=", value, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameLike(String value) {
            addCriterion("vernacular_name like", value, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameNotLike(String value) {
            addCriterion("vernacular_name not like", value, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameIn(List<String> values) {
            addCriterion("vernacular_name in", values, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameNotIn(List<String> values) {
            addCriterion("vernacular_name not in", values, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameBetween(String value1, String value2) {
            addCriterion("vernacular_name between", value1, value2, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andVernacularNameNotBetween(String value1, String value2) {
            addCriterion("vernacular_name not between", value1, value2, "vernacularName");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionIsNull() {
            addCriterion("brief_description is null");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionIsNotNull() {
            addCriterion("brief_description is not null");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionEqualTo(String value) {
            addCriterion("brief_description =", value, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionNotEqualTo(String value) {
            addCriterion("brief_description <>", value, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionGreaterThan(String value) {
            addCriterion("brief_description >", value, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("brief_description >=", value, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionLessThan(String value) {
            addCriterion("brief_description <", value, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionLessThanOrEqualTo(String value) {
            addCriterion("brief_description <=", value, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionLike(String value) {
            addCriterion("brief_description like", value, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionNotLike(String value) {
            addCriterion("brief_description not like", value, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionIn(List<String> values) {
            addCriterion("brief_description in", values, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionNotIn(List<String> values) {
            addCriterion("brief_description not in", values, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionBetween(String value1, String value2) {
            addCriterion("brief_description between", value1, value2, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andBriefDescriptionNotBetween(String value1, String value2) {
            addCriterion("brief_description not between", value1, value2, "briefDescription");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBiologyIsNull() {
            addCriterion("biology is null");
            return (Criteria) this;
        }

        public Criteria andBiologyIsNotNull() {
            addCriterion("biology is not null");
            return (Criteria) this;
        }

        public Criteria andBiologyEqualTo(String value) {
            addCriterion("biology =", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotEqualTo(String value) {
            addCriterion("biology <>", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyGreaterThan(String value) {
            addCriterion("biology >", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyGreaterThanOrEqualTo(String value) {
            addCriterion("biology >=", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyLessThan(String value) {
            addCriterion("biology <", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyLessThanOrEqualTo(String value) {
            addCriterion("biology <=", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyLike(String value) {
            addCriterion("biology like", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotLike(String value) {
            addCriterion("biology not like", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyIn(List<String> values) {
            addCriterion("biology in", values, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotIn(List<String> values) {
            addCriterion("biology not in", values, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyBetween(String value1, String value2) {
            addCriterion("biology between", value1, value2, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotBetween(String value1, String value2) {
            addCriterion("biology not between", value1, value2, "biology");
            return (Criteria) this;
        }

        public Criteria andHabitatIsNull() {
            addCriterion("habitat is null");
            return (Criteria) this;
        }

        public Criteria andHabitatIsNotNull() {
            addCriterion("habitat is not null");
            return (Criteria) this;
        }

        public Criteria andHabitatEqualTo(String value) {
            addCriterion("habitat =", value, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatNotEqualTo(String value) {
            addCriterion("habitat <>", value, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatGreaterThan(String value) {
            addCriterion("habitat >", value, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatGreaterThanOrEqualTo(String value) {
            addCriterion("habitat >=", value, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatLessThan(String value) {
            addCriterion("habitat <", value, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatLessThanOrEqualTo(String value) {
            addCriterion("habitat <=", value, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatLike(String value) {
            addCriterion("habitat like", value, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatNotLike(String value) {
            addCriterion("habitat not like", value, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatIn(List<String> values) {
            addCriterion("habitat in", values, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatNotIn(List<String> values) {
            addCriterion("habitat not in", values, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatBetween(String value1, String value2) {
            addCriterion("habitat between", value1, value2, "habitat");
            return (Criteria) this;
        }

        public Criteria andHabitatNotBetween(String value1, String value2) {
            addCriterion("habitat not between", value1, value2, "habitat");
            return (Criteria) this;
        }

        public Criteria andNativeStatusIsNull() {
            addCriterion("native_status is null");
            return (Criteria) this;
        }

        public Criteria andNativeStatusIsNotNull() {
            addCriterion("native_status is not null");
            return (Criteria) this;
        }

        public Criteria andNativeStatusEqualTo(String value) {
            addCriterion("native_status =", value, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusNotEqualTo(String value) {
            addCriterion("native_status <>", value, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusGreaterThan(String value) {
            addCriterion("native_status >", value, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("native_status >=", value, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusLessThan(String value) {
            addCriterion("native_status <", value, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusLessThanOrEqualTo(String value) {
            addCriterion("native_status <=", value, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusLike(String value) {
            addCriterion("native_status like", value, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusNotLike(String value) {
            addCriterion("native_status not like", value, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusIn(List<String> values) {
            addCriterion("native_status in", values, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusNotIn(List<String> values) {
            addCriterion("native_status not in", values, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusBetween(String value1, String value2) {
            addCriterion("native_status between", value1, value2, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andNativeStatusNotBetween(String value1, String value2) {
            addCriterion("native_status not between", value1, value2, "nativeStatus");
            return (Criteria) this;
        }

        public Criteria andDietIsNull() {
            addCriterion("diet is null");
            return (Criteria) this;
        }

        public Criteria andDietIsNotNull() {
            addCriterion("diet is not null");
            return (Criteria) this;
        }

        public Criteria andDietEqualTo(String value) {
            addCriterion("diet =", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotEqualTo(String value) {
            addCriterion("diet <>", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietGreaterThan(String value) {
            addCriterion("diet >", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietGreaterThanOrEqualTo(String value) {
            addCriterion("diet >=", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietLessThan(String value) {
            addCriterion("diet <", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietLessThanOrEqualTo(String value) {
            addCriterion("diet <=", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietLike(String value) {
            addCriterion("diet like", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotLike(String value) {
            addCriterion("diet not like", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietIn(List<String> values) {
            addCriterion("diet in", values, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotIn(List<String> values) {
            addCriterion("diet not in", values, "diet");
            return (Criteria) this;
        }

        public Criteria andDietBetween(String value1, String value2) {
            addCriterion("diet between", value1, value2, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotBetween(String value1, String value2) {
            addCriterion("diet not between", value1, value2, "diet");
            return (Criteria) this;
        }

        public Criteria andColoursIsNull() {
            addCriterion("colours is null");
            return (Criteria) this;
        }

        public Criteria andColoursIsNotNull() {
            addCriterion("colours is not null");
            return (Criteria) this;
        }

        public Criteria andColoursEqualTo(String value) {
            addCriterion("colours =", value, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursNotEqualTo(String value) {
            addCriterion("colours <>", value, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursGreaterThan(String value) {
            addCriterion("colours >", value, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursGreaterThanOrEqualTo(String value) {
            addCriterion("colours >=", value, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursLessThan(String value) {
            addCriterion("colours <", value, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursLessThanOrEqualTo(String value) {
            addCriterion("colours <=", value, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursLike(String value) {
            addCriterion("colours like", value, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursNotLike(String value) {
            addCriterion("colours not like", value, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursIn(List<String> values) {
            addCriterion("colours in", values, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursNotIn(List<String> values) {
            addCriterion("colours not in", values, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursBetween(String value1, String value2) {
            addCriterion("colours between", value1, value2, "colours");
            return (Criteria) this;
        }

        public Criteria andColoursNotBetween(String value1, String value2) {
            addCriterion("colours not between", value1, value2, "colours");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNull() {
            addCriterion("distribution is null");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNotNull() {
            addCriterion("distribution is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionEqualTo(String value) {
            addCriterion("distribution =", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotEqualTo(String value) {
            addCriterion("distribution <>", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThan(String value) {
            addCriterion("distribution >", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThanOrEqualTo(String value) {
            addCriterion("distribution >=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThan(String value) {
            addCriterion("distribution <", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThanOrEqualTo(String value) {
            addCriterion("distribution <=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLike(String value) {
            addCriterion("distribution like", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotLike(String value) {
            addCriterion("distribution not like", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionIn(List<String> values) {
            addCriterion("distribution in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotIn(List<String> values) {
            addCriterion("distribution not in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionBetween(String value1, String value2) {
            addCriterion("distribution between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotBetween(String value1, String value2) {
            addCriterion("distribution not between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesIsNull() {
            addCriterion("\"habitat types\" is null");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesIsNotNull() {
            addCriterion("\"habitat types\" is not null");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesEqualTo(String value) {
            addCriterion("\"habitat types\" =", value, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesNotEqualTo(String value) {
            addCriterion("\"habitat types\" <>", value, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesGreaterThan(String value) {
            addCriterion("\"habitat types\" >", value, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesGreaterThanOrEqualTo(String value) {
            addCriterion("\"habitat types\" >=", value, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesLessThan(String value) {
            addCriterion("\"habitat types\" <", value, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesLessThanOrEqualTo(String value) {
            addCriterion("\"habitat types\" <=", value, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesLike(String value) {
            addCriterion("\"habitat types\" like", value, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesNotLike(String value) {
            addCriterion("\"habitat types\" not like", value, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesIn(List<String> values) {
            addCriterion("\"habitat types\" in", values, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesNotIn(List<String> values) {
            addCriterion("\"habitat types\" not in", values, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesBetween(String value1, String value2) {
            addCriterion("\"habitat types\" between", value1, value2, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andHabitatTypesNotBetween(String value1, String value2) {
            addCriterion("\"habitat types\" not between", value1, value2, "habitatTypes");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesIsNull() {
            addCriterion("commercial_species is null");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesIsNotNull() {
            addCriterion("commercial_species is not null");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesEqualTo(String value) {
            addCriterion("commercial_species =", value, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesNotEqualTo(String value) {
            addCriterion("commercial_species <>", value, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesGreaterThan(String value) {
            addCriterion("commercial_species >", value, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesGreaterThanOrEqualTo(String value) {
            addCriterion("commercial_species >=", value, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesLessThan(String value) {
            addCriterion("commercial_species <", value, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesLessThanOrEqualTo(String value) {
            addCriterion("commercial_species <=", value, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesLike(String value) {
            addCriterion("commercial_species like", value, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesNotLike(String value) {
            addCriterion("commercial_species not like", value, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesIn(List<String> values) {
            addCriterion("commercial_species in", values, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesNotIn(List<String> values) {
            addCriterion("commercial_species not in", values, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesBetween(String value1, String value2) {
            addCriterion("commercial_species between", value1, value2, "commercialSpecies");
            return (Criteria) this;
        }

        public Criteria andCommercialSpeciesNotBetween(String value1, String value2) {
            addCriterion("commercial_species not between", value1, value2, "commercialSpecies");
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