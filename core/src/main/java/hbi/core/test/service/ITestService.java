package hbi.core.test.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.test.dto.Test;

public interface ITestService extends IBaseService<Test>, ProxySelf<ITestService>{

}