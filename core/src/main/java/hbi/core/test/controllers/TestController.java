package hbi.core.test.controllers;

import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.test.dto.Test;
import hbi.core.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import java.util.List;

    @Controller
    public class TestController extends BaseController{

    @Autowired
    private ITestService service;


    @RequestMapping(value = "/z/test/query")
    @ResponseBody
    public ResponseData query(Test dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/z/test/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<Test> dto, BindingResult result, HttpServletRequest request){
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        //根据ID是否存在，判断使用add还是update
        for (int i=0; i< dto.size(); i++) {
            if (dto.get(i).getId() != null && !"".equals(dto.get(i).getId())) {
                dto.get(i).set__status("update");
            } else {
                dto.get(i).set__status("add");
            }
        }
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/z/test/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<Test> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
    }