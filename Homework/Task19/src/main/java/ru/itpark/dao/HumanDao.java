package ru.itpark.dao;


import ru.itpark.models.Human;

import java.util.List;

public interface HumanDao extends CrudDao<Human> {
    List<Human> findAllByAge(int age);
}
