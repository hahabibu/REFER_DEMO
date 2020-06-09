package cn.shop.service;

import cn.shop.model.Manager;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 管理员表 服务类
 * </p>
 *
 * @author 
 * @since 2020-06-10
 */
public interface ManagerService extends IService<Manager> {

    public List<Manager> getManagerByPage();

}
