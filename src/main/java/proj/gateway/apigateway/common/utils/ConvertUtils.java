package proj.gateway.apigateway.common.utils;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Component;

/**
 * 공통 데이터 변환 객체
 */
@Component
public class ConvertUtils {

  public static String objectToJsonString(Map<String, Object> params) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    String jsonParams = mapper.writeValueAsString(params);

    return jsonParams;
  }
}
