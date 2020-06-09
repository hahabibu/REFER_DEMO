package cn.shop.service.impl;

import cn.shop.model.Manager;
import cn.shop.mapper.ManagerMapper;
import cn.shop.service.ManagerService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author 
 * @since 2020-06-10
 */
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager> implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public List<Manager> getManagerByPage() {
        return managerMapper.selectList(null);
    }
}
