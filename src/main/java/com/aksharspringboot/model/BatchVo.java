package com.aksharspringboot.model;

import com.aksharspringboot.utils.ObjectIdSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "batch_vo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatchVo {

    @Id
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId id;

    private String batchName;

    private List<String> lectureTimings;

    private String startData;

    private String endDate;

    private CourseVo courseVo;
}
