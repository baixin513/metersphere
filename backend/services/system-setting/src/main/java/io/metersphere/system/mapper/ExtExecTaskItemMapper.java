package io.metersphere.system.mapper;

import io.metersphere.system.dto.sdk.BasePageRequest;
import io.metersphere.system.dto.taskhub.TaskHubDTO;
import io.metersphere.system.dto.taskhub.TaskHubItemDTO;
import io.metersphere.system.dto.taskhub.request.TaskHubItemRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wx
 */
public interface ExtExecTaskItemMapper {
    List<TaskHubItemDTO> selectList(@Param("request") TaskHubItemRequest request, @Param("orgId") String orgId, @Param("projectId") String projectId);
}