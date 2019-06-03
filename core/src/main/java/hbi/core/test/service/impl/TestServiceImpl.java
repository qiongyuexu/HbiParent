package hbi.core.test.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import hbi.core.test.dto.Test;
import hbi.core.test.service.ITestService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl extends BaseServiceImpl<Test> implements ITestService{

}