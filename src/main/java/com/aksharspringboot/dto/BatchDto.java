package com.aksharspringboot.dto;

import com.aksharspringboot.utils.ObjectIdSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatchDto {

    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId id;

    private String batchName;

    private String startDate;

    private String endDate;

    private String courseId;

    private String courseName;

    private String courseShortName;

}
