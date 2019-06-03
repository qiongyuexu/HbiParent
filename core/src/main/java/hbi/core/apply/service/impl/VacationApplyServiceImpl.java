package hbi.core.apply.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import hbi.core.apply.dto.VacationApply;
import hbi.core.apply.service.IVacationApplyService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class VacationApplyServiceImpl extends BaseServiceImpl<VacationApply> implements IVacationApplyService{

}