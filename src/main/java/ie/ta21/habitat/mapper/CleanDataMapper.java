package ie.ta21.habitat.mapper;

import java.util.List;

import ie.ta21.habitat.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CleanDataMapper {
    int countByExample(CleanDataExample example);

    int deleteByExample(CleanDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CleanData record);

    int insertSelective(CleanData record);

    List<CleanData> selectByExample(CleanDataExample example);

    CleanData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CleanData record, @Param("example") CleanDataExample example);

    int updateByExample(@Param("record") CleanData record, @Param("example") CleanDataExample example);

    int updateByPrimaryKeySelective(CleanData record);

    int updateByPrimaryKey(CleanData record);

    List<String> selectNames();

    List<Coordinates> getCoordinatesByName(String name);

    List<String> getAnimalByCoordinates(String latitude, String longitude);

    List<Coordinates> getNearbyHabitat(String latitude, String longitude, String animalName);
}