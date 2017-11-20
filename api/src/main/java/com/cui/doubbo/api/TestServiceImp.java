package com.cui.doubbo.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.cui.doubbo.client.api.TestService;
import com.cui.doubbo.client.domain.Collage;
import com.cui.doubbo.client.utils.BaseResponseVo;

/**
 * Created by cjs
 * Date： 2017/11/20.
 * Time： 11:50.
 */
@Service(version = "1.0.0")
public class TestServiceImp implements TestService {
    @Override
    public String addCollage(Collage collage) {

        return "success";
    }
}
