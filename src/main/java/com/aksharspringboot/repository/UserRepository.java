package com.aksharspringboot.repository;


import com.aksharspringboot.model.TeacherVo;
import com.aksharspringboot.model.UserVo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserVo, ObjectId> {

  List<UserVo> findAllById(ObjectId id);

  List<UserVo> findByUsername(String username);
}
