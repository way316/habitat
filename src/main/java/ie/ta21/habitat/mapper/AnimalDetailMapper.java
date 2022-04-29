package ie.ta21.habitat.mapper;

import ie.ta21.habitat.entity.AnimalDetail;
import ie.ta21.habitat.entity.AnimalDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AnimalDetailMapper {
    int countByExample(AnimalDetailExample example);

    int deleteByExample(AnimalDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnimalDetail record);

    int insertSelective(AnimalDetail record);

    List<AnimalDetail> selectByExample(AnimalDetailExample example);

    AnimalDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnimalDetail record, @Param("example") AnimalDetailExample example);

    int updateByExample(@Param("record") AnimalDetail record, @Param("example") AnimalDetailExample example);

    int updateByPrimaryKeySelective(AnimalDetail record);

    int updateByPrimaryKey(AnimalDetail record);
}